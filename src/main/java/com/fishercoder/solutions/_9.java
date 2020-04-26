package com.fishercoder.solutions;

public class _9 {
    /**credit: https://discuss.leetcode.com/topic/8090/9-line-accepted-java-code-without-the-need-of-handling-overflow
     * reversing only half and then compare if they're equal.*/
    public static class Solution1 {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            } else if (x == 0) {
                return true;
            } else if (x % 10 == 0) {
                return false;
            }
            int reversed = 0;
            while (x > reversed) {
                int digit = x % 10;
                reversed *= 10;
                reversed += digit;
                x /= 10;
            }
            return (x == reversed || x == reversed / 10);
        }
    }

}
