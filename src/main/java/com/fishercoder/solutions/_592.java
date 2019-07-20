package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 592. Fraction Addition and Subtraction
 *
 * Given a string representing an expression of fraction addition and subtraction,
 * you need to return the calculation result in string format.
 * The final result should be irreducible fraction.
 * If your final result is an integer,
 * say 2, you need to change it to the format of fraction that has denominator 1.
 * So in this case, 2 should be converted to 2/1.

 Example 1:
 Input:"-1/2+1/2"
 Output: "0/1"

 Example 2:
 Input:"-1/2+1/2+1/3"
 Output: "1/3"

 Example 3:
 Input:"1/3-1/2"
 Output: "-1/6"

 Example 4:
 Input:"5/3+1/3"
 Output: "2/1"

 Note:
 The input string only contains '0' to '9', '/', '+' and '-'. So does the output.
 Each fraction (input and output) has format ±numerator/denominator.
 If the first input fraction or the output is positive, then '+' will be omitted.
 The input only contains valid irreducible fractions,
 where the numerator and denominator of each fraction will always be in the range [1,10].
 If the denominator is 1, it means this fraction is actually an integer in a fraction format defined above.
 The number of given fractions will be in the range [1,10].
 The numerator and denominator of the final result are guaranteed to be valid and in the range of 32-bit int.
 */
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
