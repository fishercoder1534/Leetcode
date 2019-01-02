package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 953. Verifying an Alien Dictionary
 *
 * In an alien language, surprisingly they also use english lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
 *
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographicaly in this alien language.
 *
 * Example 1:
 *
 * Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
 * Output: true
 * Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
 *
 * Example 2:
 *
 * Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
 * Output: false
 * Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
 *
 * Example 3:
 *
 * Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
 * Output: false
 * Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).
 *
 *
 * Note:
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 20
 * order.length == 26
 * All characters in words[i] and order are english lowercase letters.
 */
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
