package com.fishercoder.solutions;

public class _650 {

    public static class Solution1 {
        public int minSteps(int n) {
            int[] dp = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                dp[i] = i;//we assign i to dp[i] first, because for a lot of cases, e.g. for most cases when i is odd, its min steps is i itself, if it's not, we can overwrite it later
                for (int j = i - 1; j > 1; j--) {
                    //traverse backwards, whenever it's divisible by j, we'll update dp[i] because it's guaranteed to be smaller when j is smaller.
                    if (i % j == 0) {
                        dp[i] = dp[j] + (i / j);
                        break;
                    }
                }
            }
            return dp[n];
        }
    }
}
