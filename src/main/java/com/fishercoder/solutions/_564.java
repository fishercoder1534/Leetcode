package com.fishercoder.solutions;

public class _564 {
    public static class Solution1 {

        public String nearestPalindromic(String n) {
            if (n.length() >= 2 && allNine(n)) {
                String s = "1";
                for (int i = 0; i < n.length() - 1; i++) {
                    s += "0";
                }
                s += "1";
                return s;
            }
            boolean isOdd = (n.length() % 2 != 0);
            String left = n.substring(0, (n.length() + 1) / 2);
            long[] increment = {-1, 0, +1};
            String ret = n;
            long minDiff = Long.MAX_VALUE;
            for (long i : increment) {
                String s = getPalindrom(Long.toString(Long.parseLong(left) + i), isOdd);
                if (n.length() >= 2 && (s.length() != n.length() || Long.parseLong(s) == 0)) {
                    s = "";
                    for (int j = 0; j < n.length() - 1; j++) {
                        s += "9";
                    }
                }
                long diff = s.equals(n) ? Long.MAX_VALUE : Math.abs(Long.parseLong(s) - Long.parseLong(n));
                if (diff < minDiff) {
                    minDiff = diff;
                    ret = s;
                }
            }
            return ret;
        }

        private String getPalindrom(String s, boolean isOdd) {
            String right = new StringBuilder(s).reverse().toString();
            return isOdd ? s.substring(0, s.length() - 1) + right : s + right;
        }

        private boolean allNine(String s) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '9') {
                    return false;
                }
            }
            return true;
        }
    }
}
