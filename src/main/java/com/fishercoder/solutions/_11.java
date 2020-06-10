package com.fishercoder.solutions;

public class _11 {
    public static class Solution1 {
        public int maxArea(int[] height) {
            int max = 0;
            int i = 0;
            int j = height.length - 1;
            while (i < j) {
                max = Math.max(Math.min(height[i], height[j]) * (j - i), max);
                if (height[i] <= height[j]) {
                    // we need to find the shorter one,
                    // then calculate its area
                    i++;
                } else {
                    j--;
                }
            }
            return max;
        }
    }

}
