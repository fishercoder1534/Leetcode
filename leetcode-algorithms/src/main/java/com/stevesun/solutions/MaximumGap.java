package com.stevesun.solutions;

import java.util.Arrays;

/**
 * Given an unsorted array, find the maximum difference between the successive elements in its sorted form.

 Try to solve it in linear time/space.

 Return 0 if the array contains less than 2 elements.

 You may assume all elements in the array are non-negative integers and fit in the 32-bit signed integer range.
 */
public class MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;

        Arrays.sort(nums);
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length;){
            while(i < nums.length && nums[i] == nums[i-1]){
                i++;
            }
            if(i == nums.length) {
                i--;
                max = (nums[i] - nums[i-1] > max) ? nums[i] - nums[i-1] : max;
                break;
            }
            else max = (nums[i] - nums[i-1] > max) ? nums[i] - nums[i-1] : max;
            if(nums[i] != nums[i-1]){
                i++;
            }
        }
        return max;
    }
}
