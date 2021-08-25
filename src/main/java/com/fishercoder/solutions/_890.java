package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _890 {
    public static class Solution1 {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> result = new ArrayList<>();
            for (String word : words) {
                Map<Character, Character> map = new HashMap<>();
                Set<Character> set = new HashSet<>();
                boolean match = true;
                for (int i = 0; i < pattern.length(); i++) {
                    if (map.containsKey(pattern.charAt(i))) {
                        if (word.charAt(i) != map.get(pattern.charAt(i))) {
                            match = false;
                            break;
                        }
                    } else {
                        map.put(pattern.charAt(i), word.charAt(i));
                        if (!set.add(word.charAt(i))) {
                            match = false;
                        }
                    }
                }
                if (match) {
                    result.add(word);
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> result = new ArrayList<>();
            for (String word : words) {
                if (matches(word, pattern)) {
                    result.add(word);
                }
            }
            return result;
        }

        private boolean matches(String word, String pattern) {
            Map<Character, Character> map1 = new HashMap<>();//word -> p
            Map<Character, Character> map2 = new HashMap<>();//p -> word
            for (int i = 0; i < pattern.length(); i++) {
                if (!map1.containsKey(word.charAt(i))) {
                    map1.put(word.charAt(i), pattern.charAt(i));
                }
                if (map1.containsKey(word.charAt(i)) && map1.get(word.charAt(i)) != pattern.charAt(i)) {
                    return false;
                }
                if (!map2.containsKey(pattern.charAt(i))) {
                    map2.put(pattern.charAt(i), word.charAt(i));
                }
                if (map2.containsKey(pattern.charAt(i)) && map2.get(pattern.charAt(i)) != word.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
