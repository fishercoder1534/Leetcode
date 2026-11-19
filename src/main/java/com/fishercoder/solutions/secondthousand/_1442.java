package com.fishercoder.solutions.secondthousand;

public class _1442 {
    public static class Solution1 {
        /**
         * 1. Prefix Sum is very powerful: https://github.com/fishercoder1534/Leetcode/blob/master/data_structures_n_algos_summary/prefix_sum.md
         * 2. Bit Manipulation as well: https://github.com/fishercoder1534/Leetcode/blob/master/data_structures_n_algos_summary/bit_manipulation.md
         * <p>
         * This problem uses the above two combined and could solve it elegantly!
         *
         */
        public int countTriplets(int[] arr) {
            int len = arr.length;
            int[] prefixSums = new int[len + 1];
            prefixSums[0] = arr[0];
            for (int i = 0; i < len; i++) {
                prefixSums[i + 1] = prefixSums[i] ^ arr[i];
            }
            int ans = 0;
            for (int i = 0; i < len - 1; i++) {
                for (int k = i + 1; k < len; k++) {
                    for (int j = i + 1; j <= k; j++) {
                        int a = prefixSums[j] ^ prefixSums[i]; // prefixSums[i] is canceled out in this operation, leaving arr[i... j-1]
                        int b = prefixSums[k + 1] ^ prefixSums[j]; // prefixSums[j] is canceled out in this operation, leaving arr[j...k]
                        if (a == b) {
                            ans++;
                        }
                    }
                }
            }
            return ans;
        }
    }
}
