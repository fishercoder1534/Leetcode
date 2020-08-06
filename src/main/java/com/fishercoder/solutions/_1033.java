package com.fishercoder.solutions;

import java.util.Arrays;

public class _1033 {
    public static class Solution1 {
        private int minMoves(int x, int y, int z) {
            // already consecutive integers, nothing to be done
            if (x + 1 == y && y + 1 == z) {
                return 0;
            }
            // one of the following (sample) cases:
            // 1, 2, 8 (8 -> 3)
            // 1, 7, 8 (1 -> 6)
            // 1, 3, 8 (8 -> 2)
            // 1, 6, 8 (1 -> 7)
            if (y - x <= 2 || z - y <= 2) {
                return 1;
            }

            // move z to y + 1, x to y - 1
            return 2;
        }

        private int maxMoves(int x, int y, int z) {
            return z - x - 2;
        }

        public int[] numMovesStones(int a, int b, int c) {
            int[] t = {a, b, c};
            Arrays.sort(t);

            int min = minMoves(t[0], t[1], t[2]);
            int max = maxMoves(t[0], t[1], t[2]);

            return new int[]{min, max};
        }
    }
}
