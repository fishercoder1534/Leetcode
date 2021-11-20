package com.fishercoder.solutions;

public class _461 {
    public static class Solution1 {
        public int hammingDistance(int x, int y) {
            int n = x ^ y;
            int count = 0;
            while (n != 0) {
                count++;
                n &= (n - 1);
            }
            return count;
        }
    }

    public static class Solution2 {
        public int hammingDistance(int x, int y) {
            int ans = 0;
            for (int i = 0; i < 32; i++) {
                ans += (x & 1) ^ (y & 1);
                x >>= 1;
                y >>= 1;
            }
            return ans;
        }
    }

    public static class Solution3 {
        public int hammingDistance(int x, int y) {
            return Integer.bitCount(x ^ y);
        }
    }
}
