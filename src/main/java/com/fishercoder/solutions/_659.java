package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _659 {

    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/99187/java-o-n-time-o-n-space
         */
        public boolean isPossible(int[] nums) {
            Map<Integer, Integer> freqMap = new HashMap<>();
            for (int i : nums) {
                freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
            }
            Map<Integer, Integer> appendFreqMap = new HashMap<>();
            for (int i : nums) {
                if (freqMap.get(i) == 0) {
                    continue;
                } else if (appendFreqMap.getOrDefault(i, 0) > 0) {
                    appendFreqMap.put(i, appendFreqMap.get(i) - 1);
                    appendFreqMap.put(i + 1, appendFreqMap.getOrDefault(i + 1, 0) + 1);
                } else if (freqMap.getOrDefault(i + 1, 0) > 0 && freqMap.getOrDefault(i + 2, 0) > 0) {
                    freqMap.put(i + 1, freqMap.get(i + 1) - 1);
                    freqMap.put(i + 2, freqMap.get(i + 2) - 1);
                    appendFreqMap.put(i + 3, appendFreqMap.getOrDefault(i + 3, 0) + 1);
                } else {
                    return false;
                }
                freqMap.put(i, freqMap.get(i) - 1);
            }
            return true;
        }
    }
}
