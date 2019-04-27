package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1010. Pairs of Songs With Total Durations Divisible by 60
 *
 * In a list of songs, the i-th song has a duration of time[i] seconds.
 *
 * Return the number of pairs of songs for which their total duration in seconds is divisible by 60.
 * Formally, we want the number of indices i < j with (time[i] + time[j]) % 60 == 0.
 *
 * Example 1:
 * Input: [30,20,150,100,40]
 * Output: 3
 * Explanation: Three pairs have a total duration divisible by 60:
 * (time[0] = 30, time[2] = 150): total duration 180
 * (time[1] = 20, time[3] = 100): total duration 120
 * (time[1] = 20, time[4] = 40): total duration 60
 *
 * Example 2:
 * Input: [60,60,60]
 * Output: 3
 * Explanation: All three pairs have a total duration of 120, which is divisible by 60.
 *
 * Note:
 *
 * 1 <= time.length <= 60000
 * 1 <= time[i] <= 500
 * */
public class _1010 {
    public static class Solution1 {
        /**Credit: https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/discuss/256726/Java-O(n)-code-w-comment-similar-to-Two-Sum
         *
         * Think of Problem 1: Two Sum
         * Assume target is 60, each item in time % 60.
         * Then this problem becomes very similar to Problem 1.
         * */
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
}
