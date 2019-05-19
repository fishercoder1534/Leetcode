package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 89. Gray Code
 *
 * The gray code is a binary numeral system where two successive values differ in only one bit.
 * Given a non-negative integer n representing the total number of bits in the code,
 * print the sequence of gray code.
 * A gray code sequence must begin with 0.

 For example, given n = 2, return [0,1,3,2]. Its gray code sequence is:

 00 - 0
 01 - 1
 11 - 3
 10 - 2

 Note:

 For a given n, a gray code sequence is not uniquely defined.

 For example, [0,2,3,1] is also a valid gray code sequence according to the above definition.

 For now, the judge is able to judge based on one instance of gray code sequence. Sorry about that.
 */

public class _89 {

  public static class Solution1 {
    public List<Integer> grayCode(int n) {
      List<Integer> result = new ArrayList();
      for (int i = 0; i < (1 << n); i++) {
        result.add(i ^ (i >> 1));
      }
      return result;
    }
  }

  public static class Solution2 {
    public List<Integer> grayCode(int n) {
      List<Integer> result = new ArrayList();
      for (int i = 0; i < Math.pow(2, n); i++) {
        result.add(i ^ (i >> 1));
      }
      return result;
    }
  }

  public static void main(String... args) {
    System.out.println("-----------------------------------------------------------------------------------------");
    System.out.println("How to understand i << n? It means n to the power of two, see below. So we have an equivalent solution, which is solution2.");
    System.out.println("1 << 2: " + (1 << 2));
    System.out.println("1 << 3: " + (1 << 3));
    System.out.println("1 << 4: " + (1 << 4));
    System.out.println("1 << 5: " + (1 << 5));
    System.out.println("1 << 6: " + (1 << 6));
    System.out.println("-----------------------------------------------------------------------------------------");
    System.out.println("How to understand i >> 1? It means to shift the number i to the right by 1 bit, see below");
    System.out.println("0 >> 1: " + (0 >> 1));
    System.out.println("1 >> 1: " + (1 >> 1));
    System.out.println("2 >> 1: " + (2 >> 1));
    System.out.println("3 >> 1: " + (3 >> 1));
    System.out.println("4 >> 1: " + (4 >> 1));
    System.out.println("5 >> 1: " + (5 >> 1));
    System.out.println("6 >> 1: " + (6 >> 1));
  }

}
