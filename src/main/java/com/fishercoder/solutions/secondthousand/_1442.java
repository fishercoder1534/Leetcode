package com.fishercoder.solutions.secondthousand;

public class _1442 {
    public static class Solution1 {
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
                        int a = prefixSums[j] ^ prefixSums[i];
                        int b = prefixSums[k + 1] ^ prefixSums[j];
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
