package com.fishercoder.solutions;

/**
 * 541. Reverse String II
 *
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string.
 * If there are less than k characters left, reverse all of them.
 * If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.

 Example:
 Input: s = "abcdefg", k = 2
 Output: "bacdfeg"

 Restrictions:
 The string consists of lower English letters only.
 Length of the given string and k will in the range [1, 10000]
 */
public class _541 {

    public static class Solution1 {
        public String reverseStr(String s, int k) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i = i + 2 * k) {
                if (s.length() >= (i + k)) {
                    stringBuilder.append(new StringBuilder(s.substring(i, i + k)).reverse());
                } else {
                    stringBuilder.append(new StringBuilder(s.substring(i)).reverse());
                    break;
                }
                if ((i + 2 * k) <= s.length()) {
                    stringBuilder.append(s.substring(i + k, i + 2 * k));
                } else {
                    stringBuilder.append(s.substring(i + k));
                }
            }
            return stringBuilder.toString();
        }
    }
}
