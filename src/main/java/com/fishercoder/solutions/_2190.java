package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _2190 {
    public static class Solution1 {
        public int mostFrequent(int[] nums, int key) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == key) {
                    map.put(nums[i + 1], map.getOrDefault(nums[i + 1], 0) + 1);
                }
            }
            int most = 0;
            int ans = 0;
            for (int k : map.keySet()) {
                if (map.get(k) > most) {
                    ans = k;
                    most = map.get(k);
                }
            }
            return ans;
        }
    }
}
