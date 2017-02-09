package com.stevesun.solutions;

import java.util.Arrays;

/**
 * Created by stevesun on 2/8/17.
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
