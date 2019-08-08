package com.fishercoder.solutions;

/**
 * 629. K Inverse Pairs Array
 *
 * Given two integers n and k, find how many different arrays consist of numbers from 1 to n such that there are exactly k inverse pairs.
 We define an inverse pair as following: For ith and jth element in the array,
 if i < j and a[i] > a[j] then it's an inverse pair; Otherwise, it's not.
 Since the answer may very large, the answer should be modulo 109 + 7.

 Example 1:
 Input: n = 3, k = 0
 Output: 1
 Explanation:
 Only the array [1,2,3] which consists of numbers from 1 to 3 has exactly 0 inverse pair.

 Example 2:
 Input: n = 3, k = 1
 Output: 2
 Explanation:
 The array [1,3,2] and [2,1,3] have exactly 1 inverse pair.

 Note:
 The integer n is in the range [1, 1000] and k is in the range [0, 1000].
 */
public class _629 {

    public static class Solution1 {

        /**
         * reference: https://leetcode.com/articles/k-inverse-pairs-array/#approach-5-another-optimized-dynamic-programming-approachaccepted
         * and
         * https://discuss.leetcode.com/topic/93815/java-dp-o-nk-solution
         */
        public int kInversePairs(int n, int k) {
            int mod = 1000000007;
            if (k > n * (n - 1) / 2 || k < 0) {
                return 0;
            }
            if (k == 0 || k == n * (n - 1) / 2) {
                return 1;
            }
            long[][] dp = new long[n + 1][k + 1];
            dp[2][0] = 1;
            dp[2][1] = 1;
            for (int i = 3; i <= n; i++) {
                dp[i][0] = 1;
                for (int j = 1; j <= Math.min(k, i * (i - 1) / 2); j++) {
                    dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
                    if (j >= i) {
                        dp[i][j] -= dp[i - 1][j - i];
                    }
                    dp[i][j] = (dp[i][j] + mod) % mod;
                }
            }
            return (int) dp[n][k];
        }
    }
}
