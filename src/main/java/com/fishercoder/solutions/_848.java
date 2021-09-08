package com.fishercoder.solutions;

public class _848 {
    public static class Solution1 {
        public String shiftingLetters(String s, int[] shifts) {
            long[] preSums = new long[shifts.length];//use long type to avoid integer addition overflow
            for (int i = shifts.length - 1; i >= 0; i--) {
                if (i < shifts.length - 1) {
                    preSums[i] = preSums[i + 1] + shifts[i];
                } else {
                    preSums[i] = shifts[i];
                }
                preSums[i] %= 26;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                int newChar = s.charAt(i) + (int) preSums[i] % 26;
                if (newChar > 122) {
                    sb.append((char) (newChar - 122 + 96));
                } else {
                    sb.append((char) (newChar));
                }
            }
            return sb.toString();
        }
    }
}
