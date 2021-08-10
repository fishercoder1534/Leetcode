package com.fishercoder.solutions;

public class _204 {

    public static class Solution1 {
        public int countPrimes(int n) {
            boolean[] notPrime = new boolean[n];
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (!notPrime[i]) {
                    count++;
                    for (int j = 2; i * j < n; j++) {
                        notPrime[i * j] = true;
                    }
                }
            }
            return count;
        }
    }
}
