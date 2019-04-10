package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 447. Number of Boomerangs
 *
 * Given n points in the plane that are all pairwise distinct,
 * a "boomerang" is a tuple of points (i, j, k) such that the distance
 * between i and j equals the distance between i and k (the order of the tuple matters).
 *
 * Find the number of boomerangs.
 * You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

 Example:
 Input:
 [[0,0],[1,0],[2,0]]

 Output:
 2

 Explanation:
 The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]*/
public class _447 {

    public static class Solution1 {
        /**
         * Looked at these two posts: https://discuss.leetcode.com/topic/66587/clean-java-solution-o-n-2-166ms and
         * https://discuss.leetcode.com/topic/66521/share-my-straightforward-solution-with-hashmap-o-n-2, basically,
         * have a HashMap, key is the distance, value is the number of points that are this distance apart to this point.
         * Note: we clear up this map every time after we traverse one point with the rest of the other points.
         * <p>
         * Time complexity: O(n^2)
         * Space complexity: O(n)
         */

        public int numberOfBoomerangs(int[][] points) {
            int result = 0;
            if (points == null || points.length == 0 || points[0].length == 0) {
                return result;
            }
            int totalPts = points.length;
            Map<Long, Integer> map = new HashMap();
            for (int i = 0; i < totalPts; i++) {
                for (int j = 0; j < totalPts; j++) {
                    if (i == j) {
                        continue;
                    }
                    long d = calcDistance(points[i], points[j]);
                    map.put(d, map.getOrDefault(d, 0) + 1);
                }

                for (int val : map.values()) {
                    result += val * (val - 1);
                }
                map.clear();
            }
            return result;
        }

        private long calcDistance(int[] p1, int[] p2) {
            long x = p2[0] - p1[0];
            long y = p2[1] - p1[1];
            return x * x + y * y;
        }
    }

}