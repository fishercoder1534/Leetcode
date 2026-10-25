package com.fishercoder.solutions.fifththousand;

public class _4092 {
    public static class Solution1 {
        public int calculateScore(int a, int b) {
            String s1 = Integer.toBinaryString(a);
            String s2 = Integer.toBinaryString(b);
            int c1 = getOnes(s1);
            int c2 = getOnes(s2);
            if (c1 >= c2) {
                return c1 * c2;
            } else {
                return c2 / c1;
            }
        }

        private int getOnes(String str) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (c == '1') {
                    count++;
                }
            }
            return count;
        }
    }
}
