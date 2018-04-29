package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 140. Word Break II

 Given a non-empty string s and a dictionary wordDict containing a list of non-empty words,
 add spaces in s to construct a sentence where each word is a valid dictionary word.
 Return all such possible sentences.

 Note:

 The same word in the dictionary may be reused multiple times in the segmentation.
 You may assume the dictionary does not contain duplicate words.

 Example 1:

 Input:
 s = "catsanddog"
 wordDict = ["cat", "cats", "and", "sand", "dog"]
 Output:
 [
 "cats and dog",
 "cat sand dog"
 ]

 Example 2:

 Input:
 s = "pineapplepenapple"
 wordDict = ["apple", "pen", "applepen", "pine", "pineapple"]
 Output:
 [
 "pine apple pen apple",
 "pineapple pen apple",
 "pine applepen apple"
 ]
 Explanation: Note that you are allowed to reuse a dictionary word.

 Example 3:

 Input:
 s = "catsandog"
 wordDict = ["cats", "dog", "sand", "and", "cat"]
 Output:
 []
 */

public class _140 {
  public static class Solution1 {
    public List<String> wordBreak(String s, List<String> wordDict) {
      return dfs(s, wordDict, new HashMap<>());
    }

    List<String> dfs(String s, List<String> wordDict, HashMap<String, List<String>> map) {
      if (map.containsKey(s)) {
        return map.get(s);
      }

      ArrayList<String> result = new ArrayList<>();
      if (s.length() == 0) {
        result.add("");
        return result;
      }

      for (String word : wordDict) {
        if (s.startsWith(word)) {
          List<String> subList = dfs(s.substring(word.length()), wordDict, map);
          for (String sub : subList) {
            result.add(word + (sub.length() == 0 ? "" : " ") + sub);
          }
        }
      }
      map.put(s, result);
      return result;
    }
  }
}
