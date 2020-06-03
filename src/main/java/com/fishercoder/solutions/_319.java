package com.fishercoder.solutions;

public class _319 {

    public static class Solution1 {
        public int bulbSwitch(int n) {
            if (n < 2) {
                return n;
            }
            return (int) Math.sqrt(n);
        }
    }

}
