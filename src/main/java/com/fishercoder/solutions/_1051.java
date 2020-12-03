package com.fishercoder.solutions;

import java.util.Arrays;

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
