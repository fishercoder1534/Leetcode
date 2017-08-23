package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

import java.util.ArrayList;
import java.util.List;

/**Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 [
 "((()))",
 "(()())",
 "(())()",
 "()(())",
 "()()()"
 ]*/

public class _22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    void backtrack(List<String> result, String str, int left, int right, int max) {
        if (str.length() == max * 2) {
            result.add(str);
            return;
        }

        if (left < max) {
            backtrack(result, str + "(", left + 1, right, max);
        }

        if (right < left) {
            backtrack(result, str + ")", left, right + 1, max);
        }
    }

    public static void main(String... args) {
        _22 test = new _22();
        int n = 3;
        List<String> result = test.generateParenthesis(n);
        CommonUtils.print(result);

        Solution2 sol2 = new Solution2();
        List<String> result2 = sol2.generateParenthesis(n);
        CommonUtils.print(result2);
    }

    static class Solution2 {
        public List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList();
            if (n == 0) return result;
            helper(result, "", n, n);
            return result;
        }

        void helper(List<String> result, String par, int left, int right) {
            if (left > 0) {
                helper(result, par + "(", left - 1, right);
            }
            if (right > left) {
                helper(result, par + ")", left, right - 1);
            }
            if (right == 0) {
                result.add(par);
            }
        }
    }
}
