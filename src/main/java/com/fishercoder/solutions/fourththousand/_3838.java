package com.fishercoder.solutions.fourththousand;

public class _3838 {
    public static class Solution1 {
        public String mapWordWeights(String[] words, int[] weights) {
            char[] chars = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            chars = new StringBuilder(new String(chars)).reverse().toString().toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                int sum = 0;
                for (char c : word.toCharArray()) {
                    sum += weights[c - 'a'];
                }
                sum %= 26;
                sb.append(chars[sum]);
            }
            return sb.toString();
        }
    }
}
