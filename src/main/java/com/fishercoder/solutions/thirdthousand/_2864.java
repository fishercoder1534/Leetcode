package com.fishercoder.solutions.thirdthousand;

public class _2864 {
    public static class Solution1 {
        public String maximumOddBinaryNumber(String s) {
            int ones = 0;
            for (char c : s.toCharArray()) {
                if (c == '1') {
                    ones++;
                }
            }
            int zeroes = s.length() - ones;
            StringBuilder sb = new StringBuilder();
            while (ones-- > 1) {
                sb.append(1);
            }
            while (zeroes-- > 0) {
                sb.append(0);
            }
            sb.append(1);
            return sb.toString();
        }
    }
}
