package com.fishercoder.solutions;

public class _2042 {
    public static class Solution1 {
        public boolean areNumbersAscending(String s) {
            String[] words = s.split("\\ ");
            int prev = 0;
            for (String word : words) {
                if (Character.isDigit(word.charAt(0))) {
                    if (Integer.parseInt(word) <= prev) {
                        return false;
                    } else {
                        prev = Integer.parseInt(word);
                    }
                }
            }
            return true;
        }
    }
}
