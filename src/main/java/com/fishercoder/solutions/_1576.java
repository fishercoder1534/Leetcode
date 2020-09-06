package com.fishercoder.solutions;

public class _1576 {
    public static class Solution1 {
        public String modifyString(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '?') {
                    char replacement = findReplacement(sb, i, s);
                    sb.append(replacement);
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

        private char findReplacement(StringBuilder sb, int index, String s) {
            char replacement = 'a';
            if (index > 0) {
                int count = 1;
                while (replacement == sb.charAt(index - 1)) {
                    replacement += count % 26;
                }
            }
            if (index + 1 < s.length()) {
                int count = 1;
                while (replacement == s.charAt(index + 1) || (index > 0 && replacement == sb.charAt(index - 1))) {
                    replacement += count % 26;
                }
            }
            return replacement;
        }
    }
}
