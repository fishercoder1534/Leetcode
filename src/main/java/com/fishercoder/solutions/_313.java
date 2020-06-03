package com.fishercoder.solutions;

public class _313 {

    public static class Solution1 {
        public int nthSuperUglyNumber(int n, int[] primes) {
            int[] ret = new int[n];
            ret[0] = 1;

            int[] indexes = new int[primes.length];

            for (int i = 1; i < n; i++) {
                ret[i] = Integer.MAX_VALUE;

                for (int j = 0; j < primes.length; j++) {
                    ret[i] = Math.min(ret[i], primes[j] * ret[indexes[j]]);
                }

                for (int j = 0; j < indexes.length; j++) {
                    if (ret[i] == primes[j] * ret[indexes[j]]) {
                        indexes[j]++;
                    }
                }
            }
            return ret[n - 1];
        }
    }

}
