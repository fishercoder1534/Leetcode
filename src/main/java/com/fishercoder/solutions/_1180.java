package com.fishercoder.solutions;

public class _1180 {
    public static class Solution1 {
        public int countLetters(String S) {
            int count = 0;
            for (int i = 0, j = 1; j < S.length() && i <= j; ) {
                while (j < S.length() && S.charAt(i) == S.charAt(j)) {
                    j++;
                }
                count += countTimes(S.substring(i, j));
                i += S.substring(i, j).length();
            }
            return count;
        }

        private int countTimes(String str) {
            int len = str.length();
            int times = 0;
            while (len > 0) {
                times += len--;
            }
            return times;
        }
    }
}
