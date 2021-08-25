package com.fishercoder.solutions;

public class _1869 {
    public static class Solution1 {
        public boolean checkZeroOnes(String s) {
            int zeroes = 0;
            int ones = 0;
            for (int i = 0; i < s.length(); ) {
                int start = i;
                while (i < s.length() && s.charAt(i) == '0') {
                    i++;
                }
                if (i > start) {
                    zeroes = Math.max(zeroes, i - start);
                }
                start = i;
                while (i < s.length() && s.charAt(i) == '1') {
                    i++;
                }
                if (i > start) {
                    ones = Math.max(ones, i - start);
                }
            }
            return ones > zeroes;
        }
    }
}
