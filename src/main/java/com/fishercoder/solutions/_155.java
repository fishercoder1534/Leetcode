package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class _155 {

    public static class Solution1 {
        class MinStack {
            private Stack<Integer> stack;
            private int min;

            public MinStack() {
                stack = new Stack();
                min = Integer.MAX_VALUE;
            }

            public void push(int x) {
                /**All the trick happens here, we push the second minimum number onto the stack before we push the newer one,
                 * this way, when popping, we could always get the next minimum one in constant time.*/
                if (x <= min) {
                    stack.push(min);
                    min = x;
                }
                stack.push(x);
            }

            public void pop() {
                /**if the value on the top of the stack happens to be the current minimum, we'll pop twice and change
                 * the current min value to be the last min value */
                if (min == stack.pop()) {
                    min = stack.pop();
                }
            }

            public int top() {
                return stack.peek();
            }

            public int getMin() {
                return min;
            }
        }
    }

    public static class Solution2 {
        /**
         * We could store a pair onto the stack: the first element in the pair is the value itself,
         * the second element in the pair is the current minimum element so far seen on the stack.
         */
        class MinStack {
            Deque<int[]> stack;

            public MinStack() {
                stack = new LinkedList<>();
            }

            public void push(int val) {
                if (!stack.isEmpty()) {
                    int[] last = stack.peekLast();
                    int currentMin = last[1];
                    if (val < currentMin) {
                        stack.addLast(new int[]{val, val});
                    } else {
                        stack.addLast(new int[]{val, currentMin});
                    }
                } else {
                    stack.addLast(new int[]{val, val});
                }
            }

            public void pop() {
                stack.pollLast();
            }

            public int top() {
                return stack.peekLast()[0];
            }

            public int getMin() {
                return stack.peekLast()[1];
            }
        }

    }
}
