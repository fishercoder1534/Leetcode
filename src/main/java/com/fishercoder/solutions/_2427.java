package com.fishercoder.solutions;

public class _2427 {
    public static class Solution1 {
        public int commonFactors(int a, int b) {
            int ans = 1;
            int num = 2;
            while (num <= a && num <= b) {
                if (a % num == 0 && b % num == 0) {
                    ans++;
                }
                num++;
            }
            return ans;
        }
    }
}
