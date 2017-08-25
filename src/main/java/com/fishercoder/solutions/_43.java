package com.fishercoder.solutions;

/**
 * 43. Multiply Strings
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2.

 Note:

 The length of both num1 and num2 is < 110.
 Both num1 and num2 contains only digits 0-9.
 Both num1 and num2 does not contain any leading zero.
 You must not use any built-in BigInteger library or convert the inputs to integer directly.

 */
public class _43 {

    /**Inspired by https://discuss.leetcode.com/topic/30508/easiest-java-solution-with-graph-explanation
     * Basically, the rule we can find is that products of each two digits will land in this position in the final product:
     * i+j and i+j+1*/
    public String multiply(String num1, String num2) {
        if (isZero(num1) || isZero(num2)) {
            return "0";
        }
        int[] a1 = new int[num1.length()];
        int[] a2 = new int[num2.length()];
        int[] product = new int[num1.length() + num2.length()];

        for (int i = a1.length - 1; i >= 0; i--) {
            for (int j = a2.length - 1; j >= 0; j--) {
                int thisProduct = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
                product[i + j + 1] += thisProduct % 10;
                if (product[i + j + 1] >= 10) {
                    product[i + j + 1] %= 10;
                    product[i + j]++;
                }
                product[i + j] += thisProduct / 10;
                if (product[i + j] >= 10) {
                    product[i + j] %= 10;
                    product[i + j - 1]++;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < product.length; i++) {
            if (i == 0 && product[i] == 0) {
                continue;
            }
            stringBuilder.append(product[i]);
        }
        return stringBuilder.toString();
    }

    private boolean isZero(String num) {
        for (char c : num.toCharArray()) {
            if (c != '0') {
                return false;
            }
        }
        return true;
    }

}
