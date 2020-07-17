package com.fishercoder.solutions;

import java.util.Arrays;

public class _611 {
    public static class Solution1 {
        /**
         * Rule: among three sides, we need to find whether the longest of the three is smaller than the sum of the two shorter one.
         * If so, then these three could form a valid triangle.
         */

        public int triangleNumber(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            Arrays.sort(nums);
            int triplets = 0;
            for (int i = 2; i < nums.length; i++) {
                int left = 0;
                int right = i - 1;
                while (left < right) {
                    if (nums[i] < nums[left] + nums[right]) {
                        triplets += (right - left);
                        right--;
                    } else {
                        left++;
                    }
                }
            }
            return triplets;
        }
    }

}
