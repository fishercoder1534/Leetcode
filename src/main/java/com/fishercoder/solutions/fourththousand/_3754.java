package com.fishercoder.solutions.fourththousand;

public class _3754 {
    public static class Solution1 {
        public long sumAndMultiply(int n) {
            if (n == 0) {
                return 0;
            }
            int sum = 0;
            StringBuilder sb = new StringBuilder();
            while (n > 0) {
                if (n % 10 != 0) {
                    sb.append(n % 10);
                    sum += n % 10;
                }
                n /= 10;
            }
            long newNum = Long.parseLong(sb.reverse().toString());
            return newNum * sum;
        }
    }
}
