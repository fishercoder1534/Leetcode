package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _1258 {
    public static class Solution1 {
        public List<String> generateSentences(List<List<String>> synonyms, String text) {
            String[] words = text.split(" ");
            Map<String, Set<String>> map = buildSynonymDict(words, synonyms);
            Set<String> result = new HashSet<>();
            result.add(text);
            for (int i = 0; i < words.length; i++) {
                List<String> list = new ArrayList<>();
                for (String next : result) {
                    list.add(next);
                    list.addAll(findAllSynonymForThisWord(next, i, map));
                }
                result.addAll(list);
            }
            List<String> list = new ArrayList<>();
            list.addAll(result);
            Collections.sort(list);
            return list;
        }

        private List<String> findAllSynonymForThisWord(String sentence, int i, Map<String, Set<String>> map) {
            String[] words = sentence.split(" ");
            List<String> list = new ArrayList<>();
            Set<String> synonyms = map.get(words[i]);
            for (String s : synonyms) {
                words[i] = s;
                list.add(formWord(words));
            }
            return list;
        }

        private String formWord(String[] words) {
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                sb.append(word);
                sb.append(" ");
            }
            return sb.substring(0, sb.length() - 1);
        }

        private Map<String, Set<String>> buildSynonymDict(String[] words, List<List<String>> synonyms) {
            Map<String, Set<String>> map = new HashMap<>();
            for (String key : words) {
                if (!map.containsKey(key)) {
                    map.put(key, new HashSet<>());
                }
                map.get(key).add(key);
            }
            for (List<String> list : synonyms) {
                for (String key : map.keySet()) {
                    if (map.get(key).contains(list.get(0))) {
                        map.get(key).add(list.get(1));
                    } else if (map.get(key).contains(list.get(1))) {
                        map.get(key).add(list.get(0));
                    }
                }
            }
            return map;
        }

    }
}
