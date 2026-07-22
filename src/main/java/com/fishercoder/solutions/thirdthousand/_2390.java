package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayDeque;
import java.util.Deque;

public class _2390 {
    public static class Solution1 {
        public String removeStars(String s) {
            Deque<Character> stack = new ArrayDeque<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '*') {
                    if (!stack.isEmpty()) {
                        // this is just being defensive, as the problem already stated that it's
                        // always valid to remove on the left side of the *
                        stack.pop();
                    }
                } else {
                    stack.push(s.charAt(i));
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
