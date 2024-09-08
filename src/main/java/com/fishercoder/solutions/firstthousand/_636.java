package com.fishercoder.solutions.firstthousand;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _636 {
    public static class Solution1 {
        public int[] exclusiveTime(int n, List<String> logs) {
            /*Stack is the way to go:
             * 1. we keep pushing the logId onto the stack whenever we just encounter this logId's start timestamp,
             * 2. we'll pop this logId only when we encounter this logId's end timestamp.
             * 3. Meanwhile, we keep a counter called prevTime,
             * 4. whenever the stack is not empty, we'll always deduct prevTime from the last logId on the stack.*/
            Deque<Integer> stack = new LinkedList<>();
            int[] result = new int[n];
            int prevTime = 0;
            for (String log : logs) {
                String[] parts = log.split(":");
                if (!stack.isEmpty()) {
                    result[stack.peekLast()] += Integer.parseInt(parts[2]) - prevTime;
                }
                prevTime = Integer.parseInt(parts[2]);
                if (parts[1].equals("start")) {
                    stack.addLast(Integer.parseInt(parts[0]));
                } else {
                    // remember to have result plus 1, i.e. when a task starts at 2, ends at 5, it
                    // should be 5 -2 + 1 = 4
                    prevTime++;
                    result[stack.pollLast()]++;
                }
            }
            return result;
        }
    }
}
