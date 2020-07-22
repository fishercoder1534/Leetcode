package com.fishercoder.solutions;

public class _717 {
    public static class Solution1 {
        public boolean isOneBitCharacter(int[] bits) {
            int n = bits.length;
            int i = 0;
            while (i < n - 1) {
                if (bits[i] == 0) {
                    i++;
                } else {
                    i += 2;
                }
            }
            return i == n - 1 ? true : false;
        }
    }
}
