package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1577 {
    public static class Solution1 {
        public int numTriplets(int[] nums1, int[] nums2) {
            long result = 0;
            for (long num : nums1) {
                result += twoProduct(num * num, nums2);
            }
            for (long num : nums2) {
                result += twoProduct(num * num, nums1);
            }
            return (int) result;
        }

        private long twoProduct(long product, int[] nums) {
            Map<Long, Long> map = new HashMap<>();
            long count = 0;
            for (long num : nums) {
                if (product % num == 0) {
                    count += map.getOrDefault(product / num, 0L);
                }
                map.put(num, map.getOrDefault(num, 0L) + 1);
            }
            return count;
        }

    }
}
