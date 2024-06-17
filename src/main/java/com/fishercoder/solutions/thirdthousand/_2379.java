package com.fishercoder.solutions.thirdthousand;

public class _2379 {
    public static class Solution1 {
        public int minimumRecolors(String blocks, int k) {
            int min = k;
            int left = 0;
            int right = 0;
            int recolors = 0;
            while (right - left < k) {
                if (blocks.charAt(right) == 'W') {
                    recolors++;
                }
                right++;
            }
            if (right - left == k) {
                min = Math.min(recolors, min);
            }
            while (right < blocks.length() && left < blocks.length() - k) {
                if (blocks.charAt(right) == 'W') {
                    recolors++;
                }
                right++;
                if (blocks.charAt(left) == 'W') {
                    recolors--;
                }
                left++;
                min = Math.min(recolors, min);
            }
            return min;
        }
    }
}
