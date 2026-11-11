package com.fishercoder.solutions.firstthousand;

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
        /**
         * My completely original solution.
         */

        public List<String> findAndReplacePattern(String[] words, String pattern) {
            List<String> result = new ArrayList<>();
            for (String word : words) {
                if (matchPattern(word, pattern)) {
                    result.add(word);
                }
            }
            return result;
        }

        private boolean matchPattern(String word, String pattern) {
            Map<Character, Character> patternToWordMap = new HashMap<>();
            Map<Character, Character> wordToPatternMap = new HashMap<>();
            int i = 0;
            for (; i < pattern.length() && i < word.length(); i++) {
                if (!patternToWordMap.containsKey(pattern.charAt(i))) {
                    patternToWordMap.put(pattern.charAt(i), word.charAt(i));
                } else if (patternToWordMap.get(pattern.charAt(i)) != word.charAt(i)) {
                    return false;
                }

                if (!wordToPatternMap.containsKey(word.charAt(i))) {
                    wordToPatternMap.put(word.charAt(i), pattern.charAt(i));
                } else if (wordToPatternMap.get(word.charAt(i)) != pattern.charAt(i)) {
                    return false;
                }
            }
            for (; i < word.length(); i++) {
                if (!wordToPatternMap.containsKey(word.charAt(i))) {
                    return false;
                } else if (wordToPatternMap.get(word.charAt(i)) != word.charAt(i)) {
                    return false;
                }
            }
            return true;
        }

    }
}
