package com.fishercoder.solutions;

import com.fishercoder.common.classes.Point;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _587 {
    public static class Solution1 {

        /**
         * credit: https://discuss.leetcode.com/topic/89323/java-solution-convex-hull-algorithm-gift-wrapping-aka-jarvis-march
         * There are couple of ways to solve Convex Hull problem. https://en.wikipedia.org/wiki/Convex_hull_algorithms
         * The following code implements Gift wrapping aka Jarvis march algorithm
         * https://en.wikipedia.org/wiki/Gift_wrapping_algorithm and
         * also added logic to handle case of multiple Points in a line
         * because original Jarvis march algorithm assumes no three points are collinear.
         * It also uses knowledge in this problem https://leetcode.com/problems/convex-polygon.
         * Disscussion: https://discuss.leetcode.com/topic/70706/beyond-my-knowledge-java-solution-with-in-line-explanation
         */
        public List<Point> outerTrees(Point[] points) {
            Set<Point> result = new HashSet<>();

            // Find the leftmost point
            Point first = points[0];
            int firstIndex = 0;
            for (int i = 1; i < points.length; i++) {
                if (points[i].x < first.x) {
                    first = points[i];
                    firstIndex = i;
                }
            }
            result.add(first);

            Point cur = first;
            int curIndex = firstIndex;
            do {
                Point next = points[0];
                int nextIndex = 0;
                for (int i = 1; i < points.length; i++) {
                    if (i == curIndex) {
                        continue;
                    }
                    int cross = crossProductLength(cur, points[i], next);
                    if (nextIndex == curIndex || cross > 0
                            // Handle collinear points
                            || (cross == 0 && distance(points[i], cur) > distance(next, cur))) {
                        next = points[i];
                        nextIndex = i;
                    }
                }
                // Handle collinear points
                for (int i = 0; i < points.length; i++) {
                    if (i == curIndex) {
                        continue;
                    }
                    int cross = crossProductLength(cur, points[i], next);
                    if (cross == 0) {
                        result.add(points[i]);
                    }
                }

                cur = next;
                curIndex = nextIndex;

            } while (curIndex != firstIndex);

            return new ArrayList<>(result);
        }

        private int crossProductLength(Point A, Point B, Point C) {
            // Get the vectors' coordinates.
            int BAx = A.x - B.x;
            int BAy = A.y - B.y;
            int BCx = C.x - B.x;
            int BCy = C.y - B.y;

            // Calculate the Z coordinate of the cross product.
            return (BAx * BCy - BAy * BCx);
        }

        private int distance(Point p1, Point p2) {
            return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
        }
    }

}
