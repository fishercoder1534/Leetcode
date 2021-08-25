package com.fishercoder.solutions;

public class _268 {

    public static class Solution1 {
        /**
         * we could take advantage of the array indices
         * then a number xor with itself is zero, so after we xor the entire array with all of its indices, the missing number will show up.
         */
        public int missingNumber(int[] nums) {
            int xor = 0;
            int i = 0;
            for (; i < nums.length; i++) {
                xor ^= i ^ nums[i];
            }
            return xor ^ i;
        }
    }

}
