package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

public class _439 {

    public static class Solution1 {
        /**
         * Below is my original solution, but looking at Discuss, a more concise way is to use just one
         * stack, process it from right to left, example: https://discuss.leetcode.com/topic/64409/very-easy-1-pass-stack-solution-in-java-no-string-concat
         */

        public String parseTernary(String expression) {
            Deque<Character> stack = new ArrayDeque<>();
            Deque<Character> tmpStack = new ArrayDeque<>();
            for (char c : expression.toCharArray()) {
                stack.addFirst(c);
            }
            while (!stack.isEmpty()) {
                if (stack.peek() != '?') {
                    tmpStack.addFirst(stack.pollFirst());
                } else {
                    char char1 = tmpStack.removeFirst();
                    tmpStack.removeFirst();//remove ':'
                    char char2 = tmpStack.removeFirst();
                    stack.removeFirst();//remove '?'
                    char judge = stack.removeFirst();
                    tmpStack.addFirst(judge == 'T' ? char1 : char2);
                    while (!tmpStack.isEmpty()) {
                        stack.addFirst(tmpStack.pollFirst());
                    }
                }
                if (stack.size() == 1) {
                    break;
                }
            }
            return Character.toString(stack.removeFirst());
        }
    }

}
