package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
