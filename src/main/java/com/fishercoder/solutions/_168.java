package com.fishercoder.solutions;
/**
 *
 * 168. Excel Sheet Column Title

 Given a positive integer, return its corresponding column title as appear in an Excel sheet.

 For example:

 1 -> A
 2 -> B
 3 -> C
 ...
 26 -> Z
 27 -> AA
 28 -> AB
 ...

 Example 1:

 Input: 1
 Output: "A"

 Example 2:

 Input: 28
 Output: "AB"

 Example 3:

 Input: 701
 Output: "ZY"

 */
public class _168 {
  public static class Solution1 {
    public String convertToTitle(int n) {
      /**Get the right most digit first, move to the left, e.g. when n = 28, we get 'B' first, then we get 'A'.*/
      StringBuilder sb = new StringBuilder();
      while (n != 0) {
        int temp = (n - 1) % 26;
        sb.append((char) (temp + 65));
        n = (n - 1) / 26;
      }
      return sb.reverse().toString();
    }
  }
}
