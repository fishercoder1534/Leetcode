package com.fishercoder.solutions;

import java.util.Arrays;

public class _300 {

    public static class Solution1 {

        /**
         * credit: https://discuss.leetcode.com/topic/28719/short-java-solution-using-dp-o-n-log-n
         * The idea is that as you iterate the sequence,
         * you keep track of the minimum value a subsequence of given length might end with,
         * for all so far possible subsequence lengths.
         * So dp[i] is the minimum value a subsequence of length i+1 might end with.
         * Having this info, for each new number we iterate to,
         * we can determine the longest subsequence where it can be appended using binary search.
         * The final answer is the length of the longest subsequence we found so far.
         */
        public int lengthOfLIS(int[] nums) {
            int[] dp = new int[nums.length];
            int len = 0;
            for (int x : nums) {
                /**Java Doc of this binarySearch API:
                 * @return index of the search key, if it is contained in the array
                 *         within the specified range;
                 *         otherwise, <tt>(-(<i>insertion point</i>) - 1)</tt>.  The
                 *         <i>insertion point</i> is defined as the point at which the
                 *         key would be inserted into the array: the index of the first
                 *         element in the range greater than the key,
                 *         or <tt>toIndex</tt> if all
                 *         elements in the range are less than the specified key.  Note
                 *         that this guarantees that the return value will be &gt;= 0 if
                 *         and only if the key is found.*/
                int index = Arrays.binarySearch(dp, 0, len, x);
                if (index < 0) {
                    index = -(index + 1);
                }
                dp[index] = x;
                if (index == len) {
                    len++;
                }
            }
            return len;
        }
    }
}
