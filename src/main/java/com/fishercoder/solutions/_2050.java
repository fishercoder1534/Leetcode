package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _2050 {
    public static class Solution1 {

        /**
         * My original solution, but results in TLE on LeetCode at 39/40 test cases...
         */
        public int minimumTime(int n, int[][] relations, int[] time) {
            Map<Integer, Set<Integer>> prereqMap = new HashMap<>();
            for (int[] rel : relations) {
                int pre = rel[0];
                int then = rel[1];
                Set<Integer> list = prereqMap.getOrDefault(then, new HashSet<>());
                list.add(pre);
                prereqMap.put(then, list);
            }
            Queue<Integer> queue = new LinkedList<>();
            Map<Integer, Integer> minMap = new HashMap<>();
            for (int i = 0; i < n; i++) {
                if (!prereqMap.containsKey(i + 1)) {
                    minMap.put(i + 1, time[i]);
                } else {
                    queue.add(i + 1);
                }
            }
            int minTime = 0;
            while (!queue.isEmpty()) {
                Integer curr = queue.poll();
                int thisMinTime = Integer.MIN_VALUE;
                Set<Integer> reqs = prereqMap.get(curr);
                boolean valid = true;
                for (int r : reqs) {
                    if (!minMap.containsKey(r)) {
                        queue.offer(curr);
                        valid = false;
                        break;
                    } else {
                        thisMinTime = Math.max(minMap.get(r), thisMinTime);
                    }
                }
                if (valid) {
                    minMap.put(curr, thisMinTime + time[curr - 1]);
                }
            }
            for (int key : minMap.keySet()) {
                minTime = Math.max(minTime, minMap.get(key));
            }
            return minTime;
        }

    }
}
