package com.fishercoder.solutions;

public class _1933 {
    public static class Solution1 {
        public boolean isDecomposable(String s) {
            int lengthTwoCount = 0;
            for (int i = 0; i < s.length(); i++) {
                int start = i;
                char prev = s.charAt(start);
                while (i < s.length() && s.charAt(i) == prev) {
                    i++;
                }
                if (i >= s.length()) {
                    i--;
                }
                if (s.charAt(i) != prev) {
                    i--;
                }
                if ((i - start + 1) % 3 == 2) {
                    lengthTwoCount++;
                } else if ((i - start + 1) % 3 == 0) {
                    continue;
                } else {
                    return false;
                }
            }
            return lengthTwoCount == 1;
        }
    }
}
