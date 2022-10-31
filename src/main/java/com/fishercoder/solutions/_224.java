package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;

public class _224 {

    public static class Solution1 {
        /**
         * My complete original solution on 12/23/2021
         */
        public int calculate(String s) {
            Deque<String> stack = new LinkedList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    continue;
                } else {
                    if (s.charAt(i) == '(' || s.charAt(i) == '+' || s.charAt(i) == '-') {
                        stack.addLast(s.charAt(i) + "");
                    } else if (Character.isDigit(s.charAt(i))) {
                        int start = i;
                        while (i < s.length() && Character.isDigit(s.charAt(i))) {
                            i++;
                        }
                        stack.addLast(s.substring(start, i));
                        i--;
                    } else if (s.charAt(i) == ')') {
                        int result = 0;
                        while (!stack.isEmpty() && !stack.peekLast().equals("(")) {
                            String numStr = stack.pollLast();
                            int numInt = Integer.parseInt(numStr);
                            if (!stack.isEmpty() && (stack.peekLast().equals("-") || stack.peekLast().equals("+"))) {
                                String operator = stack.pollLast();
                                if (operator.equals("+")) {
                                    result += numInt;
                                } else if (operator.equals("-")) {
                                    result -= numInt;
                                }
                            } else {
                                result += numInt;
                                if (!stack.isEmpty() && stack.peekLast().equals("(")) {
                                    stack.pollLast();
                                    break;
                                }
                            }
                        }
                        if (!stack.isEmpty() && stack.peekLast().equals("(")) {
                            stack.pollLast();
                        }
                        stack.addLast(result + "");
                    }
                }
            }
            int result = 0;
            while (!stack.isEmpty() && stack.peekLast() != "(") {
                String numStr = stack.pollLast();
                int numInt = Integer.parseInt(numStr);
                if (!stack.isEmpty()) {
                    String operator = stack.pollLast();
                    if (operator.equals("+")) {
                        result += numInt;
                    } else if (operator.equals("-")) {
                        result -= numInt;
                    }
                } else {
                    result += numInt;
                }
            }
            return !stack.isEmpty() ? Integer.parseInt(stack.peekLast()) + result : result;
        }

    }

}
