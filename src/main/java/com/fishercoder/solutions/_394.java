package com.fishercoder.solutions;

import java.util.Stack;

/**394. Decode String
 *
 * Given an encoded string, return it's decoded string.
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times.
 * Note that k is guaranteed to be a positive integer.
 * You may assume that the input string is always valid;
 * No extra white spaces, square brackets are well-formed, etc.
 * Furthermore, you may assume that the original data does not contain any digits and
 * that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 *
 * Examples:
 * s = "3[a]2[bc]", return "aaabcbc".
 * s = "3[a2[c]]", return "accaccacc".
 * s = "2[abc]3[cd]ef", return "abcabccdcdcdef".
 * */

public class _394 {

    public static class Solution1 {
        public String decodeString(String s) {
            Stack<Integer> count = new Stack<>();
            Stack<String> str = new Stack<>();

            int idx = 0;
            str.push("");

            while (idx < s.length()) {
                if (s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
                    int start = idx;
                    while (s.charAt(idx + 1) >= '0' && s.charAt(idx + 1) <= '9') {
                        idx++;
                    }

                    count.push(Integer.parseInt(s.substring(start, idx + 1)));
                } else if (s.charAt(idx) == '[') {
                    str.push("");
                } else if (s.charAt(idx) == ']') {
                    String st = str.pop();
                    StringBuilder sb = new StringBuilder();
                    int n = count.pop();

                    for (int j = 0; j < n; j++) {
                        sb.append(st);
                    }

                    str.push(str.pop() + sb.toString());
                } else {
                    str.push(str.pop() + s.charAt(idx));
                }

                idx++;
            }

            return str.pop();
        }
    }
}
