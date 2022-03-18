package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1010 {
    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/discuss/256726/Java-O(n)-code-w-comment-similar-to-Two-Sum
         * <p>
         * Think of Problem 1: Two Sum
         * Assume target is 60, each item in time % 60.
         * Then this problem becomes very similar to Problem 1.
         */
        public int numPairsDivisibleBy60(int[] time) {
            int result = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int t : time) {
                int d = (60 - t % 60) % 60;
                if (map.containsKey(d)) {
                    result += map.get(d);
                }
                map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/solution/
         */
        public int numPairsDivisibleBy60(int[] time) {
            int[] remainders = new int[60];
            int ans = 0;
            for (int t : time) {
                if (t % 60 == 0) {
                    ans += remainders[0];
                } else {
                    ans += remainders[60 - t % 60];
                }
                remainders[t % 60]++;
            }
            return ans;
        }
    }
}
