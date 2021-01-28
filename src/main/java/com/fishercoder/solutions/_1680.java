package com.fishercoder.solutions;

public class _1680 {
    public static class Solution1 {
        public int concatenatedBinary(int n) {
            final int MOD = 1000000007;
            int result = 0;
            for (int i = 1; i <= n; i++) {
                String binary = Integer.toBinaryString(i);
                for (int j = 0; j < binary.length(); j++) {
                    result = (result * 2 + (binary.charAt(j) - '0')) % MOD;
                }
            }
            return result;
        }
    }
}
