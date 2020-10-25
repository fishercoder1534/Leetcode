package com.fishercoder.solutions;

public class _66 {

    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/plus-one/discuss/24082/My-Simple-Java-Solution
         */
        public int[] plusOne(int[] digits) {
            int len = digits.length;
            for (int i = len - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }
                digits[i] = 0;
            }
            int[] newNumber = new int[len + 1];
            newNumber[0] = 1;
            return newNumber;
        }
    }

    public static class Solution2 {
        public int[] plusOne(int[] digits) {
            int len = digits.length;
            for (int i = len - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                } else {
                    digits[i]++;
                    return digits;
                }
            }
            int[] newNumber = new int[len + 1];
            newNumber[0] = 1;
            return newNumber;
        }
    }
}
