package com.fishercoder.solutions.first_thousand;

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

    public static class Solution2 {
        /**
         * Simple and clean recursion solution, credit: https://leetcode.com/problems/basic-calculator/solutions/2344042/java-2ms-100-recursion-easy-to-understand/
         * Key points:
         * 1. it uses a global variable called index to control which char to iterate on;
         * 2. it passes the entire string s into recursive functions.
         */
        int index;

        public int calculate(String s) {
            index = 0;
            return cal(s);
        }

        private int cal(String s) {
            int result = 0;
            int num = 0;
            int sign = 1;
            while (index < s.length()) {
                char c = s.charAt(index++);
                if (c >= '0' && c <= '9') {
                    num = num * 10 + c - '0';
                } else if (c == '(') {
                    //this is the beginning of a new sub-problem, we let recursion do its job
                    num = cal(s);
                } else if (c == ')') {
                    //this is the end of a problem/sub-problem, so we return
                    return result + sign * num;
                } else if (c == '+' || c == '-') {
                    //now we know we finished reading one number and a new number has begun
                    result += sign * num;
                    num = 0;
                    sign = c == '-' ? -1 : 1;
                }
            }
            return result + sign * num;
        }
    }

    public static class Solution3 {
        /**
         * A more elegant solution using stack and iterative approach, credit: https://leetcode.com/problems/basic-calculator/solutions/62361/iterative-java-solution-with-stack/
         * Key points:
         * 1. use an integer to represent sign: 1 or -1, so it can be pushed onto a stack that's of Integer type;
         */
        public int calculate(String s) {
            Deque<Integer> stack = new LinkedList<>();
            int result = 0;
            int sign = 1;
            int num = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isDigit(c)) {
                    num = num * 10 + c - '0';
                } else if (c == '(') {
                    //we push the result onto the stack first, then sign
                    stack.addLast(result);
                    stack.addLast(sign);

                    //reset them
                    sign = 1;
                    num = 0;
                } else if (c == ')') {
                    //this means we reached the end of one parenthesis, so we compute result and reset num
                    result += num * sign;
                    num = 0;

                    result *= stack.pollLast();//this is the last sign we pushed onto the stack
                    result += stack.pollLast();//this is the last number on the stack
                } else if (c == '+') {
                    result += num * sign;
                    //reset below two variables
                    num = 0;
                    sign = 1;
                } else if (c == '-') {
                    result -= num * sign;
                    //reset below two variables
                    num = 0;
                    sign = 1;
                }
            }
            if (num != 0) {
                result += num * sign;
            }
            return result;
        }
    }

}
