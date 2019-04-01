package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 439. Ternary Expression Parser
 *
 * Given a string representing arbitrarily nested ternary expressions, calculate the result of the expression.
 * You can always assume that the given expression is valid and only consists of digits 0-9, ?, :, T and F (T and F represent True and False respectively).

 Note:

 The length of the given string is ≤ 10000.
 Each number will contain only one digit.
 The conditional expressions group right-to-left (as usual in most languages).
 The condition will always be either T or F. That is, the condition will never be a digit.
 The result of the expression will always evaluate to either a digit 0-9, T or F.

 Example 1:

 Input: "T?2:3"

 Output: "2"

 Explanation: If true, then result is 2; otherwise result is 3.


 Example 2:

 Input: "F?1:T?4:5"

 Output: "4"

 Explanation: The conditional expressions group right-to-left. Using parenthesis, it is read/evaluated as:

 "(F ? 1 : (T ? 4 : 5))"                   "(F ? 1 : (T ? 4 : 5))"
 -> "(F ? 1 : 4)"                 or       -> "(T ? 4 : 5)"
 -> "4"                                    -> "4"
 Example 3:

 Input: "T?T?F:5:3"

 Output: "F"

 Explanation: The conditional expressions group right-to-left. Using parenthesis, it is read/evaluated as:

 "(T ? (T ? F : 5) : 3)"                   "(T ? (T ? F : 5) : 3)"
 -> "(T ? F : 3)"                 or       -> "(T ? F : 5)"
 -> "F"                                    -> "F"
 */
public class _439 {

    public static class Solution1 {
        /**
         * Below is my original solution, but looking at Discuss, a more concise way is to use just one
         * stack, process it from right to left, example: https://discuss.leetcode.com/topic/64409/very-easy-1-pass-stack-solution-in-java-no-string-concat
         */

        public String parseTernary(String expression) {
            Deque<Character> stack = new ArrayDeque<>();
            Deque<Character> tmpStack = new ArrayDeque<>();
            for (char c : expression.toCharArray()) {
                stack.addFirst(c);
            }
            while (!stack.isEmpty()) {
                if (stack.peek() != '?') {
                    tmpStack.addFirst(stack.pollFirst());
                } else {
                    char char1 = tmpStack.removeFirst();
                    tmpStack.removeFirst();//remove ':'
                    char char2 = tmpStack.removeFirst();
                    stack.removeFirst();//remove '?'
                    char judge = stack.removeFirst();
                    tmpStack.addFirst(judge == 'T' ? char1 : char2);
                    while (!tmpStack.isEmpty()) {
                        stack.addFirst(tmpStack.pollFirst());
                    }
                }
                if (stack.size() == 1) {
                    break;
                }
            }
            return Character.toString(stack.removeFirst());
        }
    }

}
