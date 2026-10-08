package com.fishercoder.solutions.secondthousand;

import java.util.ArrayList;
import java.util.List;

public class _1021 {
    public static class Solution1 {
        public String removeOuterParentheses(String s) {
            List<String> primitives = new ArrayList<>();
            for (int i = 1; i < s.length(); i++) {
                int initialI = i - 1;
                int left = 1;
                while (i < s.length() && left > 0) {
                    if (s.charAt(i) == '(') {
                        left++;
                    } else {
                        left--;
                    }
                    i++;
                }
                primitives.add(s.substring(initialI, i));
            }
            StringBuilder sb = new StringBuilder();
            for (String primitive : primitives) {
                sb.append(primitive.substring(1, primitive.length() - 1));
            }
            return sb.toString();
        }
    }

    public static class Solution2 {
        /**
         * This is a very clever solution!
         * We can simply use one integer level to indicate:
         * 1. if we encounter ')', we'll have to decrement it first;
         * 2. if level is greater than zero, that means it's not the outermost layer, so we can add this char into the result;
         * 3. if we encounter '(', we'll increment level by one in the end
         *
         */
        public String removeOuterParentheses(String s) {
            int level = 0;
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == ')') {
                    level--;
                }
                if (level > 0) {
                    sb.append(c);
                }
                if (c == '(') {
                    level++;
                }
            }
            return sb.toString();
        }
    }
}
