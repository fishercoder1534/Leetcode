package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _22 {
    public static class Solution1 {
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
    }

    public static class Solution2 {
        public List<String> generateParenthesis(int n) {
            List<String> result = new ArrayList();
            if (n == 0) {
                return result;
            }
            backtrack(result, "", n, n);
            return result;
        }

        void backtrack(List<String> result, String parenthesis, int left, int right) {
            if (left > 0) {
                backtrack(result, parenthesis + "(", left - 1, right);
            }
            if (right > left) {
                backtrack(result, parenthesis + ")", left, right - 1);
            }
            if (right == 0) {
                result.add(parenthesis);
            }
        }
    }
}
