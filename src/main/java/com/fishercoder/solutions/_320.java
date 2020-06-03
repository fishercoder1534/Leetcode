package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _320 {

    public static class Solution1 {
        public List<String> generateAbbreviations(String word) {
            List<String> result = new ArrayList<>();
            backtrack(word, result, 0, "", 0);
            return result;
        }

        private void backtrack(String word, List<String> result, int position, String current,
                               int count) {
            if (position == word.length()) {
                if (count > 0) {
                    current += count;
                }
                result.add(current);
            } else {
                backtrack(word, result, position + 1, current, count + 1);
                backtrack(word, result, position + 1,
                        current + (count > 0 ? count : "") + word.charAt(position), 0);
            }
        }
    }

}
