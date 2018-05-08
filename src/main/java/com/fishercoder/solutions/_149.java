package com.fishercoder.solutions;

import com.fishercoder.common.classes.Point;
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
 */
public class _149 {

  public static class Solution1 {
    /** credit: https://leetcode.com/problems/max-points-on-a-line/discuss/47113/A-java-solution-with-notes */
    public int maxPoints(Point[] points) {
      if (points == null) {
        return 0;
      }
      if (points.length <= 2) {
        return points.length;
      }

      Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
      int result = 0;
      for (int i = 0; i < points.length; i++) {
        map.clear();
        int overlap = 0;
        int max = 0;
        for (int j = i + 1; j < points.length; j++) {
          int x = points[j].x - points[i].x;
          int y = points[j].y - points[i].y;
          if (x == 0 && y == 0) {
            overlap++;
            continue;
          }
          int gcd = generateGCD(x, y);
          if (gcd != 0) {
            x /= gcd;
            y /= gcd;
          }

          if (map.containsKey(x)) {
            if (map.get(x).containsKey(y)) {
              map.get(x).put(y, map.get(x).get(y) + 1);
            } else {
              map.get(x).put(y, 1);
            }
          } else {
            Map<Integer, Integer> m = new HashMap<>();
            m.put(y, 1);
            map.put(x, m);
          }
          max = Math.max(max, map.get(x).get(y));
        }
        result = Math.max(result, max + overlap + 1);
      }
      return result;
    }

    private int generateGCD(int a, int b) {
      if (b == 0) {
        return a;
      } else {
        return generateGCD(b, a % b);
      }
    }
  }
}
