package com.fishercoder.solutions;

public class _43 {

    public static class Solution1 {
        /**
         * Inspired by https://discuss.leetcode.com/topic/30508/easiest-java-solution-with-graph-explanation
         * Basically, the rule we can find is that products of each two digits will land in this position in the final product:
         * i+j and i+j+1
         */
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

    public static class Solution2 {
        /**
         * My completely original solution on 10/14/2021.
         *
         * Gist: just use string instead of integers for times variable, otherwise guaranteed to overflow/underflow!
         * Also: using a pen and paper to visualize how this works out helps a great deal!
         */
        public String multiply(String num1, String num2) {
            String previous = "";
            String j = "";
            for (int i = num2.length() - 1; i >= 0; i--, j += "0") {
                String intermediate = multiplyBySingleDigit(num1, Character.getNumericValue(num2.charAt(i)), j);
                String result = add(intermediate, previous);
                previous = result;
            }
            int i = 0;
            for (; i < previous.length(); i++) {
                if (previous.charAt(i) != '0') {
                    break;
                }
            }
            return i == previous.length() ? "0" : previous.substring(i);
        }

        private String add(String num1, String num2) {
            int i = num1.length() - 1;
            int j = num2.length() - 1;
            int carry = 0;
            StringBuilder sb = new StringBuilder();
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

        private String multiplyBySingleDigit(String num, int multiplier, String times) {
            if (multiplier == 0) {
                return "0";
            }
            StringBuilder sb = new StringBuilder();
            int carry = 0;
            for (int i = num.length() - 1; i >= 0; i--) {
                int val = Character.getNumericValue(num.charAt(i));
                int product = val * multiplier;
                product += carry;
                sb.append(product % 10);
                carry = product / 10;
            }
            if (carry > 0) {
                sb.append(carry);
            }
            return sb.reverse() + times;
        }
    }

}
