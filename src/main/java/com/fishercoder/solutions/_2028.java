package com.fishercoder.solutions;

public class _2028 {
    public static class Solution1 {
        public int[] missingRolls(int[] rolls, int mean, int n) {
            long sum = 0l;
            for (int num : rolls) {
                sum += num;
            }
            long totalSum = (rolls.length + n) * mean;
            long remainder = totalSum - sum;
            if (remainder / n > 6 || (remainder / n == 6 && remainder % n != 0) || remainder / n < 0 || remainder < n) {
                return new int[]{};
            }
            int ave = (int) (remainder / n);
            int remain = (int) (remainder % n);
            int[] ans = new int[n];
            int k = 0;
            while (k < n) {
                ans[k++] = ave + remain > 0 ? 1 : 0;
                remain--;
            }
            return ans;
        }
    }
}
