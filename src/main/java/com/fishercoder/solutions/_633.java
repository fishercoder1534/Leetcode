package com.fishercoder.solutions;

public class _633 {
    public static class Solution1 {
        public boolean judgeSquareSum(int c) {
            if (c < 0) {
                return false;
            }
            int left = 0;
            int right = (int) (Math.sqrt(c));
            while (left <= right) {
                int curr = left * left + right * right;
                if (curr > c) {
                    right--;
                } else if (curr < c) {
                    left++;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
