package com.fishercoder.solutions.fourththousand;

public class _3498 {
    public static class Solution1 {
        public int reverseDegree(String s) {
            String alphabet = "abcdefghijklmnopqrstuvwxyz￥";
            String reversedAlphabet = new StringBuilder(alphabet).reverse().toString();
            int degree = 0;
            for (int i = 0; i < s.length(); i++) {
                int index = reversedAlphabet.indexOf(s.charAt(i));
                degree += index * (i + 1);
            }
            return degree;
        }
    }
}
