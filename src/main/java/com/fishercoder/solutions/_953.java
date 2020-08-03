package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _953 {
    public static class Solution1 {
        public boolean isAlienSorted(String[] words, String order) {
            if (words.length == 1) {
                return true;
            }

            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < order.length(); i++) {
                map.put(order.charAt(i), i);
            }

            for (int i = 0; i < words.length - 1; i++) {
                String firstWord = words[i];
                String secondWord = words[i + 1];
                if (!sorted(firstWord, secondWord, map)) {
                    return false;
                }
            }
            return true;
        }

        private boolean sorted(String firstWord, String secondWord, Map<Character, Integer> map) {
            for (int i = 0; i < Math.min(firstWord.length(), secondWord.length()); i++) {
                if (firstWord.charAt(i) == secondWord.charAt(i)) {
                    continue;
                } else {
                    if (map.get(firstWord.charAt(i)) > map.get(secondWord.charAt(i))) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
            return firstWord.length() <= secondWord.length();
        }
    }
}
