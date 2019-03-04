package com.fishercoder.solutions;

/**
 * 66. Plus One
 *
 * Given a non-negative number represented as an array of digits, plus one to the number. The digits
 * are stored such that the most significant digit is at the head of the list.
 */
public class _66 {

  public static class Solution1 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        int[] temp = digits;
        
        for (int i = len - 1; i >= 0; i--) {
            if (temp[i] + 1 == 10) {
                temp[i] = 0;
            } else {
                temp[i] += 1;
                return temp;
            }
        }
        if (temp[0] == 0) {
            int[] res = new int[len + 1];
            res[0] = 1; //all the rest of the numbers should all be zeroes, so we don't need to copy from the original array
            return res;
        } else {
            return temp;
        }
    }
  }
}
