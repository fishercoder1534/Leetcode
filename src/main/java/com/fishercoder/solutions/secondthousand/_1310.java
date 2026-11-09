package com.fishercoder.solutions.secondthousand;

public class _1310 {
    public static class Solution1 {
        public int[] xorQueries(int[] arr, int[][] queries) {
            int[] prefixSums = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                //prefixSums[i + 1] means all elements ^'d up to index i, but not including index: i + 1
                prefixSums[i + 1] = prefixSums[i] ^ arr[i];
            }
            int[] ans = new int[queries.length];
            for (int i = 0; i < queries.length; i++) {
                int start = queries[i][0];
                int end = queries[i][1];
                ans[i] = prefixSums[start] ^ prefixSums[end + 1]; // this line cancels out all XOR result from index 0 up to index start, look at this for more info: https://github.com/fishercoder1534/Leetcode/blob/master/data_structures_n_algos_summary/bit_manipulation.md
            }
            return ans;
        }
    }
}
