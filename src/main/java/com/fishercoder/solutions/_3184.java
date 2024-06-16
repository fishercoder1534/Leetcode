package com.fishercoder.solutions;

public class _3184 {
    public static class Solution1 {
        public int countCompleteDayPairs(int[] hours) {
            int count = 0;
            for (int i = 0; i < hours.length - 1; i++) {
                for (int j = i + 1; j < hours.length; j++) {
                    if ((hours[i] + hours[j]) % 24 == 0) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}
