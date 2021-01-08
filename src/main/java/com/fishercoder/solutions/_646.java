package com.fishercoder.solutions;

import java.util.Arrays;

public class _646 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/96804/java-o-nlog-n-time-o-1-space
         */
        public int findLongestChain(int[][] pairs) {
            Arrays.sort(pairs, (o1, o2) -> o1[1] - o2[1]);
            int result = 0;
            int n = pairs.length;
            int i = -1;
            while (++i < n) {
                result++;
                int curEnd = pairs[i][1];
                while (i + 1 < n && pairs[i + 1][0] <= curEnd) {
                    /**This means, we'll keep incrementing i until pairs[i+1][0] is
                     * exactly greater than curEnd.*/
                    i++;
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/maximum-length-of-pair-chain/discuss/105623/Java-Very-Simple-without-DP
         */
        public int findLongestChain(int[][] pairs) {
            Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
            int len = 0;
            int pre = Integer.MIN_VALUE;
            for (int[] pair : pairs) {
                if (pair[0] > pre) {
                    //not overlap
                    len++;
                    pre = pair[1];
                } else if (pair[1] < pre) {
                    //overlap but with a smaller second number
                    pre = pair[1];
                }
            }
            return len;
        }
    }

}