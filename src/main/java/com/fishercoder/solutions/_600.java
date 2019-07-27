package com.fishercoder.solutions;

/**
 * 600. Non-negative Integers without Consecutive Ones
 *
 * Given a positive integer n, find the number of non-negative integers less than or equal to n, whose binary representations do NOT contain consecutive ones.

 Example 1:
 Input: 5
 Output: 5
 Explanation:
 Here are the non-negative integers <= 5 with their corresponding binary representations:
 0 : 0
 1 : 1
 2 : 10
 3 : 11
 4 : 100
 5 : 101
 Among them, only integer 3 disobeys the rule (two consecutive ones) and the other 5 satisfy the rule.

 Note: 1 <= n <= 109
 */
public class _600 {

    public static class Solution1 {
        /**
         * Credit: https://leetcode.com/articles/non-negative-integers-without-consecutive-ones/#approach-3-using-bit-manipulation-accepted
         */
        public int findIntegers(int num) {
            int[] f = new int[32];
            f[0] = 1;
            f[1] = 2;
            for (int i = 2; i < f.length; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
            int i = 30;
            int sum = 0;
            int prevBit = 0;
            while (i >= 0) {
                if ((num & (1 << i)) != 0) {
                    sum += f[i];
                    if (prevBit == 1) {
                        sum--;
                        break;
                    }
                    prevBit = 1;
                } else {
                    prevBit = 0;
                }
                i--;
            }
            return sum + 1;
        }
    }

}
