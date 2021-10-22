package com.fishercoder.solutions;

public class _11 {
    public static class Solution1 {
        /**
         * Time: O(n^2)
         * This brute force solution is NOT accepted on LeetCode due to TLE.
         */
        public int maxArea(int[] height) {
            int maxArea = 0;
            for (int left = 0; left < height.length - 1; left++) {
                for (int right = height.length - 1; left < right; right--) {
                    int area = (right - left) * Math.min(height[left], height[right]);
                    maxArea = Math.max(maxArea, area);
                }
            }
            return maxArea;
        }
    }

    public static class Solution2 {
        /**
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
                    /**if this height is shorter, then we'll need to move it to the right to find a higher one so that it's possible to find a larger area.*/
                    left++;
                } else {
                    right--;
                }
            }
            return max;
        }
    }

}
