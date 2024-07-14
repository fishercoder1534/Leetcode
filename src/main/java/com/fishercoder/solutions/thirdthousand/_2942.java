package com.fishercoder.solutions.thirdthousand;

import java.util.ArrayList;
import java.util.List;

public class _2942 {
    public static class Solution1 {
        public List<Integer> findWordsContaining(String[] words, char x) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < words.length; i++) {
                if (words[i].indexOf(x) != -1) {
                    result.add(i);
                }
            }
            return result;
        }
    }
}
