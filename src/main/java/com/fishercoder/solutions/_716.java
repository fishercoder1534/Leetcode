package com.fishercoder.solutions;

import java.util.Iterator;
import java.util.Stack;

/**
 * 716. Max Stack
 *
 * Design a max stack that supports push, pop, top, peekMax and popMax.
 *
 push(x) -- Push element x onto stack.
 pop() -- Remove the element on top of the stack and return it.
 top() -- Get the element on the top.
 peekMax() -- Retrieve the maximum element in the stack.
 popMax() -- Retrieve the maximum element in the stack, and remove it. If you find more than one maximum elements, only remove the top-most one.

 Example 1:
 MaxStack stack = new MaxStack();
 stack.push(5);
 stack.push(1);
 stack.push(5);
 stack.top(); -> 5
 stack.popMax(); -> 5
 stack.top(); -> 1
 stack.peekMax(); -> 5
 stack.pop(); -> 1
 stack.top(); -> 5
 Note:
 -1e7 <= x <= 1e7
 Number of operations won't exceed 10000.
 The last four operations won't be called when stack is empty.
 */
public class _716 {
    public static class Solution1 {
        public static class MaxStack {

            private int max;
            private Stack<Integer> stack;

            /**
             * initialize your data structure here.
             */
            public MaxStack() {
                max = Integer.MIN_VALUE;
                stack = new Stack<>();
            }

            public void push(int x) {
                if (x > max) {
                    max = x;
                }
                stack.push(x);
            }

            public int pop() {
                if (stack.peek() == max) {
                    int result = stack.pop();
                    max = findMax();
                    return result;
                } else {
                    return stack.pop();
                }
            }

            private int findMax() {
                if (!stack.isEmpty()) {
                    Iterator<Integer> iterator = stack.iterator();
                    int max = stack.peek();
                    while (iterator.hasNext()) {
                        max = Math.max(max, iterator.next());
                    }
                    return max;
                } else {
                    max = Integer.MIN_VALUE;
                    return max;
                }
            }

            public int top() {
                return stack.peek();
            }

            public int peekMax() {
                return max;
            }

            public int popMax() {
                Stack<Integer> tmp = new Stack<>();
                int result = 0;
                while (!stack.isEmpty()) {
                    if (stack.peek() != max) {
                        tmp.push(stack.pop());
                    } else {
                        result = stack.pop();
                        break;
                    }
                }
                while (!tmp.isEmpty()) {
                    stack.push(tmp.pop());
                }
                max = findMax();
                return result;
            }
        }
    }
}
