package com.fishercoder.solutions.firstthousand;

import java.util.ArrayDeque;
import java.util.Deque;

public class _739 {

    public static class Solution1 {
        public int[] dailyTemperatures(int[] temperatures) {
            if (temperatures == null || temperatures.length == 0) {
                return temperatures;
            }
            int[] result = new int[temperatures.length];
            for (int i = 0; i < temperatures.length; i++) {
                for (int j = i + 1; j < temperatures.length; j++) {
                    if (temperatures[j] > temperatures[i]) {
                        result[i] = j - i;
                        break;
                    }
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * This is employing monotonic stack strategy:
         * During the execution of this program, the stack always holds two things:
         * 1. Indices of days whose warmer temperature has not yet been found.
         * 2. Indices that represent temperatures in a strictly decreasing (or non-increasing) order from the bottom of the stack to the top.
         * Because of this property, this data structure is called a monotonic decreasing stack.
         */
        public int[] dailyTemperatures(int[] temperatures) {
            int n = temperatures.length;
            int[] result = new int[n];
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    int prevIndex = stack.pollFirst();
                    result[prevIndex] = i - prevIndex;
                }
                stack.addFirst(i);
            }
            return result;
        }
    }
}
