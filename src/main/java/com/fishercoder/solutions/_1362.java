package com.fishercoder.solutions;

public class _1362 {
    public static class Solution1 {
        public int[] closestDivisors(int num) {
            int sqrt = (int) Math.sqrt(num);
            int left = sqrt + 1;
            int right = sqrt + 1;
            long product = left * right;
            while (product != (long) (num + 1) && product != (long) (num + 2)) {
                if (product < (num + 1)) {
                    left++;
                } else if (product > (num + 2)) {
                    right--;
                }
                product = left * right;
            }
            return new int[]{left, right};
        }
    }
}
