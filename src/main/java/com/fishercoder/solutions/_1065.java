package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 1065. Index Pairs of a String
 *
 * Given a text string and words (a list of strings),
 * return all index pairs [i, j] so that the substring text[i]...text[j] is in the list of words.
 *
 * Example 1:
 * Input: text = "thestoryofleetcodeandme", words = ["story","fleet","leetcode"]
 * Output: [[3,7],[9,13],[10,17]]
 *
 * Example 2:
 * Input: text = "ababa", words = ["aba","ab"]
 * Output: [[0,1],[0,2],[2,3],[2,4]]
 * Explanation:
 * Notice that matches can overlap, see "aba" is found in [0,2] and [2,4].
 *
 * Note:
 *
 * All strings contains only lowercase English letters.
 * It's guaranteed that all strings in words are different.
 * 1 <= text.length <= 100
 * 1 <= words.length <= 20
 * 1 <= words[i].length <= 50
 * Return the pairs [i,j] in sorted order (i.e. sort them by their first coordinate in case of ties sort them by their second coordinate).
 * */
public class _1065 {
    public static class Solution1 {
        public int[][] indexPairs(String text, String[] words) {
            List<List<Integer>> lists = new ArrayList<>();
            for (String word : words) {
                lists.addAll(findAllMatchsForThisWord(word, text));
            }
            if (lists.isEmpty()) {
                return new int[][]{};
            }
            Collections.sort(lists, (o1, o2) -> {
                if (o1.get(0) > o2.get(0)) {
                    return 1;
                } else if (o1.get(0) < o2.get(0)) {
                    return -1;
                } else {
                    if (o1.get(1) > o2.get(1)) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
            });
            int[][] result = new int[lists.size()][lists.get(0).size()];
            for (int i = 0; i < lists.size(); i++) {
                result[i][0] = lists.get(i).get(0);
                result[i][1] = lists.get(i).get(1);
            }
            return result;
        }

        private List<List<Integer>> findAllMatchsForThisWord(String word, String text) {
            List<List<Integer>> lists = new ArrayList<>();
            for (int i = 0; i <= text.length() - word.length(); i++) {
                if (text.substring(i, i + word.length()).equals(word)) {
                    lists.add(Arrays.asList(i, i + word.length() - 1));
                }
            }
            return lists;
        }
    }
}
