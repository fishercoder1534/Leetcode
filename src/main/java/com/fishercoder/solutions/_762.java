package com.fishercoder.solutions;

public class _762 {
    public static class Solution1 {
        public int countPrimeSetBits(int L, int R) {
            int count = 0;
            for (int i = L; i <= R; i++) {
                if (hasPrimeNumberSetBits(i)) {
                    count++;
                }
            }
            return count;
        }

        private boolean hasPrimeNumberSetBits(int num) {
            int k = getSetBits(num);
            if (k <= 1) {
                return false;
            }
            for (int i = 2; i * i <= k; i++) {
                if (k % i == 0) {
                    return false;
                }
            }
            return true;
        }

        private int getSetBits(int n) {
            int bits = 0;
            while (n != 0) {
                bits++;
                n &= (n - 1);
            }
            return bits;
        }
    }
}
