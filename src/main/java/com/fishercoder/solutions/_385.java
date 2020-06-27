package com.fishercoder.solutions;

import com.fishercoder.common.classes.NestedInteger;

import java.util.Stack;

public class _385 {

    public static class Solution1 {
        //Lessons: ask the interviewer to clarify the input, for this question, the input could be "324", "[324]", they are different
        //the former should return a nested integer with one single integer, the latter should return a nested integer with a list

        //Idea:
        //if it's '[', we just construct a new nested integer and push it onto the stack
        //if it's a number, we parse the whole number and add to the previous nested integer object
        //if it's ',', we'll just continue;
        //if it's ']', we'll just pop one nested integer from the working stack and assign it to the result

        public NestedInteger deserialize(String s) {
            if (s == null || s.isEmpty() || s.length() == 0) {
                return new NestedInteger();
            }
            Stack<NestedInteger> workStack = new Stack<>();
            NestedInteger result = null;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            //if it's just a single number, then we'll just return a nested integer with one integer
            if (s.charAt(i) != '[') {
                sb.setLength(0);
                while (i < s.length() && ((Character.getNumericValue(s.charAt(i)) < 10
                        && Character.getNumericValue(s.charAt(i)) >= 0) || s.charAt(i) == '-')) {
                    sb.append(s.charAt(i));
                    i++;
                }
                int num = Integer.parseInt(sb.toString());
                return new NestedInteger(num);
            } else {
                //all other cases, we'll return a nested integer with a list
                while (i < s.length()) {
                    if (s.charAt(i) == '[') {
                        NestedInteger ni = new NestedInteger();
                        // we'll put this one into its last one if there's one on the workStack
                        if (!workStack.isEmpty()) {
                            NestedInteger lastNi = workStack.pop();
                            lastNi.add(ni);
                            workStack.push(lastNi);// then push it back
                        }
                        workStack.push(ni);
                        i++;
                    } else if (s.charAt(i) == ',') {
                        i++;
                    } else if (s.charAt(i) == ']') {
                        NestedInteger completedNi = workStack.pop();
                        result = completedNi;
                        i++;
                    } else {
                        // then it must be a number
                        sb.setLength(0);
                        while (i < s.length()
                                && ((Character.getNumericValue(s.charAt(i)) < 10 && Character
                                .getNumericValue(s.charAt(i)) >= 0) || s.charAt(i) == '-')) {
                            sb.append(s.charAt(i));
                            i++;
                        }
                        int num = Integer.parseInt(sb.toString());
                        NestedInteger ni = null;
                        if (!workStack.isEmpty()) {
                            ni = workStack.pop();
                        } else {
                            ni = new NestedInteger();
                        }
                        // case 1: if this one contains one integer
                        if (ni.isInteger()) {
                            // we'll add it to this ni
                            ni.add(new NestedInteger(num));
                        } else if (ni.getList() != null && ni.getList().size() != 0) {
                            // case 2: if this one contains a nested integer
                            // we'll get the last nested integer and add this one to it
                            ni.add(new NestedInteger(num));
                        } else {
                            // case 3: if this is an empty nested integer
                            if (i > 0) {
                                ni.add(new NestedInteger(num));
                            } else {
                                ni.setInteger(num);
                            }
                        }
                        workStack.push(ni);
                        if (i == s.length()) {
                            return ni;// this is for test cases like this: "324", there's no '[' or ']'
                        }
                    }
                }
            }
            return result;
        }
    }
}
