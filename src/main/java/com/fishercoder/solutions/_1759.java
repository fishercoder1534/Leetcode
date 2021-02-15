package com.fishercoder.solutions;

public class _1759 {
    public static class Solution1 {
        /**
         * a -> 1
         * aa -> 3
         * aaa -> 6
         * aaaa -> 10
         * aaaaa -> 15
         */
        public int countHomogenous(String s) {
            int total = 0;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                    count++;
                } else {
                    count = 1;
                }
                total = (total + count) % 1000000007;
            }
            return total;
        }
    }
}
