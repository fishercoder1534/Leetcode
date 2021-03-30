package com.fishercoder.solutions;

import java.util.Arrays;

public class _354 {
    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/47469/java-nlogn-solution-with-explanation
         */
        public int maxEnvelopes(int[][] envelopes) {
            if (envelopes == null || envelopes.length == 0 || envelopes[0].length == 0 || envelopes[0].length != 2) {
                return 0;
            }
            Arrays.sort(envelopes, (int[] a, int[] b) -> {
                        if (a[0] == b[0]) {
                            return b[1] - a[1];
                        } else {
                            return a[0] - b[0];
                        }
                    }
            );
            int[] dp = new int[envelopes.length];
            int len = 0;
            for (int[] envelope : envelopes) {
                int index = Arrays.binarySearch(dp, 0, len, envelope[1]);
                if (index < 0) {
                    index = -(index + 1);
                }
                dp[index] = envelope[1];
                if (index == len) {
                    len++;
                }
            }
            return len;
        }
    }
}
