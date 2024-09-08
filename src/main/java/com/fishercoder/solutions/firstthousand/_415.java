package com.fishercoder.solutions.firstthousand;

public class _415 {

    public static class Solution1 {
        /*
         * My completely original solution on 10/14/2021.
         */
        public String addStrings(String num1, String num2) {
            StringBuilder sb = new StringBuilder();
            int i = num1.length() - 1;
            int j = num2.length() - 1;
            int carry = 0;
            while (i >= 0 || j >= 0) {
                int sum = carry;
                if (i >= 0) {
                    sum += Character.getNumericValue(num1.charAt(i));
                }
                if (j >= 0) {
                    sum += Character.getNumericValue(num2.charAt(j));
                }
                sb.append(sum % 10);
                carry = sum / 10;
                i--;
                j--;
            }
            if (carry > 0) {
                sb.append(carry);
            }
            return sb.reverse().toString();
        }
    }

    public static class Solution2 {
        /*
         * This is an optimized version of Solution1, on LeetCode, this version beats 100% while Solution1 beats only 67%.
         */
        public String addStrings(String num1, String num2) {
            StringBuilder sb = new StringBuilder();
            int i = num1.length() - 1;
            int j = num2.length() - 1;
            int carry = 0;
            while (i >= 0 || j >= 0 || carry > 0) {
                int sum = carry;
                if (i >= 0) {
                    sum += num1.charAt(i) - '0';
                }
                if (j >= 0) {
                    sum += num2.charAt(j) - '0';
                }
                sb.append(sum % 10);
                carry = sum / 10;
                i--;
                j--;
            }
            return sb.reverse().toString();
        }
    }
}
