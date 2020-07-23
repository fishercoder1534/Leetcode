package com.fishercoder.solutions;

public class _796 {
    public static class Solution1 {
        public boolean rotateString(String A, String B) {
            if (A.length() != B.length()) {
                return false;
            }
            for (int i = 0; i < A.length(); i++) {
                if ((A.substring(i) + A.substring(0, i)).equals(B)) {
                    return true;
                }
            }
            return false;
        }
    }
}
