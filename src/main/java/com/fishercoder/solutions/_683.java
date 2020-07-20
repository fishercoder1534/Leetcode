package com.fishercoder.solutions;

public class _683 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/104771/java-c-simple-o-n-solution
         */
        public int kEmptySlots(int[] flowers, int k) {
            int[] days = new int[flowers.length];
            for (int i = 0; i < flowers.length; i++) {
                days[flowers[i] - 1] = i + 1;
            }
            int left = 0;
            int right = k + 1;
            int result = Integer.MAX_VALUE;
            for (int i = 0; right < flowers.length; i++) {
                if (days[i] < days[left] || days[i] <= days[right]) {
                    if (i == right) {
                        result = Math.min(result, Math.max(days[left], days[right]));
                    }
                    left = i;
                    right = k + 1 + i;
                }
            }
            return result == Integer.MAX_VALUE ? -1 : result;
        }
    }
}
