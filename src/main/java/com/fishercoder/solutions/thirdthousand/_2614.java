package com.fishercoder.solutions.thirdthousand;

public class _2614 {
    public static class Solution1 {
        public int diagonalPrime(int[][] nums) {
            int ans = 0;
            boolean[] nonPrimes = generatePrimes((int) (Math.pow(10, 6) * 4));
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[0].length; j++) {
                    if (i == j || i == nums.length - j - 1) {
                        if (!nonPrimes[nums[i][j]]) {
                            ans = Math.max(ans, nums[i][j]);
                        }
                    }
                }
            }
            return ans;
        }

        private boolean[] generatePrimes(int n) {
            boolean[] nonPrimes = new boolean[n];
            // 1 is not a prime number
            nonPrimes[1] = true;
            for (int i = 2; i < n; i++) {
                if (!nonPrimes[i]) {
                    for (int j = 2; i * j < n; j++) {
                        nonPrimes[i * j] = true;
                    }
                }
            }
            return nonPrimes;
        }
    }
}
