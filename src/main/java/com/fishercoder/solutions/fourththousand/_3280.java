package com.fishercoder.solutions.fourththousand;

public class _3280 {
    public static class Solution1 {
        public String convertDateToBinary(String date) {
            String[] parts = date.split("-");
            StringBuilder sb = new StringBuilder();
            for (String part : parts) {
                sb.append(Integer.toBinaryString(Integer.parseInt(part)));
                sb.append("-");
            }
            sb.setLength(sb.length() - 1);
            return sb.toString();
        }
    }
}
