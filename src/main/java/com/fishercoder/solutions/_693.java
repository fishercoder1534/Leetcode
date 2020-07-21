package com.fishercoder.solutions;

public class _693 {
    public static class Solution1 {
        public boolean hasAlternatingBits(int n) {
            String binaryStr = Integer.toBinaryString(n);
            for (int i = 1; i < binaryStr.length(); i++) {
                if (binaryStr.charAt(i - 1) == binaryStr.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public static class Solution2 {
        public boolean hasAlternatingBits(int n) {
            return Integer.bitCount(((n >> 1) ^ n) + 1) == 1;
        }
    }
}
