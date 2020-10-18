package com.fishercoder.solutions;

public class _1624 {
    public static class Solution1 {
        public int maxLengthBetweenEqualCharacters(String s) {
            int maxLen = -1;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                int lastIndex = s.lastIndexOf(c);
                if (lastIndex != i) {
                    maxLen = Math.max(maxLen, Math.abs(lastIndex - i - 1));
                }
            }
            return maxLen;
        }
    }
}
