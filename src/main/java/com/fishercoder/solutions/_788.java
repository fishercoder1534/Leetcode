package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 788. Rotated Digits
 *
 * X is a good number if after rotating each digit individually by 180 degrees,
 * we get a valid number that is different from X.
 * A number is valid if each digit remains a digit after rotation.
 * 0, 1, and 8 rotate to themselves;
 * 2 and 5 rotate to each other;
 * 6 and 9 rotate to each other,
 * and the rest of the numbers do not rotate to any other number.

 Now given a positive number N, how many numbers X from 1 to N are good?

 Example:
 Input: 10
 Output: 4

 Explanation:
 There are four good numbers in the range [1, 10] : 2, 5, 6, 9.
 Note that 1 and 10 are not good numbers, since they remain unchanged after rotating.

 Note: N  will be in range [1, 10000].
 */
public class _788 {
  public static class Solution1 {
    public int rotatedDigits(int N) {
      int count = 0;
      Map<Character, String> map = new HashMap<>();
      map.put('0', "0");
      map.put('1', "1");
      map.put('8', "8");
      map.put('2', "5");
      map.put('5', "2");
      map.put('6', "9");
      map.put('9', "6");
      for (int i = 1; i <= N; i++) {
        if (isRotatedNumber(i, map)) {
          count++;
        }
      }
      return count;
    }

    private boolean isRotatedNumber(int num, Map<Character, String> map) {
      String originalNum = String.valueOf(num);
      StringBuilder sb = new StringBuilder();
      for (char c : String.valueOf(num).toCharArray()) {
        if (!map.containsKey(c)) {
          return false;
        } else {
          sb.append(map.get(c));
        }
      }
      return !originalNum.equals(sb.toString());
    }
  }
}
