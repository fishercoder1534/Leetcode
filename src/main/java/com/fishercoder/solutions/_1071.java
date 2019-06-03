package com.fishercoder.solutions;

/**
 * 1071. Greatest Common Divisor of Strings
 *
 * For strings S and T, we say "T divides S" if and only if S = T + ... + T  (T concatenated with itself 1 or more times)
 * Return the largest string X such that X divides str1 and X divides str2.
 *
 * Example 1:
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 *
 * Example 2:
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 *
 * Example 3:
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 *
 * Note:
 *
 * 1 <= str1.length <= 1000
 * 1 <= str2.length <= 1000
 * str1[i] and str2[i] are English uppercase letters.
 * */
public class _1071 {
    public static class Solution1 {
        public String gcdOfStrings(String str1, String str2) {
            if (str1.isEmpty() || str2.isEmpty()) {
                return "";
            }
            String commomDivisor = str2;
            while (commomDivisor != null && !commomDivisor.isEmpty()) {
                if (isDivisor(str1, commomDivisor)) {
                    return commomDivisor;
                } else {
                    commomDivisor = findNextShorterCommonDivisor(str2, commomDivisor);
                }
            }
            return "";
        }

        private String findNextShorterCommonDivisor(String str2, String commomDivisor) {
            int length = nextPossibleLength(str2, commomDivisor.length() - 1);
            while (length > 1) {
                if (isDivisor(str2, length)) {
                    return str2.substring(0, length);
                }
                length = nextPossibleLength(str2, length - 1);
            }
            return null;
        }

        private boolean isDivisor(String str2, int length) {
            String commonDivisorCandidate = str2.substring(0, length);
            for (int i = 0; i < str2.length() - length; i += length) {
                if (!str2.substring(i, i + length).equals(commonDivisorCandidate)) {
                    return false;
                }
            }
            return true;
        }

        private boolean isDivisor(String str1, String commomDivisor) {
            if (str1.length() == commomDivisor.length()) {
                return str1.equals(commomDivisor);
            }
            int i = 0;
            for (; i < str1.length() - commomDivisor.length(); i += commomDivisor.length()) {
                if (!str1.substring(i, i + commomDivisor.length()).equals(commomDivisor)) {
                    return false;
                }
            }
            return i == (str1.length() - commomDivisor.length());
        }

        private int nextPossibleLength(String str2, int bound) {
            if (bound <= 0) {
                return -1;
            }
            int len = bound;
            while (str2.length() % len != 0) {
                len--;
            }
            return len;
        }
    }
}
