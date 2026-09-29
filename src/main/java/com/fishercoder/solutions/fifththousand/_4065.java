package com.fishercoder.solutions.fifththousand;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _4065 {
    public static class Solution1 {
        public int[] rearrangeArray(int[] nums) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int key : nums) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            }
            PriorityQueue<int[]> pq =
                    new PriorityQueue<>(
                            (a, b) -> {
                                if (a[0] != b[0]) {
                                    return a[0] - b[0];
                                }
                                return a[1] - b[1];
                            });
            for (int key : map.keySet()) {
                pq.offer(new int[] {key, map.get(key)});
            }
            int[] res = new int[nums.length];
            int i = 0;
            PriorityQueue<int[]> pq2 =
                    new PriorityQueue<>(
                            (a, b) -> {
                                if (a[0] != b[0]) {
                                    return a[0] - b[0];
                                }
                                return a[1] - b[1];
                            });
            while (!pq.isEmpty()) {
                int size = pq.size();
                for (int index = 0; index < size && i < nums.length; index++) {
                    int[] cur = pq.poll();
                    res[i++] = cur[0];
                    if (cur[1] > 1) {
                        pq2.offer(new int[] {cur[0], cur[1] - 1});
                    }
                }
                if (!pq2.isEmpty()) {
                    pq.addAll(pq2);
                    pq2.clear();
                }
            }
            return res;
        }
    }
}
