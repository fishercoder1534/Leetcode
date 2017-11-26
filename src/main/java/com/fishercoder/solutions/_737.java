package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 737. Sentence Similarity II
 *
 * Given two sentences words1, words2 (each represented as an array of strings), and a list of similar word pairs pairs, determine if two sentences are similar.
 * For example, words1 = ["great", "acting", "skills"] and words2 = ["fine", "drama", "talent"] are similar,
 * if the similar word pairs are pairs = [["great", "good"], ["fine", "good"], ["acting","drama"], ["skills","talent"]].
 * Note that the similarity relation is transitive.
 *
 * For example, if "great" and "good" are similar, and "fine" and "good" are similar, then "great" and "fine" are similar.
 * Similarity is also symmetric. For example, "great" and "fine" being similar is the same as "fine" and "great" being similar.
 * Also, a word is always similar with itself. For example, the sentences words1 = ["great"], words2 = ["great"], pairs = [] are similar, even though there are no specified similar word pairs.
 * Finally, sentences can only be similar if they have the same number of words. So a sentence like words1 = ["great"] can never be similar to words2 = ["doubleplus","good"].

 Note:

 The length of words1 and words2 will not exceed 1000.
 The length of pairs will not exceed 2000.
 The length of each pairs[i] will be 2.
 The length of each words[i] and pairs[i][j] will be in the range [1, 20].

 */
public class _737 {
    public static class Solution1 {
        public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
            if (words1.length != words2.length) {
                return false;
            }

            Map<String, String> map = new HashMap<>();
            for (String[] pair : pairs) {
                if (!map.containsKey(pair[0])) {
                    map.put(pair[0], pair[0]);
                }
                if (!map.containsKey(pair[1])) {
                    map.put(pair[1], pair[1]);
                }

                setParent(map, pair[0], pair[1]);
            }

            for (int i = 0; i < words1.length; i++) {
                String parent1 = getParent(map, words1[i]);
                String parent2 = getParent(map, words2[i]);
                if (!parent1.equals(parent2)) {
                    return false;
                }
            }
            return true;
        }

        private void setParent(Map<String, String> map, String word1, String word2) {
            String parent1 = getParent(map, word1);
            String parent2 = getParent(map, word2);
            map.put(parent1, parent2);
        }

        private String getParent(Map<String, String> map, String word) {
            if (!map.containsKey(word)) {
                return word;
            }
            while (!word.equals(map.get(word))) {
                word = map.get(word);
            }
            return word;
        }
    }
}
