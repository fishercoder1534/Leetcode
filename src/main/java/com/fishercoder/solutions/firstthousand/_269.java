package com.fishercoder.solutions.firstthousand;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class _269 {
    public static class Solution1 {
        /**
         * reference: https://discuss.leetcode.com/topic/28308/java-ac-solution-using-bfs
         */
        public String alienOrder(String[] words) {
            Map<Character, Set<Character>> charToSmallerCharsMap = new HashMap<>();//this map means all chars in the value set are after the char in the key
            Map<Character, Integer> indegreeMap = new HashMap<>();//this map means how many chars are before this given char
            StringBuilder result = new StringBuilder();
            if (words == null || words.length == 0) {
                return result.toString();
            }
            for (String s : words) {
                for (char c : s.toCharArray()) {
                    //we go through each word, nothing to compare, so each char's degree should be zero
                    //only when we compare words[i] with words[i+1], we know the order of different chars
                    indegreeMap.put(c, 0);
                }
            }
            for (int i = 0; i < words.length - 1; i++) {
                String curr = words[i];
                String next = words[i + 1];
                if (curr.length() > next.length() && curr.startsWith(next)) {
                    return "";
                }
                for (int j = 0; j < curr.length(); j++) {
                    char c1 = curr.charAt(j);
                    char c2 = next.charAt(j);
                    if (c1 != c2) {
                        Set<Character> set = charToSmallerCharsMap.getOrDefault(c1, new HashSet<>());
                        if (!set.contains(c2)) {
                            set.add(c2);
                            charToSmallerCharsMap.put(c1, set);
                            indegreeMap.put(c2, indegreeMap.get(c2) + 1);
                        }
                        //no longer need to continue iterating through either one of these two words and should not to,
                        //because the first two chars at the same position of these two words that differ decides the order
                        break;
                    }
                }
            }
            Queue<Character> queue = new LinkedList<>();
            for (char c : indegreeMap.keySet()) {
                if (indegreeMap.get(c) == 0) {
                    //this means no chars come before this char, so they should be at the head of this alien dictionary
                    queue.offer(c);
                }
            }
            while (!queue.isEmpty()) {
                char curr = queue.poll();
                result.append(curr);
                if (charToSmallerCharsMap.containsKey(curr)) {
                    for (char c : charToSmallerCharsMap.get(curr)) {
                        indegreeMap.put(c, indegreeMap.get(c) - 1);
                        if (indegreeMap.get(c) == 0) {
                            queue.offer(c);
                        }
                    }
                }
            }
            if (result.length() != indegreeMap.size()) {
                return "";
            }
            return result.toString();
        }
    }

}
