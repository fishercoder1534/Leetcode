package com.fishercoder.solutions._1st_thousand;

import java.util.Deque;
import java.util.LinkedList;

public class _921 {
    public static class Solution1 {
        public int minAddToMakeValid(String s) {
            Deque<Character> stack = new LinkedList<>();
            for (char c : s.toCharArray()) {
                if (c == ')') {
                    if (!stack.isEmpty() && stack.peekLast() == '(') {
                        stack.pollLast();
                    } else {
                        stack.addLast(c);
                    }
                } else {
                    stack.addLast(c);
                }
            }
            return stack.size();
        }
    }
}
