package com.fishercoder.solutions;

public class _7 {

    public static class Solution1 {
        /**This solution is NOT meeting the problem requirement actually:
         * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].*/
        public int reverse(int x) {
            long result = 0;
            while (x != 0) {
                result = result * 10 + x % 10;
                x /= 10;
                System.out.println("result = " + result);
                if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                    System.out.println("break out..");
                    return 0;
                }
            }
            return (int) result;
        }
    }

    public static class Solution2 {
        /**credit: https://leetcode.com/problems/reverse-integer/discuss/4060/My-accepted-15-lines-of-code-for-Java*/
        public int reverse(int x) {
            int result = 0;
            while (x != 0) {
                int lastDigit = x % 10;
                int newResult = result * 10 + lastDigit;
                if (result != (newResult - lastDigit) / 10) {
                    return 0;
                }
                x /= 10;
                result = newResult;
            }
            return result;
        }
    }
}