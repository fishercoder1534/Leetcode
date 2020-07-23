package com.fishercoder.solutions;

public class _806 {
    public static class Solution1 {
        public int[] numberOfLines(int[] widths, String S) {
            int numOfLines = 1;
            int offsetInCurrentLine = 0;
            for (char c : S.toCharArray()) {
                if (offsetInCurrentLine + widths[c - 'a'] < 100) {
                    offsetInCurrentLine += widths[c - 'a'];
                } else if (offsetInCurrentLine + widths[c - 'a'] == 100) {
                    numOfLines++;
                    offsetInCurrentLine = 0;
                } else {
                    numOfLines++;
                    offsetInCurrentLine = widths[c - 'a'];
                }
            }
            return new int[]{numOfLines, offsetInCurrentLine};
        }
    }
}
