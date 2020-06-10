package com.fishercoder.solutions;

import java.util.List;

public class _120 {
    public static class Solution1 {
        public int minimumTotal(List<List<Integer>> triangle) {
            int n = triangle.size();
            List<Integer> cache = triangle.get(n - 1);

            for (int layer = n - 2; layer >= 0; layer--) {
                //for each layer
                for (int i = 0; i <= layer; i++) {
                    //check its very node
                    int value = Math.min(cache.get(i), cache.get(i + 1)) + triangle.get(layer).get(i);
                    cache.set(i, value);
                }
            }
            return cache.get(0);
        }
    }
}
