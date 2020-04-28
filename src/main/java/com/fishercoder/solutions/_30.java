package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _30 {

  public static class Solution1 {
    /**TODO: this one is not AC'ed. fix this one.*/
    public List<Integer> findSubstring(String s, String[] words) {
      Map<String, Integer> map = new HashMap<>();
      for (String word : words) {
        map.put(word, 1);
      }
      List<Integer> result = new ArrayList<>();
      int startIndex = 0;
      int wordLen = words.length;
      for (int i = 0; i < s.length(); i++) {
        startIndex = i;
        Map<String, Integer> clone = new HashMap<>(map);
        int matchedWord = 0;
        for (int j = i + 1; j < s.length(); j++) {
          String word = s.substring(i, j);
          if (clone.containsKey(word) && clone.get(word) == 1) {
            clone.put(word, 0);
            i = j;
            matchedWord++;
          }
          if (matchedWord == wordLen) {
            boolean all = true;
            for (String key : clone.keySet()) {
              if (clone.get(key) != 0) {
                all = false;
                break;
              }
            }
            if (all) {
              result.add(startIndex);
            }
            matchedWord = 0;
          }
        }
      }
      return result;
    }
  }

}
