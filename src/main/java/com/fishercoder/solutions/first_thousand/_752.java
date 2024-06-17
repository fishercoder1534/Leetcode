package com.fishercoder.solutions.first_thousand;

import java.util.*;

public class _752 {
    public static class Solution1 {
        public int openLock(String[] deadends, String target) {
            // Map the next slot digit for each current slot digit.
            Map<Character, Character> nextSlot = new HashMap<Character, Character>() {
                {
                    put('0', '1');
                    put('1', '2');
                    put('2', '3');
                    put('3', '4');
                    put('4', '5');
                    put('5', '6');
                    put('6', '7');
                    put('7', '8');
                    put('8', '9');
                    put('9', '0');
                }
            };
            // Map the previous slot digit for each current slot digit.
            Map<Character, Character> prevSlot = new HashMap<Character, Character>() {
                {
                    put('0', '9');
                    put('1', '0');
                    put('2', '1');
                    put('3', '2');
                    put('4', '3');
                    put('5', '4');
                    put('6', '5');
                    put('7', '6');
                    put('8', '7');
                    put('9', '8');
                }
            };

            // Set to store visited and dead-end combinations.
            Set<String> visited = new HashSet<>(Arrays.asList(deadends));
            // Queue to store combinations generated after each turn.
            Queue<String> q = new LinkedList<>();

            // Count the number of wheel turns made.
            int turns = 0;

            // If the starting combination is also a dead-end,
            // then we can't move from the starting combination.
            if (visited.contains("0000")) {
                return -1;
            }

            // Start with the initial combination '0000'.
            q.add("0000");
            visited.add("0000");

            while (!q.isEmpty()) {
                // Explore all the combinations of the current level.
                int currLevelNodesCount = q.size();
                for (int i = 0; i < currLevelNodesCount; i++) {
                    // Get the current combination from the front of the queue.
                    String curr = q.poll();

                    // If the current combination matches the target,
                    // return the number of turns/level.
                    if (curr.equals(target)) {
                        return turns;
                    }

                    // Explore all possible new combinations by turning each wheel in both directions.
                    for (int j = 0; j < curr.length(); j += 1) {
                        // Generate the new combination by turning the wheel to the next digit.
                        StringBuilder newCombination = new StringBuilder(curr);
                        newCombination.setCharAt(j, nextSlot.get(newCombination.charAt(j)));
                        // If the new combination is not a dead-end and was never visited,
                        // add it to the queue and mark it as visited.
                        if (!visited.contains(newCombination.toString())) {
                            q.add(newCombination.toString());
                            visited.add(newCombination.toString());
                        }

                        // Generate the new combination by turning the wheel to the previous digit.
                        newCombination = new StringBuilder(curr);
                        newCombination.setCharAt(j, prevSlot.get(newCombination.charAt(j)));
                        // If the new combination is not a dead-end and is never visited,
                        // add it to the queue and mark it as visited.
                        if (!visited.contains(newCombination.toString())) {
                            q.add(newCombination.toString());
                            visited.add(newCombination.toString());
                        }
                    }
                }
                // We will visit next-level combinations.
                turns++;
            }
            // We never reached the target combination.
            return -1;
        }
    }
}
