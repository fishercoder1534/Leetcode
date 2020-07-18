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

}