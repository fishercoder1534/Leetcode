package com.fishercoder.solutions.fifththousand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4079 {
    public static class Solution1 {
        public List<Integer> maxPrimes(int n, int s) {
            List<Integer> res = new ArrayList();
            List<Integer> primes = buildPrimes(n + 1);
            int sum = 0;
            for (int i = 0; i < primes.size(); i++) {
                if (sum + primes.get(i) <= s) {
                    sum += primes.get(i);
                    res.add(primes.get(i));
                } else {
                    return res;
                }
            }
            return res;
        }

        private List<Integer> buildPrimes(int n) {
            boolean[] isPrime = new boolean[n];
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    for (int j = 2; i * j < n; j++) {
                        isPrime[i * j] = false;
                    }
                }
            }
            List<Integer> res = new ArrayList();
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    res.add(i);
                }
            }
            return res;
        }
    }
}
