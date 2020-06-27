package com.fishercoder.solutions;

public class _389 {
    public static class Solution1 {
        public char findTheDifference(String s, String t) {
            int[] counts = new int[128];
            char[] schars = s.toCharArray();
            char[] tchars = t.toCharArray();
            for (int i = 0; i < schars.length; i++) {
                counts[schars[i]]++;
            }
            for (int i = 0; i < tchars.length; i++) {
                counts[tchars[i]]--;
            }
            char result = 'a';
            for (int i = 0; i < 128; i++) {
                if (counts[i] != 0) {
                    result = (char) i;
                }
            }
            return result;
        }
    }
}
