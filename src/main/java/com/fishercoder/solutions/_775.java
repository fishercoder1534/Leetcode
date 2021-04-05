package com.fishercoder.solutions;

public class _775 {
    /**
     * credit: https://leetcode.com/problems/global-and-local-inversions/solution/
     */
    public static class Solution1 {
        /**
         * 1. a local inversion is also a global inversion;
         * 2. we only need to check if a this input has any non-local inversion, i.e. global inversions that are not local inversions
         * because local inversion is a subset of global inversions.
         * <p>
         * This one will result in TLE with a time complexity of O(n^2).
         */
        public boolean isIdealPermutation(int[] A) {
            for (int i = 0; i < A.length; i++) {
                for (int j = i + 2; j < A.length; j++) {
                    if (A[i] > A[j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static class Solution2 {
        /**
         * from the above solution, we can tell that if we can find the minimum of A[j] where j >= i + 2, then we could quickly return false, so two steps:
         * 1. remembering minimum
         * 2. scanning from right to left
         * <p>
         * Time: O(n)
         */
        public boolean isIdealPermutation(int[] A) {
            int min = A.length;
            for (int i = A.length - 1; i >= 2; i--) {
                min = Math.min(min, A[i]);
                if (A[i - 2] > min) {
                    return false;
                }
            }
            return true;
        }
    }
}
