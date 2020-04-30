package com.fishercoder.solutions;

public class _42 {

    public static class Solution1 {
        /**
         * O(n) time and O(1) space, awesome!
         *
         * 1. first scan to find the max height index
         * 2. then scan from left up to max index and find all the water units up to the max height
         * 3. then scan from right down to max index and find all the water units down to the max height
         * 4. return the sum of those above two
         *
         * reference: https://discuss.leetcode.com/topic/22976/my-accepted-java-solution
         */
        public int trap(int[] height) {
            if (height == null || height.length <= 2) {
                return 0;
            }

            int max = height[0];
            int maxIndex = 0;
            for (int i = 0; i < height.length; i++) {
                if (height[i] > max) {
                    max = height[i];
                    maxIndex = i;
                }
            }

            int water = 0;

            int leftMax = height[0];
            for (int i = 0; i < maxIndex; i++) {
                if (height[i] > leftMax) {
                    leftMax = height[i];
                } else {
                    water += leftMax - height[i];
                }
            }

            int rightMax = height[height.length - 1];
            for (int i = height.length - 1; i > maxIndex; i--) {
                if (height[i] > rightMax) {
                    rightMax = height[i];
                } else {
                    water += rightMax - height[i];
                }
            }

            return water;
        }
    }
}