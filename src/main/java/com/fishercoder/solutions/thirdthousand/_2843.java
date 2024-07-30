package com.fishercoder.solutions.thirdthousand;

public class _2843 {
    public static class Solution1 {
        public int countSymmetricIntegers(int low, int high) {
            int ans = 0;
            for (int num = low; num <= high; num++) {
                ans += isSymmetric(num);
            }
            return ans;
        }

        private int isSymmetric(int num) {
            String numStr = String.valueOf(num);
            if (numStr.length() % 2 != 0) {
                return 0;
            }
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < numStr.length() / 2; i++) {
                sum1 += Integer.parseInt(numStr.charAt(i) + "");
                sum2 += Integer.parseInt(numStr.charAt(numStr.length() - i - 1) + "");
            }
            if (sum1 == sum2) {
                return 1;
            }
            return 0;
        }
    }
}
