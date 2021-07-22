package com.fishercoder.solutions;

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
            Map<Character, Set<Character>> map = new HashMap<>();
            Map<Character, Integer> degree = new HashMap<>();
            String result = "";
            if (words == null || words.length == 0) {
                return result;
            }
            for (String s : words) {
                for (char c : s.toCharArray()) {
                    degree.put(c, 0);
                }
            }
            for (int i = 0; i < words.length - 1; i++) {
                String curr = words[i];
                String next = words[i + 1];
                if (curr.length() > next.length() && curr.startsWith(next)) {
                    return "";
                }
                int minLen = Math.min(curr.length(), next.length());
                for (int j = 0; j < minLen; j++) {
                    char c1 = curr.charAt(j);
                    char c2 = next.charAt(j);
                    if (c1 != c2) {
                        Set<Character> set = new HashSet<>();
                        if (map.containsKey(c1)) {
                            set = map.get(c1);
                        }
                        if (!set.contains(c2)) {
                            set.add(c2);
                            map.put(c1, set);
                            degree.put(c2, degree.get(c2) + 1);
                        }
                        break;
                    }
                }
            }
            Queue<Character> queue = new LinkedList<>();
            for (char c : degree.keySet()) {
                if (degree.get(c) == 0) {
                    queue.offer(c);
                }
            }
            while (!queue.isEmpty()) {
                char curr = queue.poll();
                result += curr;
                if (map.containsKey(curr)) {
                    for (char c : map.get(curr)) {
                        degree.put(c, degree.get(c) - 1);
                        if (degree.get(c) == 0) {
                            queue.offer(c);
                        }
                    }
                }
            }
            if (result.length() != degree.size()) {
                return "";
            }
            return result;
        }
    }

}
