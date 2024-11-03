package com.fishercoder.solutions.fourththousand;

public class _3340 {
    public static class Solution1 {
        public boolean isBalanced(String num) {
            int oddSum = 0;
            int evenSum = 0;
            for (int i = 0; i < num.length(); i++) {
                if (i % 2 == 0) {
                    evenSum += Character.getNumericValue(num.charAt(i));
                } else {
                    oddSum += Character.getNumericValue(num.charAt(i));
                }
            }
            return oddSum == evenSum;
        }
    }
}
