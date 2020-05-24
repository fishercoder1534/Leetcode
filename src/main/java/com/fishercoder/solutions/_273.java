package com.fishercoder.solutions;

public class _273 {

    public static class Solution1 {
        private String[] belowTen = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        private String[] belowTwenty = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        private String[] belowHundred = new String[]{"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        private String[] overThousand = new String[]{"Thousand", "Million", "Billion"};

        public String numberToWords(int num) {
            String result;
            if (num == 0) {
                return belowTen[num];
            }

            result = hundredHelper(num % 1000);
            num = num / 1000;
            int i = 0;
            while (i < 3 && num > 0) {
                if (num % 1000 > 0) {
                    result = hundredHelper(num % 1000) + overThousand[i] + " " + result;
                }
                num = num / 1000;
                i++;
            }

            return result.trim();
        }

        private String hundredHelper(int num) {
            String nstr = "";
            if (num >= 100) {
                nstr = belowTen[num / 100] + " Hundred ";
            }
            num = num % 100;
            if (num >= 20) {
                if (num % 10 != 0) {
                    nstr = nstr + belowHundred[num / 10 - 2] + " " + belowTen[num % 10] + " ";
                } else {
                    nstr = nstr + belowHundred[num / 10 - 2] + " ";
                }
            } else if (num >= 10) {
                nstr = nstr + belowTwenty[num % 10] + " ";
            } else if (num > 0) {
                nstr = nstr + belowTen[num] + " ";
            }
            return nstr;
        }
    }
}
