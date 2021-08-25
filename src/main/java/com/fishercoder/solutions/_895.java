package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _895 {
    public static class Solution1 {
        public static class FreqStack {
            int counter;
            PriorityQueue<int[]> maxHeap;
            Map<Integer, Integer> map;

            public FreqStack() {
                maxHeap = new PriorityQueue<>((a, b) -> a[1] != b[1] ? b[1] - a[1] : b[2] - a[2]);
                map = new HashMap<>();
            }

            public void push(int x) {
                map.put(x, map.getOrDefault(x, 0) + 1);
                maxHeap.offer(new int[]{x, map.get(x), counter++});
            }

            public int pop() {
                int[] top = maxHeap.poll();
                map.put(top[0], map.get(top[0]) - 1);
                return top[0];
            }
        }
    }
}
