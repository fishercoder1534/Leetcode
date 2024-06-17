package com.fishercoder.solutions.thirdthousand;

public class _2710 {
    public static class Solution1 {
        public String removeTrailingZeros(String num) {
            StringBuilder sb = new StringBuilder();
            boolean trailing = true;
            for (int i = num.length() - 1; i >= 0; i--) {
                if (num.charAt(i) != '0' || !trailing) {
                    sb.append(num.charAt(i));
                    trailing = false;
                }
            }
            return sb.reverse().toString();
        }
    }
}
