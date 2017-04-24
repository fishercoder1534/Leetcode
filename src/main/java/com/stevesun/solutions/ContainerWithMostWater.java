package com.stevesun.solutions;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

 Note: You may not slant the container and n is at least 2.
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int len = height.length;
        int i = 0, j = len - 1;
        while (i < j) {
            if (Math.min(height[i], height[j]) * (j - i) > max) {
                max = Math.min(height[i], height[j]) * (j - i);
            }
            if (height[i] <= height[j]) {// we need to find the shorter one,
                // then calculate its area
                i++;
            } else {
                j--;
            }
        }
        return max;
    }

}
