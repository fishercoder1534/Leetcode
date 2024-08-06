package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _3016 {
    public static class Solution1 {
        public int minimumPushes(String word) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : word.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                maxHeap.offer(entry);
            }
            int[] possibleSets = new int[]{1, 2, 3, 4};
            int digitsLength = 8;//a total of 8 digits that can be assigned
            Map<Character, Integer> assigned = new HashMap<>();
            for (int j = 0; j < possibleSets.length && !maxHeap.isEmpty(); j++) {
                for (int i = 0; i < digitsLength && !maxHeap.isEmpty(); i++) {
                    Map.Entry<Character, Integer> curr = maxHeap.poll();
                    assigned.put(curr.getKey(), possibleSets[j]);
                }
            }
            int ans = 0;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                ans += entry.getValue() * assigned.get(entry.getKey());
            }
            return ans;
        }
    }
}
