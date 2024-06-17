package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _2404 {
    public static class Solution1 {
        public int mostFrequentEven(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                }
            }
            List<Integer> smallestEvens = new ArrayList<>();
            int freq = 0;
            for (int key : map.keySet()) {
                if (map.get(key) > freq) {
                    smallestEvens.clear();
                    freq = map.get(key);
                    smallestEvens.add(key);
                } else if (map.get(key) == freq) {
                    smallestEvens.add(key);
                }
            }
            if (smallestEvens.size() < 1) {
                return -1;
            }
            Collections.sort(smallestEvens);
            return smallestEvens.get(0);
        }
    }
}
