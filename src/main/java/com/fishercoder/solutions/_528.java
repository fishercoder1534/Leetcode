package com.fishercoder.solutions;

import java.util.Random;

public class _528 {
    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/random-pick-with-weight/editorial/
         * <p>
         * Mental gymnastics (which is explained step by step in the above link):
         * 1. picture this to be a ball throwing onto a line from the starting point (0,0);
         * 2. where this ball is going to land on the line is a probability problem, i.e. an offset to the starting point (0,0);
         * 3. we can use prefix sums array to simulate this line (each value in the array is positive as it represents the weight/probability of it being picked, so cannot be zero or negative);
         * 4. we can use Random() to generate a random number called index bounded by the last value of the prefix sums array, i.e. the biggest offset possible;
         * 5. then we can use binary search to find where this random number: index, would fit in the prefix sums array.
         */
        Random random;
        int[] prefixSums;

        public Solution1(int[] w) {
            this.random = new Random();
            this.prefixSums = new int[w.length];
            int prefixSum = 0;
            for (int i = 0; i < w.length; ++i) {
                prefixSum += w[i];
                prefixSums[i] = prefixSum;
            }
        }

        public int pickIndex() {
            int len = prefixSums.length;
            int idx = random.nextInt(prefixSums[len - 1]) + 1;
            int left = 0;
            int right = len - 1;
            // search position
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (prefixSums[mid] == idx) {
                    return mid;
                } else if (prefixSums[mid] < idx) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            return left;
        }
    }
}
