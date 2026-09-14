package com.fishercoder.solutions.fourththousand;

public class _3996 {
    public static class Solution1 {
        /**
         * Although it looks like a graph traversal or Breadth-First Search (BFS) problem, this can
         * be solved in $O(1)$ time and $O(1)$ space using a simple math/parity property of
         * chessboards.
         *
         * <p>The Core InsightEvery valid knight move changes the coordinate sum $x + y$ by an odd
         * amount (since it moves $\pm 1$ in one direction and $\pm 2$ in the other, meaning the sum
         * changes by either $1+2=3$ or $-1-2=-3$, or a mix). Because the change is always odd,
         * every single move flips the parity of $x + y$ (similar to moving between a black square
         * and a white square on a chessboard). Therefore:After an even number of moves, the knight
         * must land on a square with the same parity of $x + y$ as where it started.After an odd
         * number of moves, it lands on a square with the opposite parity.Thus, you only need to
         * check if the sum of the start coordinates and the target coordinates have the same
         * remainder when divided by 2.
         */
        public boolean canReach(int[] start, int[] target) {
            return (start[0] + start[1]) % 2 == (target[0] + target[1]) % 2;
        }
    }
}
