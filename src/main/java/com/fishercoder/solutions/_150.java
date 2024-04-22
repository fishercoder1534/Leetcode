package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class _150 {

    public static class Solution1 {
        public int evalRPN(String[] tokens) {
            Set<String> operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
            Stack<Integer> stack = new Stack<>();
            for (String token : tokens) {
                if (operators.contains(token)) {
                    int secondNum = stack.pop();
                    int firstNum = stack.pop();
                    int result;
                    if (token.equals("+")) {
                        result = firstNum + secondNum;
                    } else if (token.equals("-")) {
                        result = firstNum - secondNum;
                    } else if (token.equals("*")) {
                        result = firstNum * secondNum;
                    } else {
                        result = firstNum / secondNum;
                    }
                    stack.push(result);
                } else {
                    int num = Integer.parseInt(token);
                    stack.push(num);
                }
            }
            return stack.pop();
        }
    }
}
