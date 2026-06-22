package com.fishercoder.solutions.secondthousand;

public class _1071 {
    public static class Solution1 {
        /** Time: O(min(m, n) * (m+n)) Space: O(min(m, n)) */
        public String gcdOfStrings(String str1, String str2) {
            int len1 = str1.length();
            int len2 = str2.length();
            for (int i = Math.min(len1, len2); i >= 1; i--) {
                if (valid(str1, str2, i)) {
                    return str1.substring(0, i);
                }
            }
            return "";
        }

        private boolean valid(String str1, String str2, int k) {
            int len1 = str1.length();
            int len2 = str2.length();
            if (len1 % k != 0 || len2 % k != 0) {
                return false;
            } else {
                String base = str1.substring(0, k);
                return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
            }
        }
    }
}
