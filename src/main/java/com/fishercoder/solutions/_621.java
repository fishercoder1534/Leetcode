package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class _621 {

    public static class Solution1 {

        public int leastInterval(char[] tasks, int n) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : tasks) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            PriorityQueue<Task> maxHeap = new PriorityQueue<>((a, b) -> b.total - a.total);
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                maxHeap.offer(new Task(entry.getValue(), entry.getKey()));
            }
            int times = 0;
            while (!maxHeap.isEmpty()) {
                int i = 0;
                List<Task> temp = new ArrayList<>();
                while (i <= n) {
                    if (!maxHeap.isEmpty()) {
                        if (maxHeap.peek().total > 1) {
                            Task curr = maxHeap.poll();
                            temp.add(new Task(curr.total - 1, curr.character));
                        } else {
                            maxHeap.poll();
                        }
                    }
                    times++;
                    if (maxHeap.isEmpty() && temp.size() == 0) {
                        break;
                    }
                    i++;
                }
                for (Task task : temp) {
                    maxHeap.offer(task);
                }
            }
            return times;
        }

        class Task {
            int total;
            char character;

            public Task(int total, char character) {
                this.total = total;
                this.character = character;
            }
        }
    }

}