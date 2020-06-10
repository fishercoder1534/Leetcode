package com.fishercoder.solutions;

public class _344 {
    public static class Solution1 {
        public String reverseString(String s) {
            int i = 0;
            int j = s.length() - 1;
            char[] chars = s.toCharArray();
            while (i < j) {
                char temp = chars[i];
                chars[i++] = chars[j];
                chars[j--] = temp;
            }
            return new String(chars);
        }
    }
}
