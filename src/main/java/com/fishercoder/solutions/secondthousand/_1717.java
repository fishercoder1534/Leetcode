package com.fishercoder.solutions.secondthousand;

import java.util.Deque;
import java.util.LinkedList;

public class _1717 {
    public static class Solution1 {
        public int maximumGain(String s, int x, int y) {
            int big = Math.max(x, y);
            int small = big == x ? y : x;
            char first = big == x ? 'a' : 'b';
            char second = first == 'a' ? 'b' : 'a';
            Deque<Character> stack1 = new LinkedList<>();
            int max = 0;
            for (char c : s.toCharArray()) {
                if (c == second && !stack1.isEmpty() && stack1.peekLast() == first) {
                    stack1.pollLast();
                    max += big;
                } else {
                    stack1.addLast(c);
                }
            }
            Deque<Character> stack2 = new LinkedList<>();
            while (!stack1.isEmpty()) {
                char c = stack1.pollLast();
                if (!stack2.isEmpty() && c == second && stack2.peekLast() == first) {
                    max += small;
                    stack2.pollLast();
                } else {
                    stack2.addLast(c);
                }
            }
            return max;
        }
    }

}
