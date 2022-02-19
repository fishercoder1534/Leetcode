package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2176 {
    public static class Solution1 {
        public int countPairs(int[] nums, int k) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                List<Integer> list = map.getOrDefault(nums[i], new ArrayList<>());
                list.add(i);
                map.put(nums[i], list);
            }
            int ans = 0;
            for (int key : map.keySet()) {
                List<Integer> list = map.get(key);
                for (int i = 0; i < list.size() - 1; i++) {
                    for (int j = i + 1; j < list.size(); j++) {
                        if ((list.get(i) * list.get(j)) % k == 0) {
                            ans++;
                        }
                    }
                }
            }
            return ans;
        }
    }
}
