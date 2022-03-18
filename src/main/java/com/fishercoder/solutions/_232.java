package com.fishercoder.solutions;

import java.util.Stack;

public class _232 {

    public static class Solution1 {
        /**
         * This is amortized O(1) time for each operation, explanation: https://leetcode.com/problems/implement-queue-using-stacks/solution/
         */
        class MyQueue {

            Stack<Integer> input = new Stack();
            Stack<Integer> output = new Stack();

            // Push element x to the back of queue.
            public void push(int x) {
                input.push(x);
            }

            // Removes the element from in front of queue.
            public int pop() {
                peek();
                return output.pop();
            }

            // Get the front element.
            public int peek() {
                if (output.isEmpty()) {
                    while (!input.isEmpty()) {
                        output.push(input.pop());
                    }
                }
                return output.peek();
            }

            // Return whether the queue is empty.
            public boolean empty() {
                return input.isEmpty() && output.isEmpty();
            }
        }
    }
}

