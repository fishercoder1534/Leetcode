package com.fishercoder.solutions.fourththousand;

public class _3622 {
    public static class Solution1 {
        public boolean checkDivisibility(int n) {
            int sum = 0;
            int product = 1;
            int original = n;
            while (n > 0) {
                sum += n % 10;
                product *= n % 10;
                n = n / 10;
            }
            return original % (sum + product) == 0;
        }
    }
}
