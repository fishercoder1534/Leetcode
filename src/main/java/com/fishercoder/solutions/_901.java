package com.fishercoder.solutions;

import java.util.Stack;

public class _901 {
    public static class Solution1 {
        public static class StockSpanner {
            Stack<int[]> stack;

            public StockSpanner() {
                stack = new Stack<>();
            }

            public int next(int price) {
                int result = 1;
                while (!stack.isEmpty() && stack.peek()[0] <= price) {
                    result += stack.pop()[1];
                }
                stack.push(new int[]{price, result});
                return result;
            }
        }
    }
}
