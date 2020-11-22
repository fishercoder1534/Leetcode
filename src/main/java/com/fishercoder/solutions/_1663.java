package com.fishercoder.solutions;

public class _1663 {
    public static class Solution1 {
        public String getSmallestString(int n, int k) {
            StringBuilder sb = new StringBuilder();
            int balance = k - n;
            while (balance > 0) {
                if (balance > 25) {
                    balance -= 25;
                    sb.append("z");
                    n--;
                } else {
                    char str = (char) ('a' + balance);
                    sb.append(str);
                    n--;
                    while (n > 0) {
                        sb.append("a");
                        n--;
                    }
                    break;
                }
            }
            return sb.reverse().toString();
        }
    }
}
