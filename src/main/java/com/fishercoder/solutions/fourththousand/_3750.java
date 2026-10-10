package com.fishercoder.solutions.fourththousand;

public class _3750 {
    public static class Solution1 {
        public int minimumFlips(int n) {
            String binForm = Integer.toBinaryString(n);
            String reversed = new StringBuilder(binForm).reverse().toString();
            int flips = 0;
            for (int i = 0; i < binForm.length(); i++) {
                if (binForm.charAt(i) != reversed.charAt(i)) {
                    flips++;
                }
            }
            return flips;
        }
    }
}
