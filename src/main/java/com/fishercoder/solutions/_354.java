package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 354. Russian Doll Envelopes
 *
 * You have a number of envelopes with widths and heights given as a pair of integers (w, h).
 * One envelope can fit into another if and only if both the width and height of one envelope is greater than
 * the width and height of the other envelope.

 What is the maximum number of envelopes can you Russian doll? (put one inside other)

 Example:
 Given envelopes = [[5,4],[6,4],[6,7],[2,3]], the maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] => [6,7]).

 */
public class _354 {
    public static class Solution1 {
        /** reference: https://discuss.leetcode.com/topic/47469/java-nlogn-solution-with-explanation */
        public int maxEnvelopes(int[][] envelopes) {
            if (envelopes == null || envelopes.length == 0
                || envelopes[0].length == 0 || envelopes[0].length != 2) {
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
