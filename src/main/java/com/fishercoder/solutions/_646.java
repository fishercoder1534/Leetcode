package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 646. Maximum Length of Pair Chain
 *
 * You are given n pairs of numbers. In every pair, the first number is always smaller than the second number.

 Now, we define a pair (c, d) can follow another pair (a, b) if and only if b < c. Chain of pairs can be formed in this fashion.

 Given a set of pairs, find the length longest chain which can be formed. You needn't use up all the given pairs. You can select pairs in any order.

 Example 1:
 Input: [[1,2], [2,3], [3,4]]
 Output: 2
 Explanation: The longest chain is [1,2] -> [3,4]

 Note:
 The number of given pairs will be in the range [1, 1000].
 */
public class _646 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/96804/java-o-nlog-n-time-o-1-space
         */
        public int findLongestChain(int[][] pairs) {
            Arrays.sort(pairs, (o1, o2) -> o1[1] - o2[1]);
            int result = 0;
            int n = pairs.length;
            int i = -1;
            while (++i < n) {
                result++;
                int curEnd = pairs[i][1];
                while (i + 1 < n && pairs[i + 1][0] <= curEnd) {
                    /**This means, we'll keep incrementing i until pairs[i+1][0] is
                     * exactly greater than curEnd.*/
                    i++;
                }
            }
            return result;
        }
    }

}