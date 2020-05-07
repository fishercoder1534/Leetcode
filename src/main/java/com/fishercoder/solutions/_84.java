package com.fishercoder.solutions;

import java.util.Stack;

public class _84 {

    public static class Solution1 {

        /**
         * credit: https://leetcode.com/articles/largest-rectangle-histogram/#approach-5-using-stack-accepted
         * and https://discuss.leetcode.com/topic/7599/o-n-stack-based-java-solution
         */
        public int largestRectangleArea(int[] heights) {
            int len = heights.length;
            Stack<Integer> s = new Stack<>();
            int maxArea = 0;
            for (int i = 0; i <= len; i++) {
                int h = (i == len ? 0 : heights[i]);
                if (s.isEmpty() || h >= heights[s.peek()]) {
                    s.push(i);
                } else {
                    int tp = s.pop();
                    maxArea = Math.max(maxArea, heights[tp] * (s.isEmpty() ? i : i - 1 - s.peek()));
                    i--;
                }
            }
            return maxArea;
        }
    }

}
