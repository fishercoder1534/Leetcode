package com.fishercoder.solutions;

import java.util.Stack;

public class _1544 {
    public static class Solution1 {
        public String makeGood(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (stack.isEmpty()) {
                    stack.add(c);
                } else {
                    if (Character.toLowerCase(stack.peek()) == Character.toLowerCase(c)) {
                        if ((Character.isLowerCase(stack.peek()) && Character.isUpperCase(c))) {
                            stack.pop();
                        } else if (Character.isUpperCase(stack.peek()) && Character.isLowerCase(c)) {
                            stack.pop();
                        } else {
                            stack.add(c);
                        }
                    } else {
                        stack.add(c);
                    }
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
