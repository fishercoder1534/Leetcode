package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class _1772 {
    public static class Solution1 {
        public String[] sortFeatures(String[] features, String[] responses) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < features.length; i++) {
                map.put(features[i], i);
            }
            Map<String, Integer> countMap = new HashMap<>();
            for (String response : responses) {
                Set<String> strs = new HashSet(Arrays.asList(response.split(" ")));
                for (String str : strs) {
                    if (map.containsKey(str)) {
                        countMap.put(str, countMap.getOrDefault(str, 0) + 1);
                    }
                }
            }
            PriorityQueue<Node> maxHeap = new PriorityQueue<>((a, b) -> a.freq != b.freq ? b.freq - a.freq : a.index - b.index);
            for (String key : map.keySet()) {
                maxHeap.offer(new Node(key, countMap.getOrDefault(key, 0), map.get(key)));
            }
            String[] result = new String[features.length];
            int i = 0;
            while (!maxHeap.isEmpty()) {
                result[i++] = maxHeap.poll().word;
            }
            return result;
        }

        class Node {
            String word;
            Integer freq;
            Integer index;

            public Node(String word, Integer freq, Integer index) {
                this.word = word;
                this.freq = freq;
                this.index = index;
            }
        }
    }
}
