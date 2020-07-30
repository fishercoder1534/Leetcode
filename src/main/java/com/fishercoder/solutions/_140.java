package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
