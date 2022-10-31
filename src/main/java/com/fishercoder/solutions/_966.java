package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _966 {

    public static class Solution1 {
        public String[] spellchecker(String[] wordlist, String[] queries) {
            Map<String, String> caseMap = new HashMap<>();
            Set<String> set = new HashSet<>();

            // Case Part Mapping
            for (String word : wordlist) {
                if (!caseMap.containsKey(word.toLowerCase())) {
                    caseMap.put(word.toLowerCase(), word);
                }
                set.add(word);
            }

            // Vowel Part Mapping
            Map<String, String> vowelMap = new HashMap<>();
            for (String word : wordlist) {
                String genericVal = makeGenericVowel(word);
                if (!vowelMap.containsKey(genericVal)) {
                    vowelMap.put(genericVal, word);
                }
            }

            String[] ans = new String[queries.length];

            for (int i = 0; i < queries.length; i++) {
                if (set.contains(queries[i])) {
                    ans[i] = queries[i];
                } else if (caseMap.containsKey(queries[i].toLowerCase())) {
                    ans[i] = caseMap.get(queries[i].toLowerCase());
                } else if (vowelMap.containsKey(makeGenericVowel(queries[i]))) {
                    ans[i] = vowelMap.get(makeGenericVowel(queries[i]));
                } else {
                    ans[i] = "";
                }
            }
            return ans;
        }

        private String makeGenericVowel(String s) {
            String vowel = "aeiou";
            char[] ch = s.toLowerCase().toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (vowel.indexOf(ch[i]) != -1) {
                    ch[i] = '#';
                }
            }
            return String.valueOf(ch);
        }
    }
}
