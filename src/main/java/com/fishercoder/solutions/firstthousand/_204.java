package com.fishercoder.solutions.firstthousand;

public class _204 {
    public static class Solution1 {
        /**
         * Reference: https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
         * This is an ancient algorithm to efficiently count the number of primes up to a given point:
         * it does so iteratively by marking composite (i.e. not prime) the multiples of each prime,
         * starting from 2, then all remaining ones are prime.
         */
        public int countPrimes(int n) {
            boolean[] notPrimes = new boolean[n];
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (!notPrimes[i]) {
                    count++;
                    for (int j = 2; i * j < n; j++) {
                        notPrimes[i * j] = true;
                    }
                }
            }
            return count;
        }
    }
}
