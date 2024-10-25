package com.fishercoder.solutions.fourththousand;

public class _3270 {
    public static class Solution1 {
        public int generateKey(int num1, int num2, int num3) {
            String[] padded = new String[3];
            padded[0] = String.format("%04d", num1);
            padded[1] = String.format("%04d", num2);
            padded[2] = String.format("%04d", num3);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < padded[0].length(); i++) {
                sb.append(Math.min(Character.getNumericValue(padded[0].charAt(i)), Math.min(Character.getNumericValue(padded[1].charAt(i)), Character.getNumericValue(padded[2].charAt(i)))));
            }
            return Integer.parseInt(sb.toString());
        }

    }
}
