package com.fishercoder.solutions;

public class _125 {

    public static class Solution1 {
        public boolean isPalindrome(String s) {
            int i = 0;
            int j = s.length() - 1;
            char[] chars = s.toCharArray();
            while (i < j) {
                while (i < j && !Character.isLetterOrDigit(chars[i])) {
                    i++;
                }
                while (i < j && !Character.isLetterOrDigit(chars[j])) {
                    j--;
                }
                if (Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])) {
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
}
