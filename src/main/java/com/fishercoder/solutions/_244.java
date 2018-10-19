package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 244. Shortest Word Distance II
 *
 * This is a follow up of Shortest Word Distance. The only difference is now you are given the list of words and your method will be called repeatedly many times with different parameters. How would you optimize it?
 * Design a class which receives a list of words in the constructor, and implements a method that takes two words word1 and word2 and return the shortest distance between these two words in the list.

 For example,
 Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

 Given word1 = “coding”, word2 = “practice”, return 3.
 Given word1 = "makes", word2 = "coding", return 1.

 Note:
 You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 */
public class _244 {
    public static class Solution1 {
        class WordDistance {

            private Map<String, List<Integer>> map;

            public WordDistance(String[] words) {
                map = new HashMap<>();
                for (int i = 0; i < words.length; i++) {
                    String w = words[i];
                    if (map.containsKey(w)) {
                        map.get(w).add(i);
                    } else {
                        List<Integer> list = new ArrayList<>();
                        list.add(i);
                        map.put(w, list);
                    }
                }
            }

            public int shortest(String word1, String word2) {
                List<Integer> list1 = map.get(word1);
                List<Integer> list2 = map.get(word2);
                int result = Integer.MAX_VALUE;
                for (int i = 0, j = 0; i < list1.size() && j < list2.size(); ) {
                    int index1 = list1.get(i);
                    int index2 = list2.get(j);
                    if (index1 < index2) {
                        result = Math.min(result, index2 - index1);
                        i++;
                    } else {
                        result = Math.min(result, index1 - index2);
                        j++;
                    }
                }
                return result;
            }
        }
    }
}
