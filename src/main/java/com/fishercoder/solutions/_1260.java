package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 1260. Shift 2D Grid
 *
 * Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
 *
 * In one shift operation:
 * Element at grid[i][j] becomes at grid[i][j + 1].
 * Element at grid[i][n - 1] becomes at grid[i + 1][0].
 * Element at grid[n - 1][n - 1] becomes at grid[0][0].
 * Return the 2D grid after applying shift operation k times.
 *
 * Example 1:
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
 * Output: [[9,1,2],[3,4,5],[6,7,8]]
 *
 * Example 2:
 * Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
 * Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
 *
 * Example 3:
 * Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
 * Output: [[1,2,3],[4,5,6],[7,8,9]]
 *
 * Constraints:
 * m == grid.length
 * n == grid[i].length
 * 1 <= m <= 50
 * 1 <= n <= 50
 * -1000 <= grid[i][j] <= 1000
 * 0 <= k <= 100
 * */
public class _1260 {
    public static class Solution1 {
        /**credit: https://leetcode.com/problems/shift-2d-grid/discuss/431102/JavaPython-3-simple-code-using-mod*/
        public List<List<Integer>> shiftGrid(int[][] grid, int k) {
            int m = grid.length;
            int n = grid[0].length;
            int totalNumbers = m * n;
            int start = totalNumbers - k % totalNumbers;
            LinkedList<List<Integer>> result = new LinkedList<>();
            for (int i = start; i < totalNumbers + start; i++) {
                int moveIndex = i % totalNumbers;
                int moveRow = moveIndex / n;
                int moveColumn = moveIndex % n;
                if ((i - start) % n == 0) {
                    result.add(new ArrayList<>());
                }
                result.peekLast().add(grid[moveRow][moveColumn]);
            }
            return result;
        }
    }
}
