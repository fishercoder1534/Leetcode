package com.fishercoder.solutions;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 636. Exclusive Time of Functions
 *
 * Given the running logs of n functions that are executed in a nonpreemptive single threaded CPU,
 * find the exclusive time of these functions.
 * Each function has a unique id, start from 0 to n-1.
 * A function may be called recursively or by another function.
 * A log is a string has this format : function_id:start_or_end:timestamp.
 * For example, "0:start:0" means function 0 starts from the very beginning of time 0.
 * "0:end:0" means function 0 ends to the very end of time 0.
 * Exclusive time of a function is defined as the time spent within this function,
 * the time spent by calling other functions should not be considered as this function's exclusive time.
 * You should return the exclusive time of each function sorted by their function id.

 Example 1:
 Input:
 n = 2
 logs =
 ["0:start:0",
 "1:start:2",
 "1:end:5",
 "0:end:6"]
 Output:[3, 4]
 Explanation:
 Function 0 starts at time 0, then it executes 2 units of time and reaches the end of time 1.
 Now function 0 calls function 1, function 1 starts at time 2, executes 4 units of time and end at time 5.
 Function 0 is running again at time 6, and also end at the time 6, thus executes 1 unit of time.
 So function 0 totally execute 2 + 1 = 3 units of time, and function 1 totally execute 4 units of time.

 Note:
 Input logs will be sorted by timestamp, NOT log id.
 Your output should be sorted by function id, which means the 0th element of your output corresponds to the exclusive time of function 0.
 Two functions won't start or end at the same time.
 Functions could be called recursively, and will always end.
 1 <= n <= 100
 */
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
