package com.fishercoder.solutions.fourththousand;

public class _3370 {
    public static class Solution1 {
        public int smallestNumber(int n) {
            for (int num = n; ; num++) {
                if (allSetBits(num)) {
                    return num;
                }
            }
        }

        private boolean allSetBits(int num) {
            String binaryStr = Integer.toBinaryString(num);
            for (char c : binaryStr.toCharArray()) {
                if (c != '1') {
                    return false;
                }
            }
            return true;
        }
    }
}
