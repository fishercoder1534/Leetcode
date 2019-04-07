package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**1021. Remove Outermost Parentheses
 *
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 *
 * A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
 *
 * Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
 *
 * Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.
 *
 *
 * Example 1:
 * Input: "(()())(())"
 * Output: "()()()"
 * Explanation:
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 *
 * Example 2:
 * Input: "(()())(())(()(()))"
 * Output: "()()()()(())"
 * Explanation:
 * The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
 * After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
 *
 * Example 3:
 * Input: "()()"
 * Output: ""
 * Explanation:
 * The input string is "()()", with primitive decomposition "()" + "()".
 * After removing outer parentheses of each part, this is "" + "" = "".
 *
 * Note:
 *
 * S.length <= 10000
 * S[i] is "(" or ")"
 * S is a valid parentheses string
 * */
public class _1021 {
    public static class Solution1 {
        public String removeOuterParentheses(String S) {
            List<String> primitives = new ArrayList<>();
            for (int i = 1; i < S.length(); i++) {
                int initialI = i - 1;
                int left = 1;
                while (i < S.length() && left > 0) {
                    if (S.charAt(i) == '(') {
                        left++;
                    } else {
                        left--;
                    }
                    i++;
                }
                primitives.add(S.substring(initialI, i));
            }
            StringBuilder sb = new StringBuilder();
            for (String primitive : primitives) {
                sb.append(primitive.substring(1, primitive.length() - 1));
            }
            return sb.toString();
        }
    }
}
