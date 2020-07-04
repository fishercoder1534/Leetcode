package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _225 {

    public static class Solution1 {
        class MyStack {

            Queue<Integer> q;

            public MyStack() {
                q = new LinkedList();
            }

            // Push element x onto stack.
            public void push(int x) {
                q.offer(x);
                for (int i = 1; i < q.size(); i++) {
                    q.offer(q.remove());
                }
            }

            // Removes the element on top of the stack.
            public int pop() {
                return q.poll();
            }

            // Get the top element.
            public int top() {
                return q.peek();
            }

            // Return whether the stack is empty.
            public boolean empty() {
                return q.isEmpty();
            }
        }
    }
}
