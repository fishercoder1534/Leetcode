package com.fishercoder.solutions;

public class _76 {

    public static class Solution1 {
        public String minWindow(String s, String t) {
            int[] counts = new int[256];
            for (char c : t.toCharArray()) {
                counts[c]++;
            }

            int start = 0;
            int end = 0;
            int minStart = 0;
            int minLen = Integer.MAX_VALUE;
            int counter = t.length();
            while (end < s.length()) {
                if (counts[s.charAt(end)] > 0) {
                    counter--;
                }

                counts[s.charAt(end)]--;
                end++;

                while (counter == 0) {
                    if (end - start < minLen) {
                        minStart = start;
                        minLen = end - start;
                    }
                    counts[s.charAt(start)]++;
                    if (counts[s.charAt(start)] > 0) {
                        counter++;
                    }
                    start++;
                }
            }

            if (minLen == Integer.MAX_VALUE) {
                return "";
            }
            return s.substring(minStart, minStart + minLen);
        }
    }
}
