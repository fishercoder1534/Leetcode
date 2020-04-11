package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 149. Max Points on a Line
 *
 * Given n points on a 2D plane, find the maximum number of points that lie on the same straight line.
 *
 * Example 1:
 * Input: [[1,1],[2,2],[3,3]]
 * Output: 3
 * Explanation:
 * ^
 * |
 * |        o
 * |     o
 * |  o
 * +------------->
 * 0  1  2  3  4
 *
 * Example 2:
 * Input: [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
 * Output: 4
 * Explanation:
 * ^
 * |
 * |  o
 * |     o        o
 * |        o
 * |  o        o
 * +------------------->
 * 0  1  2  3  4  5  6
 *
 * NOTE: input types have been changed on April 15, 2019. Please reset to default code definition to get new method signature.
 */
public class _149 {

  /**
   * credits: https://leetcode.com/problems/max-points-on-a-line/discuss/328269/A-Java-solution-with-my-understanding
   */
  public static class Solution1 {
    public int maxPoints(int[][] points) {
      if (points.length < 3) return points.length;
      int max = 0;
      Map<Long, Integer> map = new HashMap<>();
      for (int i = 0; i < points.length; i++) {
        int dup = 1;
        map.clear();
        for (int j = i + 1; j < points.length; j++) {
          int dx = points[j][0] - points[i][0], dy = points[j][1] - points[i][1];
          if (dx == 0 && dy == 0) dup++;
          else {
            int gcd = getGcd(dx, dy);
            long slope = ((long) (dy / gcd) << 32) + (dx / gcd);
            map.put(slope, map.getOrDefault(slope, 0) + 1);
          }
        }
        max = Math.max(max, dup);
        for (Map.Entry<Long, Integer> entry : map.entrySet())
          max = Math.max(max, entry.getValue() + dup);
      }
      return max;
    }

    int getGcd(int a, int b) {
      return b == 0 ? a : getGcd(b, a % b);
    }
  }
}
