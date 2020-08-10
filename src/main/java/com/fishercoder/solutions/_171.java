package com.fishercoder.solutions;

public class _171 {

    public static class Solution1 {
        public int titleToNumber(String s) {
            char[] c = s.toCharArray();
            int result = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                result +=
                        (c[i] - 64) * ((int) Math.pow(26, s.length() - i - 1));//The ASCII value of A is 65
            }
            return result;
        }
    }
}
