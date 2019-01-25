package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 356. Line Reflection
 *
 * Given n points on a 2D plane, find if there is such a line parallel to y-axis that reflect the given points.

 Example 1:
 Given points = [[1,1],[-1,1]], return true.

 Example 2:
 Given points = [[1,1],[-1,-1]], return false.

 Follow up:
 Could you do better than O(n2)?

 Hint:

 Find the smallest and largest x-value for all points.
 If there is a line then it should be at y = (minX + maxX) / 2.
 For each point, make sure that it has a reflected point in the opposite side.
 */
public class _356 {
    public static class Solution1 {
        /** credit: https://discuss.leetcode.com/topic/48172/simple-java-hashset-solution */
        public boolean isReflected(int[][] points) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            Set<String> set = new HashSet<>();
            for (int[] point : points) {
                max = Math.max(max, point[0]);
                min = Math.min(min, point[0]);
                String str = point[0] + "a" + point[1];
                set.add(str);
            }
            int sum = max + min;
            for (int[] p : points) {
                String str = (sum - p[0]) + "a" + p[1];
                if (!set.contains(str)) {
                    return false;
                }
            }
            return true;
        }
    }
}
