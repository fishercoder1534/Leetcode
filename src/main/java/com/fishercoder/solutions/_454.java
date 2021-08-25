package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _454 {
    public static class Solution1 {
        public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
            Map<Integer, Integer> map = new HashMap();
            int result = 0;
            int len = A.length;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    int sum = A[i] + B[j];
                    if (map.containsKey(sum)) {
                        map.put(sum, map.get(sum) + 1);
                    } else {
                        map.put(sum, 1);
                    }
                }
            }

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    int sum = -(C[i] + D[j]);
                    if (map.containsKey(sum)) {
                        result += map.get(sum);
                    }
                }
            }

            return result;
        }
    }
}
