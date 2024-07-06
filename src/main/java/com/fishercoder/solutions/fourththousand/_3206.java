package com.fishercoder.solutions.fourththousand;

public class _3206 {
    public static class Solution1 {
        public int numberOfAlternatingGroups(int[] colors) {
            int result = 0;
            int len = colors.length;
            for (int i = 0; i < len; i++) {
                if (i == 0) {
                    if (colors[i] != colors[len - 1] && colors[i] != colors[i + 1]) {
                        result++;
                    }
                } else if (i < len - 1) {
                    if (colors[i] != colors[i - 1] && colors[i] != colors[i + 1]) {
                        result++;
                    }
                } else {
                    if (colors[i] != colors[i - 1] && colors[i] != colors[0]) {
                        result++;
                    }
                }
            }
            return result;
        }
    }
}
