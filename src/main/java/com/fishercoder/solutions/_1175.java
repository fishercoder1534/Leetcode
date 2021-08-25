package com.fishercoder.solutions;

import java.math.BigInteger;
import java.util.Arrays;

public class _1175 {
    public static class Solution1 {
        //credit: https://leetcode.com/problems/prime-arrangements/discuss/371884/Simple-Java-With-comment-sieve_of_eratosthenes
        static int MOD = 1000000007;

        public static int numPrimeArrangements(int n) {
            int numberOfPrimes = generatePrimes(n);
            BigInteger x = factorial(numberOfPrimes);
            BigInteger y = factorial(n - numberOfPrimes);
            return x.multiply(y).mod(BigInteger.valueOf(MOD)).intValue();
        }

        public static BigInteger factorial(int n) {
            BigInteger fac = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                fac = fac.multiply(BigInteger.valueOf(i));
            }
            return fac.mod(BigInteger.valueOf(MOD));
        }

        public static int generatePrimes(int n) {
            boolean[] prime = new boolean[n + 1];
            Arrays.fill(prime, 2, n + 1, true);
            for (int i = 2; i * i <= n; i++) {
                if (prime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        prime[j] = false;
                    }
                }
            }
            int count = 0;
            for (int i = 0; i < prime.length; i++) {
                if (prime[i]) {
                    count++;
                }
            }

            return count;
        }
    }
}
