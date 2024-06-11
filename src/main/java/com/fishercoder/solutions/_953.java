package com.fishercoder.solutions;

import java.util.Arrays;
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
                if (firstWord.charAt(i) != secondWord.charAt(i)) {
                    return map.get(firstWord.charAt(i)) <= map.get(secondWord.charAt(i));
                }
            }
            return firstWord.length() <= secondWord.length();
        }
    }

    public static class Solution2 {
        /**
         * Solution1 above is actually consistently faster than this Solution2 on LeetCode.
         */
        public boolean isAlienSorted(String[] words, String order) {
            String[] copy = Arrays.copyOf(words, words.length);
            Arrays.sort(words, (o1, o2) -> {
                int pos1 = 0;
                int pos2 = 0;
                for (int i = 0; i < Math.min(o1.length(), o2.length()); i++) {
                    pos1 = order.indexOf(o1.charAt(i));
                    pos2 = order.indexOf(o2.charAt(i));
                    if (pos1 != pos2) {
                        break;
                    }
                }

                if (pos1 == pos2 && o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                }

                return pos1 - pos2;
            });
            for (int i = 0; i < words.length; i++) {
                if (!copy[i].equals(words[i])) {
                    return false;
                }
            }
            return true;
        }
    }
}
