package com.fishercoder.solutions.secondthousand;

public class _1071 {
    public static class Solution1 {
        /**
         * Time: O(min(m, n) * (m+n))
         * Space: O(min(m, n))
         */
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

    public static class Solution2 {
        /**
         * My completely original solution on 10/7/2026.
         */
        public String gcdOfStrings(String str1, String str2) {
            String shorter = str1.length() > str2.length() ? str2 : str1;
            String longer = shorter.equals(str1) ? str2 : str1;
            StringBuilder sb = new StringBuilder();
            for (int i = shorter.length(); i > 0; i--) {
                String candidate = shorter.substring(0, i);
                if (longer.length() % candidate.length() == 0) {
                    int times = longer.length() / candidate.length();
                    sb.setLength(0);
                    while (times-- > 0) {
                        sb.append(candidate);
                    }
                    if (sb.toString().equals(longer)) {
                        //then check if shorter could be formed by candidate as well
                        times = shorter.length() / candidate.length();
                        sb.setLength(0);
                        while (times-- > 0) {
                            sb.append(candidate);
                        }
                        if (sb.toString().equals(shorter)) {
                            return candidate;
                        }
                    }
                }
            }
            return "";
        }
    }

    public static class Solution3 {
        /**
         * This is the most optimal solution recommended by Gemini :)
         */
        public String gcdOfStrings(String str1, String str2) {
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }
            int gcdLength = gcd(str1.length(), str2.length());
            return str1.substring(0, gcdLength);
        }

        private int gcd(int a, int b) {
            while (a != 0) {
                int tmp = a;
                a = b % a;
                b = tmp;
            }
            return b;
        }
    }
}
