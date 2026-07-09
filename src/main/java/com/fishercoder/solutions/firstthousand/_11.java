package com.fishercoder.solutions.firstthousand;

public class _11 {
    public static class Solution1 {
        /*
         * Two pointer technique.
         * Well explained here: https://leetcode.com/problems/container-with-most-water/discuss/6100/Simple-and-clear-proofexplanation
         */
        public int maxArea(int[] height) {
            int max = 0;
            int left = 0;
            int right = height.length - 1;
            while (left < right) {
                max = Math.max(Math.min(height[left], height[right]) * (right - left), max);
                if (height[left] <= height[right]) {
                    /*if this height is shorter, then we'll need to move it to the right to find a higher one so that it's possible to find a larger area.*/
                    left++;
                } else {
                    right--;
                }
            }
            return max;
        }
    }
}
