package com.fishercoder.solutions;

public class _2201 {
    public static class Solution1 {
        public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
            int ans = 0;
            boolean[][] grid = new boolean[n][n];
            for (int[] d : dig) {
                grid[d[0]][d[01]] = true;
            }
            for (int[] arti : artifacts) {
                int r0 = arti[0];
                int c0 = arti[1];
                boolean cannotUnearth = false;
                for (int r = r0; r <= arti[2]; r++) {
                    for (int c = c0; c <= arti[3]; c++) {
                        if (!grid[r][c]) {
                            cannotUnearth = true;
                            break;
                        }
                    }
                    if (cannotUnearth) {
                        break;
                    }
                }
                if (!cannotUnearth) {
                    ans++;
                }
            }
            return ans;
        }
    }
}
