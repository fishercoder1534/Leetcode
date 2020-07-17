package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _592 {

    public static class Solution1 {

        /**
         * Credit: https://discuss.leetcode.com/topic/89993/java-solution-fraction-addition-and-gcd
         */
        public String fractionAddition(String expression) {
            List<String> nums = new ArrayList<>();
            int i = 0;
            int j = 0;
            while (j <= expression.length()) {
                if (j == expression.length() || j != i && (expression.charAt(j) == '-' || expression.charAt(j) == '+')) {
                    if (expression.charAt(i) == '+') {
                        nums.add(expression.substring(i + 1, j));
                    } else {
                        nums.add(expression.substring(i, j));
                    }
                    i = j;
                }
                j++;
            }

            String result = "0/1";
            for (String frac : nums) {
                result = add(result, frac);
            }
            return result;
        }

        private String add(String result, String frac) {
            String[] frac1 = frac.split("/");
            String[] frac2 = result.split("/");
            int n1 = Integer.parseInt(frac1[0]);
            int d1 = Integer.parseInt(frac1[1]);
            int n2 = Integer.parseInt(frac2[0]);
            int d2 = Integer.parseInt(frac2[1]);
            int numerator = n1 * d2 + n2 * d1;
            int denominator = d1 * d2;
            if (numerator == 0) {
                return "0/1";
            }

            boolean negative = numerator * denominator < 0;
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
            int gcd = getGCD(numerator, denominator);

            return (negative ? "-" : "") + (numerator / gcd) + "/" + (denominator / gcd);
        }

        private int getGCD(int a, int b) {
            if (a == 0 || b == 0) {
                return a + b;
            }
            return getGCD(b, a % b);
        }
    }

}
