package com.fishercoder.solutions;

/**
 * 789. Escape The Ghosts
 *
 * You are playing a simplified Pacman game. You start at the point (0, 0), and your destination is
 * (target[0], target[1]). There are several ghosts on the map, the i-th ghost starts at (ghosts[i][0], ghosts[i][1]).
 *
 * Each turn, you and all ghosts simultaneously *may* move in one of 4 cardinal directions: north, east, west, or
 * south, going from the previous point to a new point 1 unit of distance away.
 *
 * You escape if and only if you can reach the target before any ghost reaches you (for any given moves the ghosts
 * may take.)  If you reach any square (including the target) at the same time as a ghost, it doesn't count as an
 * escape.
 *
 * Return True if and only if it is possible to escape.
 */

public class _789 {

    public static class Solution {
        public boolean escapeGhosts(int[][] ghosts, int[] target) {
            int[] currPos = {0, 0};
            int selfDist = getDist(currPos, target);

            for (int[] ghost : ghosts) {
                int ghostDist = getDist(ghost, target);
                if (ghostDist <= selfDist) {
                    return false;
                }
            }
            return true;
        }

        private int getDist(int[] p1, int[] p2) {
            return Math.abs(p1[0] - p2[0]) + Math.abs(p1[1] - p2[1]);
        }
    }
}
