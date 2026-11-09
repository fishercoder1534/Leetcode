package com.fishercoder.solutions.thirdthousand;

public class _2396 {
    public static class Solution1 {
        public boolean isStrictlyPalindromic(int n) {
            for (int base = 2; base <= n - 2; base++) {
                String number = Integer.toString(n, base);
                if (!isPalindrome(number)) {
                    return false;
                }
            }
            return true;
        }

        private boolean isPalindrome(String number) {
            int left = 0;
            int right = number.length() - 1;
            while (left < right) {
                if (number.charAt(left++) != number.charAt(right--)) {
                    return false;
                }
            }
            return true;
        }
    }
}
