package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _1381 {
    public static class Solution1 {
        public static class CustomStack {

            List<Integer> list;
            int maxSize;

            public CustomStack(int maxSize) {
                this.list = new ArrayList<>();
                this.maxSize = maxSize;
            }

            public void push(int x) {
                if (list.size() >= maxSize) {
                    return;
                } else {
                    list.add(x);
                }
            }

            public int pop() {
                if (!list.isEmpty()) {
                    return list.remove(list.size() - 1);
                } else {
                    return -1;
                }
            }

            public void increment(int k, int val) {
                for (int i = 0; i < k && i < list.size(); i++) {
                    list.set(i, list.get(i) + val);
                }
            }
        }
    }

    /**
     * Implementation of Stack using Array
     */
    public static class Solution2 {
        public static class CustomStack {
            private int top;
            private int maxSize;
            private int[] stack;

            public CustomStack(int maxSize) {
                this.maxSize = maxSize;
                this.stack = new int[maxSize];
            }

            public void push(int x) {
                if (top == maxSize) {
                    return;
                }
                stack[top] = x;
                top++;
            }

            public int pop() {
                if (top == 0) {
                    return -1;
                }
                int popValue = stack[top - 1];
                stack[top - 1] = 0;
                top--;
                return popValue;
            }

            public void increment(int k, int val) {
                if (top == 0 || k == 0) {
                    return;
                }
                for (int i = 0; i < k; i++) {
                    if (i == top) {
                        break;
                    }
                    stack[i] += val;
                }
            }
        }
    }
}
