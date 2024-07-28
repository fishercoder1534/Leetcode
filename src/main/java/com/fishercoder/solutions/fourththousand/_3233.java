package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;

public class _3233 {
    public static class Solution1 {
        /**
         * credit: https://leetcode.com/problems/find-the-count-of-numbers-which-are-not-special/solutions/5546339/sieve-of-eratosthenes/
         * In order for a number to be special, it must be a square of a prime number;
         * so we use sieve algorithm to find all prime numbers up to Math.sqrt(r);
         * since Math.sqrt() method rounds down, we'll use Math.sqrt(r) + 1 as the bound for isPrime array
         * and check if the number is within the range of [l, r] later.
         */
        public int nonSpecialCount(int l, int r) {
            int limit = (int) Math.sqrt(r);
            boolean[] isPrime = new boolean[limit + 1];
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;
            for (int i = 2; i * i < isPrime.length; i++) {
                if (isPrime[i]) {
                    //below for loop is key to construct isPrime[] array:
                    //we start j from i * i, as long as j is within boundary, we increase j by i each time
                    //i.e. if i = 2, j starts from 4, then 6, 8, 10, 12
                    //if i = 3, j starts from 9, then 12, 15, 18, 21
                    for (int j = i * i; j < isPrime.length; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            //now count special numbers
            int special = 0;
            for (int i = Math.max(2, (int) Math.sqrt(l)); i < isPrime.length; i++) {
                if (isPrime[i]) {
                    int square = i * i;
                    if (square <= r && square >= l) {
                        special++;
                    }
                }
            }
            //total number of numbers in this range
            int totalCount = r - l + 1;
            //minus the special ones
            return totalCount - special;
        }

    }
}
