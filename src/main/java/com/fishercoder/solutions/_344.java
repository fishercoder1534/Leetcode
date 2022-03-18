package com.fishercoder.solutions;

public class _344 {
    public static class Solution1 {
        public void reverseString(char[] s) {
            for (int left = 0, right = s.length - 1; left < right; left++, right--) {
                char tmp = s[left];
                s[left] = s[right];
                s[right] = tmp;
            }
        }
    }
}
