package com.fishercoder.solutions.firstthousand;

import java.util.Arrays;

public class _268 {

    public static class Solution1 {
        public int missingNumber(int[] nums) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (i != nums[i]) {
                    return i;
                }
            }
            return nums.length;
        }
    }

    public static class Solution2 {
        /**
         * we could take advantage of the array indices
         * then a number xor with itself is zero, so after we xor the entire array with all of its indices, the missing number will show up.
         */
        public int missingNumber(int[] nums) {
            int missing = 0;
            int i = 0;
            for (; i < nums.length; i++) {
                missing ^= i ^ nums[i];
            }
            return missing ^ i;
        }
    }

    public static class Solution3 {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            long sum = n + (n * n - n) / 2; // this is the formula to compute the sum for arithmetic
            // sequence
            for (int i = 0; i < nums.length; i++) {
                sum -= nums[i];
            }
            return (int) sum;
        }
    }
}
