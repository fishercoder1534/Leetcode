package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 386. Lexicographical Numbers
 *
 * Given an integer n, return 1 - n in lexicographical order.
 *
 * For example, given 13, return: [1,10,11,12,13,2,3,4,5,6,7,8,9].
 *
 * Please optimize your algorithm to use less time and space. The input size may be as large as
 * 5,000,000.
 */
public class _386 {
  public static class Solution1 {
    //Radix sort doesn't apply here! Don't confuse yourself!

    //rewrote their solution from Python to Java:https://discuss.leetcode.com/topic/54986/python-memory-limit-exceeded-for-problem-386/17
    public List<Integer> lexicalOrder(int n) {
      List<Integer> result = new ArrayList();
      int i = 1;
      while (true) {
        result.add(i);
        if (i * 10 <= n) {
          i *= 10;
        } else {
          while (i % 10 == 9 || i == n) {
            i /= 10;
          }
          if (i == 0) {
            return result;
          }
          i++;
        }
      }
    }
  }
}
