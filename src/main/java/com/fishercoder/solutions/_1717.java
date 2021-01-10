package com.fishercoder.solutions;

import java.util.Stack;

public class _1717 {
    public static class Solution1 {
        public int maximumGain(String s, int x, int y) {
            Stack<Character> stack1 = new Stack<>();
            int big = x > y ? x : y;
            int small = big == x ? y : x;
            char first = x == big ? 'a' : 'b';
            char second = first == 'a' ? 'b' : 'a';
            int maximumGain = 0;
            for (char c : s.toCharArray()) {
                if (c == second && !stack1.isEmpty() && stack1.peek() == first) {
                    stack1.pop();
                    maximumGain += big;
                } else {
                    stack1.push(c);
                }
            }
            Stack<Character> stack2 = new Stack<>();
            while (!stack1.isEmpty()) {
                char c = stack1.pop();
                if (c == second && !stack2.isEmpty() && stack2.peek() == first) {
                    stack2.pop();
                    maximumGain += small;
                } else {
                    stack2.push(c);
                }
            }
            return maximumGain;
        }
    }

}
