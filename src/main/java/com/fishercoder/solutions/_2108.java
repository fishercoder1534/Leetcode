package com.fishercoder.solutions;

public class _2108 {
    public static class Solution1 {
        public String firstPalindrome(String[] words) {
            for (String word : words) {
                if (isPal(word)) {
                    return word;
                }
            }
            return "";
        }

        private boolean isPal(String word) {
            int left = 0;
            int right = word.length() - 1;
            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    return false;
                } else {
                    left++;
                    right--;
                }
            }
            return true;
        }
    }
}
