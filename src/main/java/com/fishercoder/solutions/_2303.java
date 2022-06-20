package com.fishercoder.solutions;

public class _2303 {
    public static class Solution1 {
        public double calculateTax(int[][] brackets, int income) {
            double taxes = 0.0;
            int lastUpper = 0;
            for (int[] bracket : brackets) {
                int upper = bracket[0];
                double percent = bracket[1] / 100.0;
                if (income > upper) {
                    taxes += (upper - lastUpper) * percent;
                } else {
                    taxes += (income - lastUpper) * percent;
                    break;
                }
                lastUpper = upper;
            }
            return taxes;
        }
    }
}
