package com.fishercoder.solutions;

public class _1370 {
    public static class Solution1 {
        public String sortString(String s) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            while (sb.length() < s.length()) {
                for (int i = 0; i < count.length; i++) {
                    if (count[i] != 0) {
                        char character = (char) (i + 'a');
                        sb.append(character);
                        count[i]--;
                    }
                }
                for (int i = 25; i >= 0; i--) {
                    if (count[i] > 0) {
                        char character = (char) (i + 'a');
                        sb.append(character);
                        count[i]--;
                    }
                }
            }
            return sb.toString();
        }
    }
}
