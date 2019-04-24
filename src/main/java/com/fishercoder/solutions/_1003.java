package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1003. Check If Word Is Valid After Substitutions
 *
 * We are given that the string "abc" is valid.
 *
 * From any valid string V, we may split V into two pieces X and Y such that X + Y (X concatenated with Y) is equal to V.  (X or Y may be empty.)  Then, X + "abc" + Y is also valid.
 *
 * If for example S = "abc", then examples of valid strings are: "abc", "aabcbc", "abcabc", "abcabcababcc".  Examples of invalid strings are: "abccba", "ab", "cababc", "bac".
 *
 * Return true if and only if the given string S is valid.
 *
 * Note:
 *  * 1 <= S.length <= 20000
 *  * S[i] is 'a', 'b', or 'c'
 */

public class _1003 {
    public static class Solution1 {
        public boolean isValid(String S) {
            Deque<Character> stack = new ArrayDeque<>();

            for (char c : S.toCharArray()) {
                if (c == 'c') {
                    if (stack.isEmpty() || stack.pop() != 'b') {
                        return false;
                    }
                    if (stack.isEmpty() || stack.pop() != 'a') {
                        return false;
                    }
                } else {
                    stack.push(c);
                }
            }

            return stack.isEmpty();
        }
    }
}
