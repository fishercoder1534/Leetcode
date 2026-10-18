package com.fishercoder.solutions.firstthousand;

import java.util.Arrays;

public class _204 {
    public static class Solution1 {
        /**
         * Reference: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
         * This is an ancient algorithm to efficiently count the number of primes up to a given point:
         * it does so iteratively by marking composite (i.e. not prime) the multiples of each prime,
         * starting from 2, then all remaining ones are prime.
         */
        public int countPrimes(int n) {
            if (n <= 1) {
                return 0;
            }
            boolean[] isPrime = new boolean[n];
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    count++;
                    for (int j = 2; i * j < n; j++) {
                        isPrime[i * j] = false;
                    }
                }
            }
            return count;
        }
    }
}
