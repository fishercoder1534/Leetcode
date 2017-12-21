package com.fishercoder.solutions;

/**
 * 29. Divide Two Integers
 *
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT.
 */
public class _29 {

  public static class Solution1 {
    public int divide(int dividend, int divisor) {
      if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
        return Integer.MAX_VALUE;
      }
      if (dividend != Integer.MIN_VALUE
          && Math.abs(dividend) < Math.abs(divisor)) {
        return 0;
      }
      if (divisor == Integer.MIN_VALUE) {
        return (dividend == Integer.MIN_VALUE) ? 1 : 0;
      }

      boolean flag = (dividend < 0) ^ (divisor < 0);
      dividend = -Math.abs(dividend);
      divisor = -Math.abs(divisor);
      int[] num = new int[40];
      int[] multiple = new int[40];
      num[1] = divisor;
      multiple[1] = 1;

      for (int i = 2; i < 32 && num[i - 1] < 0; ++i) {
        num[i] = num[i - 1] << 1;
        multiple[i] = multiple[i - 1] << 1;
      }

      int result = 0;
      int index = 1;
      while (num[index] < 0) {
        ++index;
      }
      index -= 1;

      while (dividend <= divisor) {
        while (dividend <= num[index]) {
          result += multiple[index];
          dividend -= num[index];
        }
        --index;
      }
      return !flag ? result : -result;
    }
  }
}
