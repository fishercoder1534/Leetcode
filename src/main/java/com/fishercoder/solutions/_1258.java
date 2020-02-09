package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 1258. Synonymous Sentences
 *
 * Given a list of pairs of equivalent words synonyms and a sentence text, Return all possible synonymous sentences sorted lexicographically.
 *
 * Example 1:
 * Input:
 * synonyms = [["happy","joy"],["sad","sorrow"],["joy","cheerful"]],
 * text = "I am happy today but was sad yesterday"
 * Output:
 * ["I am cheerful today but was sad yesterday",
 * ​​​​​​​"I am cheerful today but was sorrow yesterday",
 * "I am happy today but was sad yesterday",
 * "I am happy today but was sorrow yesterday",
 * "I am joy today but was sad yesterday",
 * "I am joy today but was sorrow yesterday"]
 *
 * Constraints:
 * 0 <= synonyms.length <= 10
 * synonyms[i].length == 2
 * synonyms[0] != synonyms[1]
 * All words consist of at most 10 English letters only.
 * text is a single space separated sentence of at most 10 words.
 * */
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
