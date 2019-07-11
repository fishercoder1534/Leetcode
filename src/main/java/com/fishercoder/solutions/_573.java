package com.fishercoder.solutions;

/**
 * 573. Squirrel Simulation
 *
 * There's a tree, a squirrel, and several nuts.
 * Positions are represented by the cells in a 2D grid.
 * Your goal is to find the minimal distance for the squirrel to collect all the nuts and
 * put them under the tree one by one.
 * The squirrel can only take at most one nut at one time and can move in four directions -
 * up, down, left and right, to the adjacent cell.
 * The distance is represented by the number of moves.

 Example 1:

 Input:
 Height : 5
 Width : 7
 Tree position : [2,2]
 Squirrel : [4,4]
 Nuts : [[3,0], [2,5]]
 Output: 12

 Explanation:

 Note:

 All given positions won't overlap.
 The squirrel can take at most one nut at one time.
 The given positions of nuts have no order.
 Height and width are positive integers. 3 <= height * width <= 10,000.
 The given positions contain at least one nut, only one tree and one squirrel.
 */
public class _573 {

    public static class Solution1 {

        /**
         * reference: https://leetcode.com/articles/squirrel-simulation
         *
         * 1. The order in which to pick the nuts does not matter except the first one
         * because for all the other nuts, the squirrel needs to travel back and forth.
         *
         * 2. For the first nut to be picked, there's some distance we might be able to save, what is this distance?
         * It is the difference between the squirrel's original starting point to the first nut and that the distance from this
         * first nut to the tree.
         * This is because, only for the first nut, the squirrel does NOT need to travel back and forth, it only needs to travel from
         * its starting position to the nut position and then return to the tree.
         *
         * 3. For the rest of all other nuts, the squirrel always needs to go back and forth.
         *
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
