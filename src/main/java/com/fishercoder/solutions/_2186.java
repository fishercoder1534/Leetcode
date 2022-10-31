package com.fishercoder.solutions;

public class _2186 {
    public static class Solution1 {
        public int minSteps(String s, String t) {
            int[] counts = new int[26];
            for (int i = 0; i < s.length(); i++) {
                counts[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < t.length(); i++) {
                counts[t.charAt(i) - 'a']--;
            }
            int ans = 0;
            for (int i = 0; i < counts.length; i++) {
                ans += Math.abs(counts[i]);
            }
            return ans;
        }
    }
}
