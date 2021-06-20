package com.fishercoder.solutions;

public class _1903 {
    public static class Solution1 {
        public String largestOddNumber(String num) {
            for (int i = num.length() - 1; i >= 0; i--) {
                if (Integer.parseInt("" + num.charAt(i)) % 2 == 1) {
                    return num.substring(0, i + 1);
                }
            }
            return "";
        }
    }
}
