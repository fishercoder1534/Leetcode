package com.fishercoder.solutions;

public class _1358 {
    public static class Solution1 {
        /**
         * A classic sliding window problem, no dp or backtracking, just sliding window: use two pointers.
         * my new favorite queustion!
         */
        public int numberOfSubstrings(String s) {
            int[] counts = new int[3];
            int i = 0;
            int n = s.length();
            int result = 0;
            for (int j = 0; j < n; j++) {
                counts[s.charAt(j) - 'a']++;
                while (counts[0] > 0 && counts[1] > 0 && counts[2] > 0) {
                    counts[s.charAt(i++) - 'a']--;
                }
                result += i;
            }
            return result;
        }

    }
}
