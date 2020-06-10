package com.fishercoder.solutions;

public class _1427 {
    public static class Solution1 {
        public String stringShift(String s, int[][] shift) {
            StringBuilder sb = new StringBuilder();
            for (int[] move : shift) {
                sb.setLength(0);
                if (move[0] == 0) {
                    sb.append(s.substring(move[1]));
                    sb.append(s.substring(0, move[1]));
                    s = sb.toString();
                } else {
                    sb.append(s.substring(s.length() - move[1]));
                    sb.append(s.substring(0, s.length() - move[1]));
                    s = sb.toString();
                }
            }
            return s;
        }
    }
}
