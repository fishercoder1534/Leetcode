package com.fishercoder.solutions;

public class _2078 {
    public static class Solution1 {
        public int maxDistance(int[] colors) {
            int left = 0;
            int right = colors.length - 1;
            int max = 0;
            while (left < right) {
                if (colors[left] != colors[right]) {
                    max = Math.max(max, right - left);
                    break;
                } else {
                    left++;
                }
            }
            left = 0;
            while (left < right) {
                if (colors[left] != colors[right]) {
                    max = Math.max(max, right - left);
                    break;
                } else {
                    right--;
                }
            }
            return max;
        }
    }
}
