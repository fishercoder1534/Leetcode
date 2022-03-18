package com.fishercoder.solutions;

import java.util.Arrays;

public class _259 {

    public static class Solution1 {
        /**
         * Basically, very similar to 3Sum, but the key is that you'll have to add result by (right-left), not just increment result by 1!
         */
        public int threeSumSmaller(int[] nums, int target) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int result = 0;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum < target) {
                        result += right - left;//this line is key!
                        left++;//then increment left to continue to see all possibilities
                    } else {
                        right--;
                    }
                }
            }
            return result;
        }
    }
}
