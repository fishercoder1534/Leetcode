package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _224 {

    public static class Solution1 {

        public int calculate(String s) {
            if (s == null || s.isEmpty()) {
                return 0;
            }

            s = s.replaceAll("\\s", "");
            char[] chars = s.toCharArray();
            List<String> filteredStr = new ArrayList();
            for (int i = 0; i < chars.length; ) {
                StringBuilder sb = new StringBuilder();
                while (i < chars.length && Character.isDigit(chars[i])) {
                    sb.append(chars[i]);
                    i++;
                }
                if (i == chars.length) {
                    if (sb.toString().length() != 0) {
                        filteredStr.add(sb.toString());
                    }
                } else {
                    if (sb.toString().length() != 0) {
                        filteredStr.add(sb.toString());
                    }
                    if (chars[i] == '+' || chars[i] == '-' || chars[i] == '(' || chars[i] == ')') {
                        filteredStr.add(String.valueOf(chars[i]));
                    }
                    i++;
                }
            }

            for (String str : filteredStr) {
                System.out.print(str);
            }

            Stack<String> stack1 = new Stack();
            Stack<String> stack2 = new Stack();
            for (int i = 0; i < filteredStr.size(); ) {
                while (i < filteredStr.size() && !filteredStr.get(i).equals(")")) {
                    stack1.push(filteredStr.get(i));
                    i++;
                }
                if (i != filteredStr.size()) {
                    while (!stack1.isEmpty() && !stack1.peek().equals("(")) {
                        stack2.push(stack1.pop());
                    }
                    stack1.pop();
                    int exp = 0;
                    while (!stack2.isEmpty()) {
                        if (stack2.size() == 1) {
                            stack1.push(stack2.pop());
                            break;
                        }
                        int operand1 = Integer.parseInt(stack2.pop());
                        String operator = stack2.pop();
                        int operand2 = Integer.parseInt(stack2.pop());
                        if (operator.equals("+")) {
                            exp = operand1 + operand2;
                        } else if (operator.equals("-")) {
                            exp = operand1 - operand2;
                        }
                        stack2.push(String.valueOf(exp));
                    }
                    i++;
                }
            }

            if (stack1.size() == 1) {
                return Integer.parseInt(stack1.pop());
            }

            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            while (!stack2.isEmpty()) {
                if (stack2.size() == 1) {
                    stack1.push(stack2.pop());
                    break;
                }
                int exp = 0;
                int operand1 = Integer.parseInt(stack2.pop());
                String operator = stack2.pop();
                int operand2 = Integer.parseInt(stack2.pop());
                if (operator.equals("+")) {
                    exp = operand1 + operand2;
                } else if (operator.equals("-")) {
                    exp = operand1 - operand2;
                }
                stack2.push(String.valueOf(exp));
            }
            return Integer.parseInt(stack1.pop());
        }
    }

}
