package com.fishercoder.solutions;

public class _58 {

    public static class Solution1 {
        public int lengthOfLastWord(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            s = s.trim();
            int n = s.length() - 1;
            while (n >= 0 && s.charAt(n) != ' ') {
                n--;
            }
            return s.length() - n - 1;
        }
    }

}
