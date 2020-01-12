package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1271. Hexspeak
 *
 * A decimal number can be converted to its Hexspeak representation by first converting it to an uppercase hexadecimal string,
 * then replacing all occurrences of the digit 0 with the letter O, and the digit 1 with the letter I.
 * Such a representation is valid if and only if it consists only of the letters in the set {"A", "B", "C", "D", "E", "F", "I", "O"}.
 * Given a string num representing a decimal integer N, return the Hexspeak representation of N if it is valid, otherwise return "ERROR".
 *
 * Example 1:
 * Input: num = "257"
 * Output: "IOI"
 * Explanation:  257 is 101 in hexadecimal.
 *
 * Example 2:
 * Input: num = "3"
 * Output: "ERROR"
 *
 * Constraints:
 * 1 <= N <= 10^12
 * There are no leading zeros in the given string.
 * All answers must be in uppercase letters.
 * */
public class _1271 {
    public static class Solution1 {
        public String toHexspeak(String num) {
            long numInt = Long.parseLong(num);
            String hexString = Long.toHexString(numInt);
            StringBuilder sb = new StringBuilder();
            Set<Character> set = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', '1', '0', 'a', 'b', 'c', 'd', 'e', 'f'));
            for (char c : hexString.toCharArray()) {
                if (!set.contains(c)) {
                    return "ERROR";
                } else if (c == '1') {
                    sb.append("I");
                } else if (c == '0') {
                    sb.append("O");
                } else {
                    sb.append(Character.toUpperCase(c));
                }
            }
            return sb.toString();
        }
    }
}
