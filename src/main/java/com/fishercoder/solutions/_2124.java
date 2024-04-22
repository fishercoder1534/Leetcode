package com.fishercoder.solutions;

public class _2124 {
    public static class Solution1 {
        public boolean checkString(String s) {
            int aIndex = s.lastIndexOf('a');
            if (aIndex < 0) {
                return true;
            }
            for (int i = 0; i < aIndex; i++) {
                if (s.charAt(i) == 'b') {
                    return false;
                }
            }
            return true;
        }
    }
}
