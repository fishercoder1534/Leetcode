package com.fishercoder.solutions;

public class _392 {

    public static class Solution1 {
        public boolean isSubsequence(String s, String t) {
            int left = 0;
            for (int i = 0; i < s.length(); i++) {
                boolean foundI = false;
                int j = left;
                for (; j < t.length(); j++) {
                    if (s.charAt(i) == t.charAt(j)) {
                        left = j + 1;
                        foundI = true;
                        break;
                    }
                }
                if (j == t.length() && !foundI) {
                    return false;
                }
            }
            return true;
        }
    }
}
