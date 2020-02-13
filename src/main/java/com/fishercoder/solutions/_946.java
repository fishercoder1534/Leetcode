package com.fishercoder.solutions;

import java.util.Stack;

/**
 * 946. Validate Stack Sequences
 *
 * Given two sequences pushed and popped with distinct values,
 * return true if and only if this could have been the result of a sequence of push and pop operations on an initially empty stack.
 *
 * Example 1:
 * Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
 * Output: true
 * Explanation: We might do the following sequence:
 * push(1), push(2), push(3), push(4), pop() -> 4,
 * push(5), pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1
 *
 * Example 2:
 * Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
 * Output: false
 * Explanation: 1 cannot be popped before 2.
 *
 * Note:
 * 0 <= pushed.length == popped.length <= 1000
 * 0 <= pushed[i], popped[i] < 1000
 * pushed is a permutation of popped.
 * pushed and popped have distinct values.
 * */
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
}
