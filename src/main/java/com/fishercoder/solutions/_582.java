package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 582. Kill Process
 *
 * Given n processes, each process has a unique PID (process id) and its PPID (parent process id).

 Each process only has one parent process, but may have one or more children processes. This is just like a tree structure. Only one process has PPID that is 0, which means this process has no parent process. All the PIDs will be distinct positive integers.

 We use two list of integers to represent a list of processes, where the first list contains PID for each process and the second list contains the corresponding PPID.

 Now given the two lists, and a PID representing a process you want to kill, return a list of PIDs of processes that will be killed in the end. You should assume that when a process is killed, all its children processes will be killed. No order is required for the final answer.

 Example 1:
 Input:
 pid =  [1, 3, 10, 5]
 ppid = [3, 0, 5, 3]
 kill = 5
 Output: [5,10]

 Explanation:
     3
   /   \
  1     5
       /
      10

 Kill 5 will also kill 10.

 Note:
 The given kill id is guaranteed to be one of the given PIDs.
 n >= 1.
 */
public class _582 {

    public static class Solution1 {
        public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
            Map<Integer, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < pid.size(); i++) {
                map.putIfAbsent(ppid.get(i), new LinkedList<>());
                map.get(ppid.get(i)).add(pid.get(i));
            }
            List<Integer> result = new LinkedList<>();
            Deque<Integer> stack = new ArrayDeque<>();
            stack.offer(kill);
            while (!stack.isEmpty()) {
                int curr = stack.poll();
                result.add(curr);
                List<Integer> list = map.get(curr);
                if (list != null) {
                    stack.addAll(list);
                }
            }
            return result;
        }
    }

}
