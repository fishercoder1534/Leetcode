package com.fishercoder.solutions;

public class _1880 {
    public static class Solution1 {
        public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
            StringBuilder sb = new StringBuilder();
            int a = getSum(firstWord, sb);
            sb.setLength(0);
            int b = getSum(secondWord, sb);
            sb.setLength(0);
            int c = getSum(targetWord, sb);
            return a + b == c;
        }

        private int getSum(String firstWord, StringBuilder sb) {
            for (char c : firstWord.toCharArray()) {
                sb.append(c - 'a');
            }
            return Integer.parseInt(sb.toString());
        }
    }
}
