package com.fishercoder.solutions;

import java.util.Stack;

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
