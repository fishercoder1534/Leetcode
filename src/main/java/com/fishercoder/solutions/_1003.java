package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

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
