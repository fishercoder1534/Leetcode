package com.fishercoder.solutions.fourththousand;

public class _3208 {
    public static class Solution1 {
        public int numberOfAlternatingGroups(int[] colors, int k) {
            int len = colors.length;
            int groups = 0;
            int i = 0;
            for (; i < len; i++) {
                int j = i + 1;
                for (; j < len + k - 1; j++) {
                    if (colors[j % len] == colors[(j - 1) % len]) {
                        break;
                    }
                    if (j - i + 1 >= k) {
                        groups++;
                    }
                }
                i = j - 1;
            }
            return groups;
        }
    }
}
