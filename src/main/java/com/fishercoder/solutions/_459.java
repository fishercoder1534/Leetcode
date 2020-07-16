package com.fishercoder.solutions;

public class _459 {

    public static class Solution1 {
        public boolean repeatedSubstringPattern(String s) {
            int len = s.length();
            for (int i = len / 2; i >= 1; i--) {
                String pattern = s.substring(0, i);
                if (len % i == 0) {
                    String formedString = formStringByCopying(pattern, len / i);
                    if (formedString.equals(s)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private String formStringByCopying(String pattern, int k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                sb.append(pattern);
            }
            return sb.toString();
        }
    }

    public static class Solution2 {
        /**
         * credit: https://discuss.leetcode.com/topic/68089/repeated-substring-pattern-simple-java-solution-using-kmp
         */
        public static boolean repeatedSubstringPattern(String str) {
            //build the KMP pattern.
            int n = str.length();
            int cur = 0;
            int j = 1;
            int[] pattern = new int[n];
            pattern[0] = 0;

            while (j < n) {
                if (str.charAt(cur) == str.charAt(j)) {
                    pattern[j++] = ++cur;
                } else {
                    if (cur == 0) {
                        pattern[j++] = 0;
                    } else {
                        cur = pattern[cur - 1];//start from beginning of current matching pattern.
                    }
                }
            }

            return (pattern[n - 1] > 0 && n % (n - pattern[n - 1]) == 0);
        }
    }

    public static class Solution3 {
        public static boolean repeatedSubstringPattern(String str) {
            String s = str + str;
            return s.substring(1, s.length() - 1).contains(str);
        }
    }
}
