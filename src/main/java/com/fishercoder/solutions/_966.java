package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 966. Vowel Spellchecker
 *
 * Given a wordlist, we want to implement a spellchecker that converts a query word into a correct word.
 *
 * For a given query word, the spell checker handles two categories of spelling mistakes:
 *
 * Capitalization: If the query matches a word in the wordlist (case-insensitive), then the query word is returned with
 * the same case as the case in the wordlist.
 * Example: wordlist = ["yellow"], query = "YellOw": correct = "yellow"
 * Example: wordlist = ["Yellow"], query = "yellow": correct = "Yellow"
 * Example: wordlist = ["yellow"], query = "yellow": correct = "yellow"
 *
 * Vowel Errors: If after replacing the vowels ('a', 'e', 'i', 'o', 'u') of the query word with any vowel individually,
 * it matches a word in the wordlist (case-insensitive), then the query word is returned with the same case as the
 * match in the wordlist.
 * Example: wordlist = ["YellOw"], query = "yollow": correct = "YellOw"
 * Example: wordlist = ["YellOw"], query = "yeellow": correct = "" (no match)
 * Example: wordlist = ["YellOw"], query = "yllw": correct = "" (no match)
 *
 * In addition, the spell checker operates under the following precedence rules:
 *
 * When the query exactly matches a word in the wordlist (case-sensitive), you should return the same word back.
 * When the query matches a word up to capitlization, you should return the first such match in the wordlist.
 * When the query matches a word up to vowel errors, you should return the first such match in the wordlist.
 * If the query has no matches in the wordlist, you should return the empty string.
 *
 * Given some queries, return a list of words answer, where answer[i] is the correct word for query = queries[i].
 *
 * Example 1:
 *
 * Input: wordlist = ["KiTe","kite","hare","Hare"], queries = ["kite","Kite","KiTe","Hare","HARE","Hear","hear","keti","keet","keto"]
 * Output: ["kite","KiTe","KiTe","Hare","hare","","","KiTe","","KiTe"]
 *
 * Note:
 *
 * 1 <= wordlist.length <= 5000
 * 1 <= queries.length <= 5000
 * 1 <= wordlist[i].length <= 7
 * 1 <= queries[i].length <= 7
 * All strings in wordlist and queries consist only of english letters.
 *
 * */

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
