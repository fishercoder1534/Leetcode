package com.fishercoder.solutions.secondthousand;

public class _1664 {
    public static class Solution1 {
        public int waysToMakeFair(int[] nums) {
            int n = nums.length;
            long[] oddPrefixSums = new long[nums.length];
            long[] evenPrefixSums = new long[nums.length];
            evenPrefixSums[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (i % 2 == 0) {
                    evenPrefixSums[i] = evenPrefixSums[i - 1] + nums[i];
                    oddPrefixSums[i] = oddPrefixSums[i - 1];
                } else {
                    oddPrefixSums[i] = nums[i] + oddPrefixSums[i - 1];
                    evenPrefixSums[i] = evenPrefixSums[i - 1];
                }
            }
            int ans = 0;
            for (int i = 0; i < nums.length; i++) {
                // 1. Sums strictly to the LEFT of index i (indices remain unchanged)
                long leftOdd = (i == 0) ? 0 : oddPrefixSums[i - 1];
                long leftEven = (i == 0) ? 0 : evenPrefixSums[i - 1];

                // 2. Sums strictly to the RIGHT of index i (indices shift left by 1, flipping parity)
                // Elements that were originally EVEN become ODD, and vice versa
                long rightEvenBecomingOdd = evenPrefixSums[n - 1] - evenPrefixSums[i];
                long rightOddBecomingEven = oddPrefixSums[n - 1] - oddPrefixSums[i];

                long oddSum = leftOdd + rightEvenBecomingOdd;
                long evenSum = leftEven + rightOddBecomingEven;

                if (oddSum == evenSum) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
