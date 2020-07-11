package com.fishercoder.solutions;

import java.util.List;

public class _422 {

    public static class Solution1 {
        public boolean validWordSquare(List<String> words) {
            for (int i = 0; i < words.size(); i++) {
                String word = words.get(i);
                for (int j = 0; j < word.length(); j++) {
                    if (j >= words.size()) {
                        return false;
                    }
                    if (i >= words.get(j).length()) {
                        return false;
                    }
                    if (word.charAt(j) != words.get(j).charAt(i)) {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
