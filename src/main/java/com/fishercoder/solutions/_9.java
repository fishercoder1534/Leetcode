package com.fishercoder.solutions;

/**
 * 9. Palindrome Number
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 * Some hints:
 *
 * Could negative integers be palindromes? (ie, -1)
 *
 * If you are thinking of converting the integer to string, note the restriction of using extra space.
 *
 * You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?
 *
 * There is a more generic way of solving this problem.
 */
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
