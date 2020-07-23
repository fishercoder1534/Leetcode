package com.fishercoder.solutions;

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
