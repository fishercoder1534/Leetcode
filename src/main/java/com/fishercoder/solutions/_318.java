package com.fishercoder.solutions;

public class _318 {
    public static class Solution1 {
        //Inspired by this awesome post: https://discuss.leetcode.com/topic/35539/java-easy-version-to-understand
        //Idea: this question states that all words consisted of lower case (total only 26 unique chars),
        //this is a big hint that we could use integer (total 32 bits) to represent each char
        //values[i] means how many unique characters this string words[i] has
        public int maxProduct(String[] words) {
            if (words == null || words.length == 0) {
                return 0;
            }
            int len = words.length;
            int[] values = new int[len];
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                for (int j = 0; j < words[i].length(); j++) {
                    values[i] |= 1 << (word.charAt(j)
                            - 'a');//the reason for left shift by this number "word.charAt(j) -'a'" is for 'a', otherwise 'a' - 'a' will be zero and 'a' will be missed out.
                }
            }
            int maxProduct = 0;
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    //check if values[i] AND values[j] equals to zero, this means they share NO common chars
                    if ((values[i] & values[j]) == 0
                            && words[i].length() * words[j].length() > maxProduct) {
                        maxProduct = words[i].length() * words[j].length();
                    }
                }
            }
            return maxProduct;
        }
    }

    public static void main(String... strings) {
        _318 test = new _318();
        String[] words = new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};

        //The following is to understand what does left shift by 1 mean:
        //the tricky part is to understand how it's written for me:
        // "x << y" means left shift x by y bits
        //left shift is equivalent to multiplication of powers of 2, so "4 << 1" equals to " 4 * 2^1"
        //similarly, "4 << 3" equals to "4 * 2^3" which equals "4 * 8"
        String sample = "f";
        int bits = 0;
        int shiftLeftByHowMany = 0;
        int shiftLeftResult = 0;
        for (int j = 0; j < sample.length(); j++) {
            shiftLeftByHowMany = sample.charAt(j) - 'a';
            shiftLeftResult = 1 << shiftLeftByHowMany;
            bits |= 1 << (sample.charAt(j) - 'a');
            //this means shift left 1 by "sample.charAt(j) -'a'" bits
            System.out.println("nonShiftLeft = " + shiftLeftByHowMany + "\tnonShiftLeft binary form is: " + Integer.toBinaryString(shiftLeftByHowMany)
                    + "\nshiftLeft = " + shiftLeftResult + "\tshiftLeft binary form is: " + Integer.toBinaryString(shiftLeftResult)
                    + "\nbits = " + bits + "\tbits binary form is: " + Integer.toBinaryString(bits));
            System.out.println(shiftLeftResult == (1 * Math.pow(2, shiftLeftByHowMany)));
        }

        //similarly, right shift is written like this: "x >> y", means shift x by y bits
        //4 >> 3 equals 4 * 2^3, see below:
        System.out.println(4 * 8 == (4 * Math.pow(2, 3)));
    }
}
