package com.fishercoder.solutions;

public class _372 {
    public static class Solution1 {
        public int superPow(int a, int[] b) {
            if (a % 1337 == 0) {
                return 0;
            }
            int p = 0;
            for (int i : b) {
                p = (p * 10 + i) % 1140;
            }
            if (p == 0) {
                p += 1140;
            }
            return power(a, p, 1337);
        }

        private int power(int a, int n, int mod) {
            a %= mod;
            int result = 1;
            while (n != 0) {
                if ((n & 1) != 0) {
                    result = result * a % mod;
                }
                a = a * a % mod;
                n >>= 1;
            }
            return result;
        }
    }
}
