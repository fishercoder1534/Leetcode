package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 49. Group Anagrams
 *
 * Given an array of strings, group anagrams together.
 *
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Return:
 * [
 * ["ate", "eat","tea"],
 * ["nat","tan"],
 * ["bat"]
 * ]
 *
 * Note:
 *  All inputs will be in lowercase.
 *  The order of your output does not matter.
 */

public class _49 {

    public static class Solution1 {
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
}
