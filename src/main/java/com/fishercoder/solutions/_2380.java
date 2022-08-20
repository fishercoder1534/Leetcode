package com.fishercoder.solutions;

public class _2380 {
    public static class Solution1 {
        public int secondsToRemoveOccurrences(String s) {
            int seconds = 0;
            StringBuilder sb = new StringBuilder(s);
            while (hasZeroOneCount(sb)) {
                for (int i = 0; i < sb.length() - 1; ) {
                    if (sb.charAt(i) == '0' && sb.charAt(i + 1) == '1') {
                        sb.setCharAt(i++, '1');
                        sb.setCharAt(i++, '0');
                    } else {
                        i++;
                    }
                }
                seconds++;
            }
            return seconds;
        }

        private boolean hasZeroOneCount(StringBuilder sb) {
            for (int i = 0; i < sb.length() - 1; i++) {
                if (sb.charAt(i) == '0' && sb.charAt(i + 1) == '1') {
                    return true;
                }
            }
            return false;
        }
    }
}
