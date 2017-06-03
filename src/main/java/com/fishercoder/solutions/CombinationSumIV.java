package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**Given an integer array with all positive numbers and no duplicates, find the number of possible combinations that add up to a positive integer target.

 Example:

 nums = [1, 2, 3]
 target = 4

 The possible combination ways are:
 (1, 1, 1, 1)
 (1, 1, 2)
 (1, 2, 1)
 (1, 3)
 (2, 1, 1)
 (2, 2)
 (3, 1)

 Note that different sequences are counted as different combinations.

 Therefore the output is 7.
 Follow up:
 What if negative numbers are allowed in the given array?
 How does it change the problem?
 What limitation we need to add to the question to allow negative numbers?*/
public class CombinationSumIV {
    //since this question doesn't require to return all the combination result, instead, it just wants one number, we could use DP
    //the idea is similar to Climbing Stairs.
    //adopted this solution: https://discuss.leetcode.com/topic/52186/my-3ms-java-dp-solution
    public int combinationSum4(int[] nums, int target){
        Arrays.sort(nums);
        int[] result = new int[target+1];
        for(int i = 1; i < result.length; i++){
            for(int n : nums){
                if(n > target) break;
                else if(n == target) result[i] ++;
                else result[i] += result[i-n];
            }
        }
        return result[target];
    }
    
    //this normal backtracking recursive solution will end up in TLE.
    public List<List<Integer>> combinationSum4_printout(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        backtracking(0, nums, target, new ArrayList(), result);
        return result;
    }

    private void backtracking(int start, int[] nums, int target, ArrayList temp,
            List<List<Integer>> result) {
        if(target == 0){
            List<Integer> newTemp = new ArrayList(temp);
            result.add(newTemp);
        } else if(target > 0){
            for(int i = start; i < nums.length; i++){
                temp.add(nums[i]);
                backtracking(i, nums, target-nums[i], temp, result);
                temp.remove(temp.size()-1);
            }
        }
    }
    
    public static void main(String...strings){
        CombinationSumIV test = new CombinationSumIV();
        int[] nums = new int[]{1,2,3};
        int target = 4;
        CommonUtils.printListList(test.combinationSum4_printout(nums, target));
    }
}
