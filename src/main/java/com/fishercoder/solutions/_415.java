package com.fishercoder.solutions;

/**
 * Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.

 Note:

 The length of both num1 and num2 is < 5100.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class _415 {

    public static String addStrings(String num1, String num2) {
        if (num1 == null || num1.length() == 0) {
            return num2;
        } else if (num2 == null || num2.length() == 0) {
            return num1;
        }

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        long carry = 0;
        long sum = 0;
        StringBuilder sb = new StringBuilder();
        char[] char1 = num1.toCharArray();
        char[] char2 = num2.toCharArray();
        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0) {
                sum += Character.getNumericValue(char1[i--]);
            }
            if (j >= 0) {
                sum += Character.getNumericValue(char2[j--]);
            }
            carry = sum / 10;
            sb.append(sum % 10);
        }
        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

}