package com.fishercoder.solutions.firstthousand;

import java.util.ArrayDeque;
import java.util.Deque;

public class _901 {
    public static class Solution1 {
        /**
         * This is employing monotonic stack strategy:
         * We maintain a stack of elements that's monotonically decreasing, if we encounter an element that's bigger or equal to the current one at the top of the stack, we'll pop it off of the stack.
         * The additional part of this problem is we'll maintain the count and the value, so we'll use an array as the element to operate on the stack.
         */
        public static class StockSpanner {
            Deque<int[]> stack;

            public StockSpanner() {
                stack = new ArrayDeque<>();
            }

            public int next(int price) {
                int ans = 1;
                while (!stack.isEmpty() && stack.peek()[0] <= price) {
                    ans += stack.pop()[1];
                }
                stack.push(new int[]{price, ans});
                return ans;
            }
        }
    }
}
