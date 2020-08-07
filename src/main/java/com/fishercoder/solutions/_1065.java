package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
