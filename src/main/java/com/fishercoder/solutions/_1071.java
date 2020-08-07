package com.fishercoder.solutions;

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
