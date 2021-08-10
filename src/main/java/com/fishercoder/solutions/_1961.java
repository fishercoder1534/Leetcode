package com.fishercoder.solutions;

public class _1961 {
    public static class Solution1 {
        public boolean isPrefixString(String s, String[] words) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                sb.append(word);
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
            return false;
        }
    }
}
