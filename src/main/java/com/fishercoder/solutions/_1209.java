package com.fishercoder.solutions;

import java.util.Stack;

/**
 * 1209. Remove All Adjacent Duplicates in String II
 *
 * Given a string s, a k duplicate removal consists of choosing k adjacent and equal
 * letters from s and removing them causing the left and the right side of the deleted substring to concatenate together.
 * We repeatedly make k duplicate removals on s until we no longer can.
 * Return the final string after all such duplicate removals have been made.
 * It is guaranteed that the answer is unique.
 *
 * Example 1:
 * Input: s = "abcd", k = 2
 * Output: "abcd"
 * Explanation: There's nothing to delete.
 *
 * Example 2:
 * Input: s = "deeedbbcccbdaa", k = 3
 * Output: "aa"
 * Explanation:
 * First delete "eee" and "ccc", get "ddbbbdaa"
 * Then delete "bbb", get "dddaa"
 * Finally delete "ddd", get "aa"
 *
 * Example 3:
 * Input: s = "pbbcggttciiippooaais", k = 2
 * Output: "ps"
 *
 * Constraints:
 * 1 <= s.length <= 10^5
 * 2 <= k <= 10^4
 * s only contains lower case English letters.
 * */
public class _1209 {
    public static class Solution1 {
        public String removeDuplicates(String s, int k) {
            Stack<Character> stack = new Stack<>();
            char c = s.charAt(0);
            stack.push(c);
            int count = 1;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                    stack.push(s.charAt(i));
                    if (count == k) {
                        while (!stack.isEmpty() && stack.peek() == c) {
                            stack.pop();
                        }
                        count = 0;
                        if (!stack.isEmpty()) {
                            c = stack.peek();
                            while (!stack.isEmpty() && c == stack.peek()) {
                                count++;
                                stack.pop();
                            }
                            int tmp = count;
                            while (tmp-- > 0) {
                                stack.push(c);
                            }
                        }
                    }
                } else {
                    c = s.charAt(i);
                    stack.push(s.charAt(i));
                    count = 1;
                }
            }
            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
                sb.append(stack.pop());
            }
            return sb.reverse().toString();
        }
    }
}
