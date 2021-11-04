package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;

public class _735 {
    public static class Solution1 {
        public int[] asteroidCollision(int[] asteroids) {
            Deque<Integer> stack = new LinkedList<>();
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

        private void collide(Deque<Integer> stack) {
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

    public static class Solution2 {
        /**
         * My completely original solution on 11/5/2021.
         */
        public int[] asteroidCollision(int[] asteroids) {
            Deque<Integer> stack = new LinkedList<>();
            for (int a : asteroids) {
                if (a > 0) {
                    stack.addLast(a);
                } else {
                    if (!stack.isEmpty() && stack.peekLast() > 0) {
                        if (stack.peekLast() > Math.abs(a)) {
                            continue;
                        } else if (stack.peekLast() == Math.abs(a)) {
                            stack.pollLast();
                        } else {
                            while (!stack.isEmpty() && stack.peekLast() > 0 && stack.peekLast() < Math.abs(a)) {
                                stack.pollLast();
                            }
                            if (!stack.isEmpty() && stack.peekLast() > 0 && stack.peekLast() == Math.abs(a)) {
                                stack.pollLast();
                                continue;
                            } else if (stack.isEmpty() || stack.peekLast() < 0) {
                                stack.addLast(a);
                            }
                        }
                    } else {
                        stack.addLast(a);
                    }
                }
            }
            int[] ans = new int[stack.size()];
            for (int i = stack.size() - 1; i >= 0; i--) {
                ans[i] = stack.pollLast();
            }
            return ans;
        }
    }
}
