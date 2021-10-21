package com.fishercoder.solutions;

import java.util.Arrays;

public class _16 {

    public static class Solution1 {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int sum = nums[0] + nums[1] + nums[2];
            for (int i = 0; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int thisSum = nums[i] + nums[left] + nums[right];
                    if (Math.abs(thisSum - target) < Math.abs(sum - target)) {
                        sum = thisSum;
                        if (sum == target) {
                            return sum;
                        }
                    } else if (target > thisSum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return sum;
        }
    }

}
