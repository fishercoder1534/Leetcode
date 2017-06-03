package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

/** Given a set of distinct integers, nums, return all possible subsets.

 Note: The solution set must not contain duplicate subsets.

 For example,
 If nums = [1,2,3], a solution is:

 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 */

public class Subsets {

    public static void main(String...strings){
//        int[] nums = new int[]{1,2,3};
        int[] nums = new int[]{1,2,2};
        List<List<Integer>> result = subsets_backtracking(nums);
        CommonUtils.printListList(result);
    }
    
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        List<Integer> empty = new ArrayList();
        result.add(empty);
        if(nums == null) return result;
        for(int i = 0; i < nums.length; i++){
            List<List<Integer>> temp = new ArrayList();//you'll have to create a new one here, otherwise, it'll throw ConcurrentModificationException.
            for(List<Integer> list : result){
                List<Integer> newList = new ArrayList(list);
                newList.add(nums[i]);
                temp.add(newList);
            }
            result.addAll(temp);
        }
        return result;
    }
    
    /**this post: https://discuss.leetcode.com/topic/46159/a-general-approach-to-backtracking-questions-in-java-subsets-permutations-combination-sum-palindrome-partitioning
     * is really cool!*/
    public static List<List<Integer>> subsets_backtracking(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        backtracking(result, new ArrayList(), nums, 0);
        return result;
    }

    private static void backtracking(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        //ATTN: you'll have to make a new list here before entering the for loop
        result.add(new ArrayList(temp));
        for(int i = start; i < nums.length; i++){
            if(i != start && nums[i] == nums[i-1]) continue;//add this line here to skip duplicates for Subsets II
            temp.add(nums[i]);
            backtracking(result, temp, nums, i+1);
            temp.remove(temp.size()-1);
        }
    }
}
