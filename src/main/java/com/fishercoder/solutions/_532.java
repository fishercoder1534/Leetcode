package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _532 {

    public static class Solution1 {
        public int findPairs(int[] nums, int k) {
            if (nums == null || nums.length == 0 || k < 0) {
                return 0;
            }

            Map<Integer, Integer> map = new HashMap();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            int answer = 0;
            for (int key : map.keySet()) {
                if (k == 0) {
                    if (map.get(key) >= 2) {
                        answer++;
                    }
                } else {
                    if (map.containsKey(key + k)) {
                        answer++;
                    }
                }
            }
            return answer;
        }
    }

}