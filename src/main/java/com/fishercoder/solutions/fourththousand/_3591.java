package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _3591 {
    public static class Solution1 {
        public boolean checkPrimeFrequency(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (isPrime(entry.getValue())) {
                    return true;
                }
            }
            return false;
        }

        private boolean isPrime(Integer n) {
            if (n <= 2) {
                return false;
            }
            boolean[] isPrime = new boolean[n + 1];
            Arrays.fill(isPrime, true);
            isPrime[0] = false;
            isPrime[1] = false;
            for (int i = 2; i < n; i++) {
                if (isPrime[i]) {
                    for (int j = 2; i * j <= n; j++) {
                        isPrime[i * j] = false;
                    }
                }
            }
            return isPrime[n];
        }
    }
}
