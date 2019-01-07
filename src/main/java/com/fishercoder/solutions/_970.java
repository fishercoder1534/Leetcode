package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 970. Powerful Integers
 *
 * Given two non-negative integers x and y, an integer is powerful if it is equal to x^i + y^j for some integers i >= 0 and j >= 0.
 *
 * Return a list of all powerful integers that have value less than or equal to bound.
 *
 * You may return the answer in any order.  In your answer, each value should occur at most once.
 *
 * Example 1:
 *
 * Input: x = 2, y = 3, bound = 10
 * Output: [2,3,4,5,7,9,10]
 * Explanation:
 * 2 = 2^0 + 3^0
 * 3 = 2^1 + 3^0
 * 4 = 2^0 + 3^1
 * 5 = 2^1 + 3^1
 * 7 = 2^2 + 3^1
 * 9 = 2^3 + 3^0
 * 10 = 2^0 + 3^2
 *
 * Example 2:
 *
 * Input: x = 3, y = 5, bound = 15
 * Output: [2,4,6,8,10,14]
 *
 *
 * Note:
 * 1 <= x <= 100
 * 1 <= y <= 100
 * 0 <= bound <= 10^6
 */
public class _970 {
  public static class Solution1 {
    /**This approach results in Time Limit Exceeded since it's apparently doing
     * redundant checks.*/
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
      Set<Integer> result = new HashSet<>();
      int small = x;
      int big = y;
      if (x > y) {
        small = y;
        big = x;
      }
      int maxPower = bound / small;
      for (int i = 0; i <= maxPower + 1; i++) {
        for (int j = 0; j <= maxPower + 1; j++) {
          int sum = (int) (Math.pow(small, i) + Math.pow(big, j));
          if (sum <= bound) {
            result.add(sum);
          }
        }
      }
      List<Integer> list = new ArrayList<>(result);
      Collections.sort(list);
      return list;
    }
  }

  public static class Solution2 {
    /** credit: https://leetcode.com/problems/powerful-integers/discuss/214212/JavaC%2B%2BPython-Brute-Force */
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
      Set<Integer> result = new HashSet<>();
      for (int i = 1; i < bound; i *= x > 1 ? x : bound + 1) {
        for (int j = 1; i + j <= bound; j *= y > 1 ? y : bound + 1) {
          result.add(i + j);
        }
      }
      return new ArrayList<>(result);
    }
  }
}
