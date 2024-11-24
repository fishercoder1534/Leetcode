package com.fishercoder.solutions.fourththousand;

public class _3360 {
    public static class Solution1 {
        public boolean canAliceWin(int n) {
            int turns = 0;
            int removeCount = 10;
            while (n >= removeCount) {
                n -= removeCount;
                removeCount--;
                turns++;
            }
            return turns % 2 != 0;
        }
    }
}
