package com.fishercoder.solutions;

public class _1812 {
    public static class Solution1 {
        public boolean squareIsWhite(String coordinates) {
            char x = coordinates.charAt(0);
            int y = Integer.parseInt(coordinates.charAt(1) + "");
            switch (x) {
                case 'a':
                case 'c':
                case 'e':
                case 'g':
                    return y % 2 == 0;
                default:
                    return y % 2 != 0;
            }
        }
    }
}
