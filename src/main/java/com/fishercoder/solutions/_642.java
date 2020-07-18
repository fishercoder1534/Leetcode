package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class _642 {
    public static class Solution1 {

        /**
         * reference: https://discuss.leetcode.com/topic/96150/java-solution-trie-and-priorityqueue/3
         */
        public class AutocompleteSystem {

            Map<String, Integer> map;
            List<Map.Entry<String, Integer>> answers;
            StringBuilder stringBuilder;

            public AutocompleteSystem(String[] sentences, int[] times) {
                map = new HashMap<>();
                answers = new ArrayList<>();
                stringBuilder = new StringBuilder();

                for (int i = 0; i < sentences.length; i++) {
                    map.put(sentences[i], map.getOrDefault(sentences[i], 0) + times[i]);
                }
            }

            public List<String> input(char c) {
                List<String> result = new ArrayList<>();
                if (c == '#') {
                    map.put(stringBuilder.toString(), map.getOrDefault(stringBuilder.toString(), 0) + 1);
                    stringBuilder.setLength(0);
                    answers.clear();/**The user has finished typing, so we'll clean answers to get ready for next search*/
                } else {
                    stringBuilder.append(c);
                    /**when its length is 1, we find all the prefix that is a match and put them into answers,
                     * then for the rest, we'll just remove those that are not match with the prefix any more, we do this logic in else branch*/
                    if (stringBuilder.length() == 1) {
                        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                            if (entry.getKey().startsWith(stringBuilder.toString())) {
                                answers.add(entry);
                            }
                        }
                        Collections.sort(answers, (a, b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue());
                    } else {
                        for (Iterator<Map.Entry<String, Integer>> iterator = answers.iterator(); iterator.hasNext(); ) {
                            if (!iterator.next().getKey().startsWith(stringBuilder.toString())) {
                                iterator.remove();
                            }
                        }
                    }
                    for (int i = 0; i < 3 && i < answers.size(); i++) {
                        result.add(answers.get(i).getKey());
                    }
                }
                return result;
            }
        }

    }
}
