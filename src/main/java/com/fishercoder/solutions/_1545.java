package com.fishercoder.solutions;

public class _1545 {
    public static class Solution1 {
        public char findKthBit(int n, int k) {
            String[] strings = new String[n];
            strings[0] = "0";
            for (int i = 1; i < n; i++) {
                strings[i] = formString(strings[i - 1]);
            }
            return strings[n - 1].charAt(k - 1);
        }

        private String formString(String str) {
            return str + "1" + reverse(invert(str));
        }

        private String reverse(String str) {
            StringBuilder sb = new StringBuilder();
            return sb.append(str).reverse().toString();
        }

        private String invert(String str) {
            StringBuilder sb = new StringBuilder();
            for (char c : str.toCharArray()) {
                if (c == '1') {
                    sb.append('0');
                } else {
                    sb.append('1');
                }
            }
            return sb.toString();
        }
    }
}
