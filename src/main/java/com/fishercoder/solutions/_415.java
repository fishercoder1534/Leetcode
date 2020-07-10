package com.fishercoder.solutions;

public class _415 {

    public static class Solution1 {
        public String addStrings(String num1, String num2) {
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

}