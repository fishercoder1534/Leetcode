package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 1033. Moving Stones Until Consecutive
 *
 * Three stones are on a number line at positions a, b, and c.
 *
 * Each turn, you pick up a stone at an endpoint (ie., either the lowest or highest position stone),
 * and move it to an unoccupied position between those endpoints.
 * Formally, let's say the stones are currently at positions x, y, z with x < y < z.
 * You pick up the stone at either position x or position z, and move that stone to an integer position k, with x < k < z and k != y.
 *
 * The game ends when you cannot make any more moves, ie. the stones are in consecutive positions.
 *
 * When the game ends, what is the minimum and maximum number of moves that you could have made?
 * Return the answer as an length 2 array: answer = [minimum_moves, maximum_moves]
 *
 * Note:
 *  * 1 <= a <= 100
 *  *  1 <= b <= 100
 *  *  1 <= c <= 100
 *  *  a != b, b != c, c != a
 */

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
