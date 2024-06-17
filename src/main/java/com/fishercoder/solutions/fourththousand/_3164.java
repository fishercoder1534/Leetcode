package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3164 {
    public static class Solution1 {
        public long numberOfPairs(int[] nums1, int[] nums2, int k) {
            long count = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int num : nums2) {
                int product = num * k;
                map.put(product, map.getOrDefault(product, 0) + 1);
            }
            for (int num : nums1) {
                for (int j = 1; j * j <= num; j++) {
                    if (num % j == 0) {
                        if (map.containsKey(j)) {
                            count += map.get(j);
                        }
                        int division = num / j;
                        if (j != division && map.containsKey(division)) {
                            count += map.get(division);
                        }
                    }
                }
            }
            return count;
        }
    }
}
