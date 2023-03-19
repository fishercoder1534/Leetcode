package com.fishercoder.solutions;

public class _2595 {
    public static class Solution1 {
        public int[] evenOddBit(int n) {
            String str = Integer.toBinaryString(n);
            String reverse = new StringBuilder(str).reverse().toString();
            int even = 0;
            int odd = 0;
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    if (reverse.charAt(i) == '1') {
                        even++;
                    }
                } else {
                    if (reverse.charAt(i) == '1') {
                        odd++;
                    }
                }
            }
            return new int[]{even, odd};
        }
    }
}
