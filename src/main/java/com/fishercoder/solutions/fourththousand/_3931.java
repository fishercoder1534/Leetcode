package com.fishercoder.solutions.fourththousand;

public class _3931 {
    public static class Solution1 {
        public boolean isAdjacentDiffAtMostTwo(String s) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (Math.abs(Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(i + 1))) > 2) {
                    return false;
                }
            }
            return true;
        }
    }
}
