package com.fishercoder.solutions.thirdthousand;

public class _2697 {
    public static class Solution1 {
        public String makeSmallestPalindrome(String s) {
            char[] charArray = s.toCharArray();
            for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
                if (charArray[i] != charArray[j]) {
                    if (charArray[i] < charArray[j]) {
                        charArray[j] = charArray[i];
                    } else {
                        charArray[i] = charArray[j];
                    }
                }
            }
            return new String(charArray);
        }
    }
}
