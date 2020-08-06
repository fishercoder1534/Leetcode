package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

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
