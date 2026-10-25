package com.fishercoder.solutions.fifththousand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _4094 {
    public static class Sollution1 {
        public int countStaircase(int[] nums) {
            int n = nums.length;
            int ans = 0;
            for (int left = 0; left < n; left++) {
                Map<Integer, Integer> map = new HashMap();
                List<Integer> order = new ArrayList();

                for (int right = left; right < n; right++) {
                    int val = nums[right];
                    if (!map.containsKey(val)) {
                        order.add(val);
                    }
                    map.put(val, map.getOrDefault(val, 0) + 1);

                    if (isValid(map, order)) {
                        ans++;
                    }
                }
            }
            return ans;
        }

        private boolean isValid(Map<Integer, Integer> map, List<Integer> order) {
            int k = order.size();
            for (int i = 0; i < k; i++) {
                int exp = i + 1;
                int act = map.get(order.get(i));
                if (act != exp) {
                    return false;
                }
            }
            return true;
        }
    }
}
