package com.fishercoder.solutions;

import java.util.Stack;

/**
 * 155. Min Stack
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.

 * Example:
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 */

public class _155 {

    public static class Solution1 {
        class MinStack {
            private Stack<Integer> stack;
            private int min;

            /**
             * initialize your data structure here.
             */
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
}
