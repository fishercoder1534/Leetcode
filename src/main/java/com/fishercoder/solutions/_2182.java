package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _2182 {
    public static class Solution1 {
        public String repeatLimitedString(String s, int repeatLimit) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            PriorityQueue<Count> heap = new PriorityQueue<Count>((a, b) -> b.c - a.c);
            for (char c : map.keySet()) {
                heap.offer(new Count(c, map.get(c)));
            }
            StringBuilder sb = new StringBuilder();
            while (!heap.isEmpty()) {
                Count curr = heap.poll();
                int num = Math.min(curr.num, repeatLimit);
                while (num > 0) {
                    sb.append(curr.c);
                    num--;
                }
                if (curr.num > repeatLimit) {
                    Count newCount = new Count(curr.c, curr.num - repeatLimit);
                    if (!heap.isEmpty()) {
                        Count next = heap.poll();
                        sb.append(next.c);
                        if (next.num > 1) {
                            heap.offer(new Count(next.c, next.num - 1));
                        }
                    } else {
                        break;
                    }
                    heap.offer(newCount);
                }
            }
            return sb.toString();
        }

        class Count {
            char c;
            int num;

            public Count(char c, Integer integer) {
                this.c = c;
                this.num = integer;
            }
        }
    }
}
