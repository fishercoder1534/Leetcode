package com.fishercoder.solutions.fourththousand;

import java.util.*;

public class _3481 {
    public static class Solution1 {
        public String applySubstitutions(List<List<String>> replacements, String text) {
            Map<String, String> rawMap = new HashMap<>();
            for (List<String> replacement : replacements) {
                rawMap.put(replacement.get(0), replacement.get(1));
            }
            Map<String, String> memo = new HashMap<>();
            return dfs(text, memo, rawMap);
        }

        private String dfs(String text, Map<String, String> memo, Map<String, String> rawMap) {
            //base case: we found it already, directly return
            if (memo.containsKey(text)) {
                return memo.get(text);
            }
            int i = text.indexOf('%');
            if (i == -1) {
                return text; // no more placeholders
            }
            int j = text.indexOf('%', i + 1); // find the closing % sign
            String key = text.substring(i + 1, j); // extract the key sign between the two % signs
            String rawValue = rawMap.getOrDefault(key, "");
            String resolvedReplacement = dfs(rawValue, memo, rawMap); // we use DFS to recursively resolve it
            String replacement = text.substring(0, i) + //this is the 1st part of the string which is already fully resolved
                    resolvedReplacement + //this is the middle part of the string that we just resolved in this recursion
                    dfs(text.substring(j + 1), memo, rawMap); //we'll use this dfs method to continue to resolve the 3rd part/remaining part of this tring
            memo.put(text, replacement);
            return replacement;
        }
    }
}
