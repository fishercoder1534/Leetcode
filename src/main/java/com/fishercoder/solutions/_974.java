package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 974. Subarray Sums Divisible by K
 *
 * Given an array A of integers, return the number of (contiguous, non-empty) subarrays that have a sum
 * divisible by K.
 * */

public class _974 {
    public static class Solution1 {
        public int subarraysDivByK(int[] A, int K) {
            int count = 0;
            int sum = 0;
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, 1);

            for (int i = 0; i < A.length; i++) {
                sum = (sum + A[i]) % K;
                if (sum < 0) {
                    sum += K;
                }

                count += map.getOrDefault(sum, 0);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }

            return count;
        }
    }
}
