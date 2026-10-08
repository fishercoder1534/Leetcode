package com.fishercoder.solutions.fourththousand;

public class _3783 {
    public static class Solution1 {
        public int mirrorDistance(int n) {
            int originalN = n;
            StringBuilder sb = new StringBuilder();
            while (n != 0) {
                sb.append(n % 10);
                n /= 10;
            }
            int mirror = Integer.parseInt(sb.toString());
            return Math.abs(mirror - originalN);
        }
    }
}
