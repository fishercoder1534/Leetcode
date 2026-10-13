package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;

public class _3663 {
    public static class Solution1 {
        public int getLeastFrequentDigit(int n) {
            Map<Integer, Integer> map = new HashMap<>();
            int freq = n;
            while (n > 0) {
                map.put(n % 10, map.getOrDefault(n % 10, 0) + 1);
                n /= 10;
            }
            int ans = 0;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (map.size() == 1) {
                    return entry.getKey();
                }
                if (entry.getValue() < freq) {
                    freq = entry.getValue();
                    ans = entry.getKey();
                } else if (entry.getValue() == freq && entry.getKey() < ans) {
                    freq = entry.getValue();
                    ans = entry.getKey();
                }
            }
            return ans;
        }
    }
}
