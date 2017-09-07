package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 621. Task Scheduler
 *
 * Given a char array representing tasks CPU need to do.
 * It contains capital letters A to Z where different letters represent different tasks.
 * Tasks could be done without original order.
 * Each task could be done in one interval. For each interval, CPU could finish one task or just be idle.
 * However, there is a non-negative cooling interval n that means between two same tasks,
 * there must be at least n intervals that CPU are doing different tasks or just be idle.
 * You need to return the least number of intervals the CPU will take to finish all the given tasks.

 Example 1:
 Input: tasks = ['A','A','A','B','B','B'], n = 2
 Output: 8
 Explanation: A -> B -> idle -> A -> B -> idle -> A -> B.

 Note:
 The number of tasks is in the range [1, 10000].
 The integer n is in the range [0, 100].
 */
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