package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class _358 {

    public static class Solution1 {
        public String rearrangeString(String s, int k) {
            Map<Character, Integer> count = new HashMap<>();
            for (char c : s.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }

            PriorityQueue<Map.Entry<Character, Integer>> heap =
                    new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
            heap.addAll(count.entrySet());

            Queue<Map.Entry<Character, Integer>> waitQueue = new LinkedList<>();

            StringBuilder stringBuilder = new StringBuilder();
            while (!heap.isEmpty()) {
                Map.Entry<Character, Integer> entry = heap.poll();
                stringBuilder.append(entry.getKey());
                entry.setValue(entry.getValue() - 1);
                waitQueue.offer(entry);
                if (waitQueue.size() < k) {
                    continue; //there's only k-1 chars in the waitHeap, not full yet
                }
                Map.Entry<Character, Integer> front = waitQueue.poll();
                if (front.getValue() > 0) {
                    heap.offer(front);
                }
            }

            return stringBuilder.length() == s.length() ? stringBuilder.toString() : "";
        }
    }

}
