package com.fishercoder.solutions;

public class _3185 {
    public static class Solution1 {
        public long countCompleteDayPairs(int[] hours) {
            int[] remainderCounts = new int[24];
            long pairs = 0L;
            for (int hour : hours) {
                int remainder = hour % 24;
                int complement = (24 - remainder) % 24;
                pairs += remainderCounts[complement];
                remainderCounts[remainder]++;
            }
            return pairs;
        }
    }
}
