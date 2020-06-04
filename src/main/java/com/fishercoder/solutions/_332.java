package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class _332 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/36383/share-my-solution
         */
        public List<String> findItinerary(String[][] tickets) {
            Map<String, PriorityQueue<String>> flights = new HashMap<>();
            LinkedList<String> path = new LinkedList<>();
            for (String[] ticket : tickets) {
                flights.putIfAbsent(ticket[0], new PriorityQueue<>());
                flights.get(ticket[0]).add(ticket[1]);
            }
            dfs("JFK", flights, path);
            return path;
        }

        public void dfs(String departure, Map<String, PriorityQueue<String>> flights,
                        LinkedList path) {
            PriorityQueue<String> arrivals = flights.get(departure);
            while (arrivals != null && !arrivals.isEmpty()) {
                dfs(arrivals.poll(), flights, path);
            }
            path.addFirst(departure);
        }
    }
}
