package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 166. Fraction to Recurring Decimal
 *
 * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.

 If the fractional part is repeating, enclose the repeating part in parentheses.

 For example,

 Given numerator = 1, denominator = 2, return "0.5".
 Given numerator = 2, denominator = 1, return "2".
 Given numerator = 2, denominator = 3, return "0.(6)".

 */
public class _166 {
  public static class Solution1 {
    /** credit: https://discuss.leetcode.com/topic/33311/simple-and-short-solution-in-java */
    public String fractionToDecimal(int numerator, int denominator) {
      String sign =
          (numerator >= 0 && denominator >= 0) || (numerator < 0 && denominator < 0) ? "" : "-";
      if (numerator == 0) {
        return "0";
      }
      long num = Math.abs((long) numerator);
      long deno = Math.abs((long) denominator);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(sign);
      long integral = Math.abs(num / deno);
      stringBuilder.append(integral);
      if (numerator % denominator == 0) {
        return stringBuilder.toString();
      } else {
        stringBuilder.append(".");
      }
      long remainder = num % deno;

      Map<Long, Integer> map = new HashMap<>();
      while (!map.containsKey(remainder)) {
        map.put(remainder, stringBuilder.length());
        long n = remainder * 10 / deno;
        remainder = remainder * 10 % deno;
        if (remainder != 0 || (remainder == 0 && !map.containsKey(remainder))) {
          stringBuilder.append(n);
        }
      }
      if (remainder != 0) {
        stringBuilder.insert(map.get(remainder), "(");
        stringBuilder.append(")");
      }
      return stringBuilder.toString();
    }
  }
}
