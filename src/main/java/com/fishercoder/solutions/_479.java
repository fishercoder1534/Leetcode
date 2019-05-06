package com.fishercoder.solutions;

/**
 * 479. Largest Palindrome Product
 *
 * Find the largest palindrome made from the product of two n-digit numbers.
 Since the result could be very large, you should return the largest palindrome mod 1337.

 Example:
 Input: 2
 Output: 987

 Explanation: 99 x 91 = 9009, 9009 % 1337 = 987

 Note:
 The range of n is [1,8].
 */
public class _479 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/74125/java-solution-using-assumed-max-palindrom
         */
        public int largestPalindrome(int n) {
            // if input is 1 then max is 9
            if (n == 1) {
                return 9;
            }

            // if n = 3 then upperBound = 999 and lowerBound = 99
            int upperBound = (int) Math.pow(10, n) - 1;
            int lowerBound = upperBound / 10;
            long maxNumber = (long) upperBound * (long) upperBound;

            // represents the first half of the maximum assumed palindrom.
            // e.g. if n = 3 then maxNumber = 999 x 999 = 998001 so firstHalf = 998
            int firstHalf = (int) (maxNumber / (long) Math.pow(10, n));

            boolean palindromFound = false;
            long palindrom = 0;

            while (!palindromFound) {
                // creates maximum assumed palindrom
                // e.g. if n = 3 first time the maximum assumed palindrom will be 998 899
                palindrom = createPalindrom(firstHalf);

                // here i and palindrom/i forms the two factor of assumed palindrom
                for (long i = upperBound; upperBound > lowerBound; i--) {
                    // if n= 3 none of the factor of palindrom  can be more than 999 or less than square root of assumed palindrom
                    if (palindrom / i > maxNumber || i * i < palindrom) {
                        break;
                    }

                    // if two factors found, where both of them are n-digits,
                    if (palindrom % i == 0) {
                        palindromFound = true;
                        break;
                    }
                }

                firstHalf--;
            }
            return (int) (palindrom % 1337);
        }

        private long createPalindrom(long num) {
            String str = num + new StringBuilder().append(num).reverse().toString();
            return Long.parseLong(str);
        }
    }
}
