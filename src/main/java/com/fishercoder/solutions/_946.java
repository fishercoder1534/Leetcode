package com.fishercoder.solutions;

import java.util.Stack;

public class _946 {
    public static class Solution1 {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            if (pushed == null || popped == null || pushed.length == 0 || popped.length == 0) {
                return true;
            }
            Stack<Integer> stack = new Stack<>();
            stack.push(pushed[0]);
            int i = 1;
            int j = 0;
            while (!stack.isEmpty() || j < popped.length) {
                if (j < popped.length && !stack.isEmpty() && stack.peek() == popped[j]) {
                    stack.pop();
                    j++;
                } else {
                    if (i < pushed.length) {
                        stack.push(pushed[i++]);
                    } else {
                        return stack.isEmpty();
                    }
                }
            }
            return stack.isEmpty();
        }
    }

    public static class Solution2 {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> stack = new Stack<>();
            int i = 0;
            int j = 0;
            int len = pushed.length;
            while (i < len) {
                if (pushed[i] == popped[j]) {
                    i++;
                    j++;
                } else if (!stack.isEmpty() && stack.peek() == popped[j]) {
                    stack.pop();
                    j++;
                } else {
                    stack.push(pushed[i++]);
                }
            }
            while (j < len) {
                if (!stack.isEmpty() && stack.peek() != popped[j++]) {
                    return false;
                } else {
                    stack.pop();
                }
            }
            return true;
        }
    }
}
