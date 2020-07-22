package com.fishercoder.solutions;

import java.util.Stack;

public class _735 {
    public static class Solution1 {
        public int[] asteroidCollision(int[] asteroids) {
            Stack<Integer> stack = new Stack();
            for (int i = 0; i < asteroids.length; i++) {
                if (!stack.isEmpty() && stack.peek() > 0 && asteroids[i] < 0) {
                    if (Math.abs(stack.peek()) < Math.abs(asteroids[i])) {
                        stack.pop();
                        stack.push(asteroids[i]);
                        collide(stack);
                    } else if (Math.abs(stack.peek()) == Math.abs(asteroids[i])) {
                        stack.pop();
                    }
                } else {
                    stack.push(asteroids[i]);
                }
            }
            int[] result = new int[stack.size()];
            int i = stack.size();
            while (!stack.isEmpty()) {
                result[--i] = stack.pop();
            }
            return result;
        }

        private void collide(Stack<Integer> stack) {
            do {
                Integer top = stack.pop();
                if (!stack.isEmpty() && stack.peek() * top < 0) {
                    if (stack.peek() < Math.abs(top)) {
                        stack.pop();
                        stack.push(top);
                    } else if (stack.peek() == Math.abs(top)) {
                        stack.pop();
                        break;
                    } else {
                        break;
                    }
                } else if (stack.isEmpty() || stack.peek() * top > 0) {
                    stack.push(top);
                    break;
                }
            } while (!stack.isEmpty());
        }
    }
}
