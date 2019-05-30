package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 1051. Height Checker
 *
 * Students are asked to stand in non-decreasing order of heights for an annual photo.
 * Return the minimum number of students not standing in the right positions.
 * (This is the number of students that must move in order for all students to be standing in non-decreasing order of height.)
 *
 * Example 1:
 * Input: [1,1,4,2,1,3]
 * Output: 3
 * Explanation:
 * Students with heights 4, 3 and the last 1 are not standing in the right positions.
 *
 * Note:
 *
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 * */
public class _1051 {
    public static class Solution1 {
        public int heightChecker(int[] heights) {
            int[] originals = Arrays.copyOf(heights, heights.length);
            Arrays.sort(heights);
            int count = 0;
            for (int i = 0; i < originals.length; i++) {
                if (heights[i] != originals[i]) {
                    count++;
                }
            }
            return count;
        }
    }
}
