package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 890. Find and Replace Pattern
 *
 * You have a list of words and a pattern, and you want to know which words in words matches the pattern.
 * A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
 * (Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)
 * Return a list of the words in words that match the given pattern.
 * You may return the answer in any order.
 *
 *  Example 1:
 *
 * Input: words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb"
 * Output: ["mee","aqq"]
 * Explanation: "mee" matches the pattern because there is a permutation {a -> m, b -> e, ...}.
 * "ccc" does not match the pattern because {a -> c, b -> c, ...} is not a permutation,
 * since a and b map to the same letter.
 *
 * Note:
 * 1 <= words.length <= 50
 * 1 <= pattern.length = words[i].length <= 20
 */
public class _890 {
  public static class Solution1 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
      List<String> result = new ArrayList<>();
      for (String word : words) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        boolean match = true;
        for (int i = 0; i < pattern.length(); i++) {
          if (map.containsKey(pattern.charAt(i))) {
            if (word.charAt(i) != map.get(pattern.charAt(i))) {
              match = false;
              break;
            }
          } else {
            map.put(pattern.charAt(i), word.charAt(i));
            if (!set.add(word.charAt(i))) {
              match = false;
            }
          }
        }
        if (match) {
          result.add(word);
        }
      }
      return result;
    }
  }
}
