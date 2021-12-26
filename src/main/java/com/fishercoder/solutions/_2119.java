package com.fishercoder.solutions;

public class _2119 {
    public static class Solution1 {
        public boolean isSameAfterReversals(int num) {
            if (num == 0) {
                return true;
            }
            return num % 10 != 0;
        }
    }
}
