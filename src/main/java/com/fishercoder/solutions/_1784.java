package com.fishercoder.solutions;

public class _1784 {
    public static class Solution1 {
        public boolean checkOnesSegment(String s) {
            boolean metOne = false;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1' && metOne) {
                    return false;
                }
                if (s.charAt(i) == '1') {
                    metOne = true;
                    while (i < s.length() && s.charAt(i) == '1') {
                        i++;
                    }
                }
            }
            return true;
        }
    }
}
