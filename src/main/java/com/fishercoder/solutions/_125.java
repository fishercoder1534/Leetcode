package com.fishercoder.solutions;

public class _125 {
    public static class Solution1 {
        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            char[] chars = s.toCharArray();
            while (left < right) {
                while (left < right && !Character.isLetterOrDigit(chars[left])) {
                    left++;
                }
                while (left < right && !Character.isLetterOrDigit(chars[right])) {
                    right--;
                }
                if (Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }
    }
}
