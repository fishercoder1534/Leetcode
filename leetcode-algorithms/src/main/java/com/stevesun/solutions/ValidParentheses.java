package com.stevesun.solutions;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] schar = s.toCharArray();
        for(int i = 0; i < schar.length; i++){
            if(schar[i] == '(' || schar[i] == '[' || schar[i] == '{') stack.push(schar[i]);
            else if(schar[i] == ')' || schar[i] == ']' || schar[i] == '}'){
                if(stack.isEmpty()) return false;
                else {
                    char pop = stack.pop();
                    if(schar[i] == ')' && pop != '(') return false;
                    else if(schar[i] == ']' && pop != '[') return false;
                    else if(schar[i] == '}' && pop != '{') return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
