package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 509. Fibonacci Number
 *
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 *
 * Example 1:
 * Input: 2
 * Output: 1
 * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
 *
 * Example 2:
 * Input: 3
 * Output: 2
 * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
 *
 * Example 3:
 * Input: 4
 * Output: 3
 * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 *
 * Note:
 * 0 ≤ N ≤ 30.
 */
public class _509 {
  public static class Solution1 {
    /**
     * Time: O(n)
     * Space: O(n)
     */
    public int fib(int N) {
      List<Integer> list = new ArrayList<>();
      list.add(0);
      list.add(1);
      for (int i = 2; i <= N; i++) {
        list.add(list.get(i - 1) + list.get(i - 2));
      }
      return list.get(N);
    }
  }

  public static class Solution2 {
    /**
     * Time: O(n)
     * Space: O(n)
     */
    public int fib(int N) {
      if (N < 2) {
        return N;
      }
      int[] fibNums = new int[N + 1];
      fibNums[0] = 0;
      fibNums[1] = 1;
      for (int i = 2; i <= N; i++) {
        fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
      }
      return fibNums[N];
    }
  }

  public static class Solution3 {
    /**
     * Time: O(n)
     * Space: O(1)
     */
    public int fib(int N) {
      if (N < 2) {
        return N;
      }
      int a = 0;
      int b = 1;
      while (N-- > 1) {
        int sum = a + b;
        a = b;
        b = sum;
      }
      return b;
    }
  }
}
