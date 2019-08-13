package com.fishercoder.solutions;

/**
 * 634. Find the Derangement of An Array
 *
 * In combinatorial mathematics, a derangement is a permutation of the elements of a set, such that no element appears in its original position.

 There's originally an array consisting of n integers from 1 to n in ascending order, you need to find the number of derangement it can generate.

 Also, since the answer may be very large, you should return the output mod 109 + 7.

 Example 1:
 Input: 3
 Output: 2
 Explanation: The original array is [1,2,3]. The two derangements are [2,3,1] and [3,1,2].

 Note:
 n is in the range of [1, 106].
 */
public class _634 {
    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/94442/java-5-lines-o-1-space-solution
         * and https://leetcode.com/articles/find-derangements/#approach-5-using-formula-accepted
         */
        private static final int M = 1000000007;

        public int findDerangement(int n) {
            long ans = 1;
            for (int i = 1; i <= n; i++) {
                ans = (i * ans % M + (i % 2 == 0 ? 1 : -1)) % M;
            }
            return (int) ans;
        }
    }
}
