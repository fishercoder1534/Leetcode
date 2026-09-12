package com.fishercoder.solutions.fifththousand;

public class _4030 {
    public static class Solution1 {
        public boolean isPalindromic(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : s.toCharArray()) {
                stringBuilder.append(
                        String.format("%8s", Integer.toBinaryString(c)).replace(' ', '0'));
            }
            String binaryString = stringBuilder.toString();
            for (int left = 0, right = binaryString.length() - 1; left < right; left++, right--) {
                if (binaryString.charAt(left) != binaryString.charAt(right)) {
                    return false;
                }
            }
            return true;
        }
    }
}
