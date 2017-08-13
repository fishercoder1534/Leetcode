package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 *  Evaluate the value of an arithmetic expression in Reverse Polish Notation.

 Valid operators are +, -, *, /. Each operand may be an integer or another expression.

 Some examples:

 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6

 */
public class _150 {

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        Set<String> op = new HashSet();
        op.add("+");
        op.add("-");
        op.add("*");
        op.add("/");

        int exp = 0;
        String operand1 = "";
        String operand2 = "";
        for (int i = 0; i < tokens.length;) {
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

    //using one stack only.
    public int evalRPN1(String[] tokens) {
        Stack<Integer> stack =  new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if (tokens[i].equals("-")){
                stack.push(-stack.pop() + stack.pop());
            }
            else if (tokens[i].equals("*") ){
                stack.push(stack.pop() * stack.pop());

            }
            else if (tokens[i].equals("/")){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);

            } else {
                stack.push(Integer.parseInt (tokens[i]));
            }
        }
        return stack.pop();
    }

}
