package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * 140. Word Break II
 *
 * Given a string s and a dictionary of words dict, add spaces in s to construct a sentence where each word is a valid dictionary word.

 Return all such possible sentences.

 For example, given
 s = "catsanddog",
 dict = ["cat", "cats", "and", "sand", "dog"].

 A solution is ["cats and dog", "cat sand dog"].

 */
public class _140 {
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