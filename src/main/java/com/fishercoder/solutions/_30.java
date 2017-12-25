package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 30. Substring with Concatenation of All Words
 *
 * You are given a string, s, and a list of words, words, that are all of the same length.
 * Find all starting indices of substring(s) in s that is a concatenation of each word in words exactly once and without any intervening characters.

 For example, given:
 s: "barfoothefoobarman"
 words: ["foo", "bar"]

 You should return the indices: [0,9].
 (order does not matter).
 */
public class _30 {

  public static class Solution1 {
    public List<Integer> findSubstring(String s, String[] words) {
      Map<String, Boolean> map = new HashMap<>();
      for (String word : words) {
        map.put(word, true);
      }
      List<Integer> result = new ArrayList<>();
      int startIndex = 0;
      for (int i = 0; i < s.length(); i++) {
        startIndex = i;
        Map<String, Boolean> clone = new HashMap<>(map);
        for (int j = i +1; j < s.length(); j++) {
          String word = s.substring(i, j);
          if (clone.containsKey(word) && clone.get(word)) {
            clone.put(word, false);
            i = j+1;
          } else {
            break;
          }
        }
        boolean all = true;
        for (String word : clone.keySet()) {
          if (clone.get(word)) {
            all = false;
            break;
          }
        }
        if (all) {
          result.add(startIndex);
        }
      }
      return result;
    }
  }

}
