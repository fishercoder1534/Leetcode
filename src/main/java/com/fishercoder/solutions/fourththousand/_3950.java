package com.fishercoder.solutions.fourththousand;

public class _3950 {
    public static class Solution1 {
        public boolean consecutiveSetBits(int n) {
            String bin = Integer.toBinaryString(n);
            int pairs = 0;
            for (int i = 0; i < bin.length() - 1; i++) {
                if (bin.charAt(i) == '1' && bin.charAt(i + 1) == '1') {
                    pairs++;
                }
                if (pairs >= 2) {
                    return false;
                }
            }
            return pairs == 1;
        }
    }
}
