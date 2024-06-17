package com.fishercoder.solutions.thirdthousand;

public class _2496 {
    public static class Solution1 {
        public int maximumValue(String[] strs) {
            int max = 0;
            for (String str : strs) {
                try {
                    int num = Integer.parseInt(str);
                    max = Math.max(max, num);
                } catch (Exception e) {
                    max = Math.max(max, str.length());
                }
            }
            return max;
        }
    }
}
