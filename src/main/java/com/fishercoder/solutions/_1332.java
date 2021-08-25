package com.fishercoder.solutions;

public class _1332 {
    public static class Solution1 {
        /**
         * Notice: there are only two characters in the given string: 'a' and 'b'
         */
        public int removePalindromeSub(String s) {
            if (s.isEmpty()) {
                return 0;
            }
            if (s.equals((new StringBuilder(s)).reverse().toString())) {
                return 1;
            }
            return 2;
        }
    }
}
