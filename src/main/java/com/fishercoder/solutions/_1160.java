package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1160 {
    public static class Solution1 {
        public int countCharacters(String[] words, String chars) {
            int length = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (char c : chars.toCharArray()) {
                int count = map.getOrDefault(c, 0);
                map.put(c, count + 1);

            }
            for (String word : words) {
                if (canForm(word, map)) {
                    length += word.length();
                }
            }
            return length;
        }

        private boolean canForm(String word, final Map<Character, Integer> map) {
            Map<Character, Integer> tmp = new HashMap<>(map);
            for (Character c : word.toCharArray()) {
                if (tmp.containsKey(c) && tmp.get(c) > 0) {
                    int count = tmp.get(c);
                    tmp.put(c, count - 1);
                } else {
                    return false;
                }
            }
            return true;
        }

    }
}
