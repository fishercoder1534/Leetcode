package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * 150. Evaluate Reverse Polish Notation
 *
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 *
 * Note:
 *     Division between two integers should truncate toward zero.
 *     The given RPN expression is always valid. That means the expression would always evaluate to a result and there won't be any divide by zero operation.
 *
 * Example 1:
 * Input: ["2", "1", "+", "3", "*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 *
 * Example 2:
 * Input: ["4", "13", "5", "/", "+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 *
 * Example 3:
 * Input: ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
 * Output: 22
 * Explanation:
 *   ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 */
public class _150 {

    public static class Solution1 {
        public int evalRPN(String[] tokens) {
            Stack<String> stack = new Stack<>();
            Set<String> op = new HashSet();
            op.add("+");
            op.add("-");
            op.add("*");
            op.add("/");

            int exp = 0;
            String operand1 = "";
            String operand2 = "";
            for (int i = 0; i < tokens.length; ) {
                while ((i < tokens.length) && (!op.contains(tokens[i]))) {
                    stack.push(tokens[i]);
                    i++;
                }
                if (i == tokens.length) {
                    if (!stack.isEmpty()) {
                        return Integer.parseInt(stack.pop());
                    }
                } else if (op.contains(tokens[i])) {
                    if (!stack.isEmpty()) {
                        operand2 = stack.pop();
                    }
                    if (!stack.isEmpty() && !op.contains(stack.peek())) {
                        operand1 = stack.pop();
                    }
                    if (tokens[i].equals("+")) {
                        exp = Integer.parseInt(operand1) + Integer.parseInt(operand2);
                    } else if (tokens[i].equals("-")) {
                        exp = Integer.parseInt(operand1) - Integer.parseInt(operand2);
                    } else if (tokens[i].equals("*")) {
                        exp = Integer.parseInt(operand1) * Integer.parseInt(operand2);
                    } else if (tokens[i].equals("/")) {
                        exp = Integer.parseInt(operand1) / Integer.parseInt(operand2);
                    } else {
                        exp = Integer.parseInt(operand2);
                    }
                    stack.push(String.valueOf(exp));
                    i++;
                }
            }
            return Integer.parseInt(stack.pop());
        }
    }
}
