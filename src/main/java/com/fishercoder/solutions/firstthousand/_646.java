package com.fishercoder.solutions.firstthousand;

import java.util.Arrays;

public class _646 {
    /*
     * Although this problem could be solved using DP, greedy is more efficient in both time and space complexity.
     */
    public static class Solution1 {
        /*
         * credit: https://leetcode.com/problems/maximum-length-of-pair-chain/editorial/
         */
        public int findLongestChain(int[][] pairs) {
            // sort by the second element
            Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
            int ans = 0;
            int prev = Integer.MIN_VALUE;
            for (int[] pair : pairs) {
                if (pair[0] > prev) {
                    ans++;
                    prev = pair[1];
                }
            }
            return ans;
        }
    }

    public static class Solution2 {
        /*
         * credit: https://leetcode.com/problems/maximum-length-of-pair-chain/discuss/105623/Java-Very-Simple-without-DP
         */
        public int findLongestChain(int[][] pairs) {
            // sort by the first element
            Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
            int len = 0;
            int pre = Integer.MIN_VALUE;
            for (int[] pair : pairs) {
                if (pair[0] > pre) {
                    // no overlap
                    len++;
                    // so we need to update the previous number to be the end of current pair:
                    // pair[1]
                    pre = pair[1];
                } else if (pair[1] < pre) {
                    // overlap but with a smaller second number
                    // since we want to find the maximum possible chain, so we update pre to be this
                    // smaller number
                    // this means we decided to adopt this pair to be in this chain and give up the
                    // previous one
                    // this logic can be seen clearly in test3 for this class
                    pre = pair[1];
                }
            }
            return len;
        }
    }
}
