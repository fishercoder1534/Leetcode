package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _454 {
    public static class Solution1 {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            Map<Integer, Integer> map = new HashMap();
            int result = 0;
            int len = nums1.length;
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    int sum = nums1[i] + nums2[j];
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }

            for (int i = 0; i < len; i++) {
                for (int j = 0; j < len; j++) {
                    int sum = -(nums3[i] + nums4[j]);
                    if (map.containsKey(sum)) {
                        result += map.get(sum);
                    }
                }
            }

            return result;
        }
    }
}
