package com.fishercoder.solutions;

public class _740 {
    public static class Solution1 {
        /**
         * Since the number is within range [1, 10000], we can build another array:
         * each number in the array denotes the total sum of this number that appears in this array
         * and
         * use the numbers themselves in the indices of another array
         * <p>
         * credit: https://leetcode.com/problems/delete-and-earn/discuss/109895/JavaC++-Clean-Code-with-Explanation
         */
        public int deleteAndEarn(int[] nums) {
            int n = 10001;
            int[] values = new int[n];
            for (int num : nums) {
                values[num] += num;
            }

            int take = 0;
            int skip = 0;
            for (int i = 0; i < n; i++) {
                int takeI = skip + values[i];
                int skipI = Math.max(skip, take);
                take = takeI;
                skip = skipI;
            }
            return Math.max(take, skip);
        }
    }
}
