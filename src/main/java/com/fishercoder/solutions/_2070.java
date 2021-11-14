package com.fishercoder.solutions;

import java.util.Arrays;

public class _2070 {
    public static class Solution1 {
        public int[] maximumBeauty(int[][] items, int[] queries) {
            int len = queries.length;
            Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
            int[][] queryPairs = new int[len][2];
            for (int i = 0; i < len; i++) {
                queryPairs[i] = new int[]{queries[i], i};
            }
            Arrays.sort(queryPairs, (a, b) -> Integer.compare(a[0], b[0]));
            int[] ans = new int[len];
            int j = 0;
            int max = 0;
            for (int i = 0; i < len; i++) {
                int[] queryPair = queryPairs[i];
                int price = queryPair[0];
                int index = queryPair[1];
                while (j < items.length && items[j][0] <= price) {
                    max = Math.max(max, items[j][1]);
                    j++;
                }
                ans[index] = max;
            }
            return ans;
        }
    }
}
