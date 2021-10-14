package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49 {

    public static class Solution1 {
        /**
         * Time: O(n*k*logk) where n is the # of strings in the given input and k is the maximum length of each string
         */
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String word : strs) {
                char[] c = word.toCharArray();
                Arrays.sort(c);
                String key = new String(c);
                if (!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                map.get(key).add(word);
            }
            return new ArrayList<>(map.values());
        }
    }

    public static class Solution2 {
        /**
         * This is an improvement to the above solution in terms of time complexity.
         * Time: O(n*k) where n is the # of strings in the given input and k is the maximum length of each string
         */
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();
            for (String word : strs) {
                int[] count = new int[26];
                for (char c : word.toCharArray()) {
                    count[c - 'a']++;
                }
                StringBuilder sb = new StringBuilder();
                for (int c : count) {
                    sb.append(c);
                    sb.append("$");
                }
                if (!map.containsKey(sb.toString())) {
                    map.put(sb.toString(), new ArrayList<>());
                }
                map.get(sb.toString()).add(word);
            }
            return new ArrayList<>(map.values());
        }
    }
}
