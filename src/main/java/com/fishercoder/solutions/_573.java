package com.fishercoder.solutions;

public class _573 {

    public static class Solution1 {

        /**
         * reference: https://leetcode.com/articles/squirrel-simulation
         * <p>
         * 1. The order in which to pick the nuts does not matter except the first one
         * because for all the other nuts, the squirrel needs to travel back and forth.
         * <p>
         * 2. For the first nut to be picked, there's some distance we might be able to save, what is this distance?
         * It is the difference between the squirrel's original starting point to the first nut and that the distance from this
         * first nut to the tree.
         * This is because, only for the first nut, the squirrel does NOT need to travel back and forth, it only needs to travel from
         * its starting position to the nut position and then return to the tree.
         * <p>
         * 3. For the rest of all other nuts, the squirrel always needs to go back and forth.
         * <p>
         * 4. So how can we find the first nut to go to so that we could have the maximum saved distance?
         * We iterate through all of the nuts and keep updating the savedDist as below:
         */
        public int minDistance(int height, int width, int[] tree, int[] squirrel, int[][] nuts) {
            int totalDist = 0;
            int savedDist = Integer.MIN_VALUE;
            for (int[] nut : nuts) {
                totalDist += (getDist(nut, tree) * 2);//it needs to travel back and forth, so times two
                savedDist = Math.max(savedDist, getDist(nut, tree) - getDist(nut, squirrel));
            }
            return totalDist - savedDist;
        }

        private int getDist(int[] pointA, int[] pointB) {
            return Math.abs(pointA[0] - pointB[0]) + Math.abs(pointA[1] - pointB[1]);
        }
    }
}
