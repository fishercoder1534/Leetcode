package com.fishercoder.solutions;

public class _1047 {
    public static class Solution1 {
        public String removeDuplicates(String S) {
            StringBuilder sb = new StringBuilder(S);
            for (int i = 0; i < S.length() - 1; i++) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    return removeDuplicates(S.substring(0, i) + S.substring(i + 2));
                }
            }
            return sb.toString();
        }
    }
}
