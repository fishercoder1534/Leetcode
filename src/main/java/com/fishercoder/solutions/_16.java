package com.fishercoder.solutions;

import java.util.Arrays;

public class _16 {

    public static class Solution1 {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int len = nums.length;
            if (len < 3) {
                int sum = 0;
                for (int i : nums) {
                    sum += i;
                }
                return sum;
            }
            int sum = nums[0] + nums[1] + nums[2];
            for (int i = 0; i < len - 2; i++) {
                int left = i + 1;
                int right = len - 1;
                while (left < right) {
                    int thisSum = nums[i] + nums[left] + nums[right];
                    if (Math.abs(target - thisSum) < Math.abs(target - sum)) {
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
