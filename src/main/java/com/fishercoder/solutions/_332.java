package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 332. Reconstruct Itinerary
 *
 * Given a list of airline tickets represented by pairs of departure and arrival airports [from, to],
 * reconstruct the itinerary in order. All of the tickets belong to a man who departs from JFK. Thus, the itinerary must begin with JFK.

 Note:
 If there are multiple valid itineraries, you should return the itinerary that has the smallest lexical order when read as a single string.
 For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].

 All airports are represented by three capital letters (IATA code).

 You may assume all tickets form at least one valid itinerary.
 Example 1:
 tickets = [["MUC", "LHR"], ["JFK", "MUC"], ["SFO", "SJC"], ["LHR", "SFO"]]
 Return ["JFK", "MUC", "LHR", "SFO", "SJC"].

 Example 2:
 tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
 Return ["JFK","ATL","JFK","SFO","ATL","SFO"].
 Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"]. But it is larger in lexical order.
 */
public class _332 {

    public static class Solution1 {
        /** credit: https://discuss.leetcode.com/topic/36383/share-my-solution */
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
