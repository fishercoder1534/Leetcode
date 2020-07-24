package com.fishercoder.solutions;

public class _836 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/rectangle-overlap/discuss/132340/C%2B%2BJavaPython-1-line-Solution-1D-to-2D
         */
        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            return rec1[0] < rec2[2] && rec2[0] < rec1[2] && rec1[1] < rec2[3] && rec2[1] < rec1[3];
        }
    }
}
