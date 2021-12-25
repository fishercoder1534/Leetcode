package com.fishercoder.solutions;

public class _2116 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/discuss/1646594/Left-to-right-and-right-to-left
         */
        public boolean canBeValid(String s, String locked) {
            return s.length() % 2 == 0 && valid(s, locked, '(') && valid(s, locked, ')');
        }

        private boolean valid(String s, String locked, char op) {
            int balance = 0;
            int wildcards = 0;
            int direction = op == '(' ? 1 : -1;
            int start = op == '(' ? 0 : s.length() - 1;
            for (int i = start; i < s.length() && i >= 0 && balance + wildcards >= 0; i += direction) {
                if (locked.charAt(i) == '1') {
                    balance += s.charAt(i) == op ? 1 : -1;
                } else {
                    wildcards++;
                }
            }
            return wildcards + balance >= 0 && balance <= wildcards;
        }
    }
}
