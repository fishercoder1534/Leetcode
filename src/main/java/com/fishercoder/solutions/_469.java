package com.fishercoder.solutions;

import java.util.List;

public class _469 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/70706/beyond-my-knowledge-java-solution-with-in-line-explanation
         */
        public boolean isConvex(List<List<Integer>> points) {
            // For each set of three adjacent points A, B, C, find the cross product AB · BC. If the sign of
            // all the cross products is the same, the angles are all positive or negative (depending on the
            // order in which we visit them) so the polygon is convex.
            boolean gotNegative = false;
            boolean gotPositive = false;
            int numPoints = points.size();
            int B;
            int C;
            for (int A = 0; A < numPoints; A++) {
                // Trick to calc the last 3 points: n - 1, 0 and 1.
                B = (A + 1) % numPoints;
                C = (B + 1) % numPoints;

                int crossProduct =
                        crossProductLength(
                                points.get(A).get(0), points.get(A).get(1),
                                points.get(B).get(0), points.get(B).get(1),
                                points.get(C).get(0), points.get(C).get(1));
                if (crossProduct < 0) {
                    gotNegative = true;
                } else if (crossProduct > 0) {
                    gotPositive = true;
                }
                if (gotNegative && gotPositive) {
                    return false;
                }
            }

            // If we got this far, the polygon is convex.
            return true;
        }

        // Return the cross product AB x BC.
        // The cross product is a vector perpendicular to AB and BC having length |AB| * |BC| * Sin(theta) and
        // with direction given by the right-hand rule. For two vectors in the X-Y plane, the result is a
        // vector with X and Y components 0 so the Z component gives the vector's length and direction.
        private int crossProductLength(int Ax, int Ay, int Bx, int By, int Cx, int Cy) {
            // Get the vectors' coordinates.
            int BAx = Ax - Bx;
            int BAy = Ay - By;
            int BCx = Cx - Bx;
            int BCy = Cy - By;

            // Calculate the Z coordinate of the cross product.
            return (BAx * BCy - BAy * BCx);
        }
    }

}
