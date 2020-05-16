package com.fishercoder.solutions;

public class _1446 {
    public static class Solution1 {
        public int maxPower(String s) {
            int max = 0;
            for (int i = 0; i < s.length(); i++) {
                int start = i;
                while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                    i++;
                }
                max = Math.max(max, i - start + 1);
            }
            return max;
        }
    }
}
