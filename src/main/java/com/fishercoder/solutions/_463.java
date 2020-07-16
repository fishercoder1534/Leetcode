package com.fishercoder.solutions;

public class _463 {

    public static class Solution1 {
        /**
         * Inspired by this post: https://discuss.leetcode.com/topic/68983/java-9-line-solution-add-4-for-each-land-and-remove-2-for-each-internal-edge
         * 1. we increment the count by 4 whenever we encounter an island
         * 2. also, we check in two directions: island's left and island's top, we only check these two directions,
         * see if this island has any island neighbors, if so, we'll deduct two from it.
         */
        public int islandPerimeter(int[][] grid) {
            int count = 0;
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        count += 4;
                        if (i > 0 && grid[i - 1][j] == 1) {
                            count -= 2;
                        }
                        if (j > 0 && grid[i][j - 1] == 1) {
                            count -= 2;
                        }
                    }
                }
            }
            return count;
        }
    }
}
