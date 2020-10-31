package com.fishercoder.solutions;

public class _1374 {
    public static class Solution1 {
        public String generateTheString(int n) {
            StringBuilder sb = new StringBuilder();
            if (n > 1 && n % 2 == 0) {
                while (n-- > 1) {
                    sb.append("a");
                }
            } else if (n > 1) {
                while (n-- > 2) {
                    sb.append("a");
                }
                sb.append("b");
            }
            sb.append("z");
            return sb.toString();
        }
    }
}
