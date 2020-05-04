package com.fishercoder.solutions;

public class _476 {

    public static class Solution1 {
        public int findComplement(int num) {
            return ~num & ((Integer.highestOneBit(num) << 1) - 1);
        }
    }

    public static class Solution2 {
        public int findComplement(int num) {
            String str = Integer.toBinaryString(num);
            StringBuilder sb = new StringBuilder();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '0') {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
            return Integer.parseInt(sb.toString(), 2);
        }
    }
}
