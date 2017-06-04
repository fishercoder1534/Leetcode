package com.fishercoder.solutions;

import java.util.*;

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

    /**credit: https://discuss.leetcode.com/topic/36383/share-my-solution*/
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

    public void dfs(String departure, Map<String, PriorityQueue<String>> flights, LinkedList path) {
        PriorityQueue<String> arrivals = flights.get(departure);
        while (arrivals != null && !arrivals.isEmpty()) {
            dfs(arrivals.poll(), flights, path);
        }
        path.addFirst(departure);
    }


    public static class MyOwnAttempt {
        public List<String> findItinerary(String[][] tickets) {
            List<List<String>> allPossibilities = new ArrayList<>();
            /**Find all tickets that start from JFK first*/
            List<String[]> JFKStarts = new ArrayList<>();
            for (String[] ticket : tickets) {
                if (ticket[0].equals("JFK")) {
                    JFKStarts.add(ticket);
                }
            }

            for (String[] ticket : JFKStarts) {
                List<String> thisPossibility = new ArrayList<>();
                thisPossibility.add(ticket[0]);
                thisPossibility.add(ticket[1]);
                dfs(ticket, thisPossibility, tickets, allPossibilities);
            }

            //sort lexicographically and return the smallest
            Collections.sort(allPossibilities, new ListComparator<>());
            return allPossibilities.get(0);
        }

        private void dfs(String[] thisTicket, List<String> thisPossibility, String[][] tickets, List<List<String>> allPossibilities) {
            if (thisPossibility.size() == tickets.length + 1) {
                allPossibilities.add(new ArrayList<>(thisPossibility));
                return;
            }
            for (String[] ticket : tickets) {
                if (!ticket.equals(thisTicket) && thisPossibility.get(thisPossibility.size() - 1).equals(ticket[0])) {
                    thisPossibility.add(ticket[1]);
                    dfs(ticket, thisPossibility, tickets, allPossibilities);
                    thisPossibility.remove(thisPossibility.size() - 1);
                }
            }
        }

        private class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {
            @Override
            public int compare(List<T> o1, List<T> o2) {
                for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
                    int c = o1.get(i).compareTo(o2.get(i));
                    if (c != 0) {
                        return c;
                    }
                }
                return Integer.compare(o1.size(), o2.size());
            }
        }
    }
}
