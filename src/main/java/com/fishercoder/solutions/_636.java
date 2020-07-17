package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _636 {
    public static class Solution1 {
        /**
         * Based on the example, it's difficult to see how function 2 executes 4 units of time, actually
         * we can add 1 to all end times to make it easier to understand and AC'ed.
         */
        public int[] exclusiveTime(int n, List<String> logs) {
            /**Stack is the way to go:
             * we keep pushing the logId onto the stack whenever we just encounter this logId's start timestamp,
             * we'll pop this logId only when we encounter this logId's end timestamp.
             * Meanwhile, we keep a counter called prevTime,
             * whenever the stack is not empty, we'll always deduct prevTime from the last logId on the stack.*/
            Deque<Integer> stack = new LinkedList<>();
            int[] result = new int[n];
            int prevTime = 0;
            for (String log : logs) {
                String[] parts = log.split(":");
                if (!stack.isEmpty()) {
                    result[stack.peek()] += Integer.parseInt(parts[2]) - prevTime;
                }
                prevTime = Integer.parseInt(parts[2]);
                if (parts[1].equals("start")) {
                    stack.addFirst(Integer.parseInt(parts[0]));//i.e. stack.push()
                } else {
                    prevTime++;
                    //remember to have result pluse 1 to match the problem AC criteria
                    result[stack.pollFirst()]++;//i.e. stack.pop()
                }
            }
            return result;
        }
    }
}
