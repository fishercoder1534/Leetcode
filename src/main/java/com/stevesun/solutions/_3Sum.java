package com.stevesun.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

 Note: The solution set must not contain duplicate triplets.

 For example, given array S = [-1, 0, 1, 2, -1, -4],

 A solution set is:
 [
 [-1, 0, 1],
 [-1, -1, 2]
 ]*/

public class _3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if(nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){//we can let i reach the last element, it's fine since we have other checks afterwards, it won't go out of bound exception.
            if(i >= 1 && nums[i] == nums[i-1]) continue;//skip equal elements to avoid duplicates
            int left = i+1, right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left +1 < right && nums[left] == nums[left+1]) left++;
                    while(right -1 > left && nums[right] == nums[right-1]) right--;
                    left++;//be sure to have these two lines after the above two while loops
                    right--;
                } else if(sum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
