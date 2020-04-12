package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 1408. String Matching in an Array
 *
 * Given an array of string words. Return all strings in words which is substring of another word in any order.
 * String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].
 *
 * Example 1:
 * Input: words = ["mass","as","hero","superhero"]
 * Output: ["as","hero"]
 * Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
 * ["hero","as"] is also a valid answer.
 *
 * Example 2:
 * Input: words = ["leetcode","et","code"]
 * Output: ["et","code"]
 * Explanation: "et", "code" are substring of "leetcode".
 *
 * Example 3:
 * Input: words = ["blue","green","bu"]
 * Output: []
 *
 * Constraints:
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 30
 * words[i] contains only lowercase English letters.
 * It's guaranteed that words[i] will be unique.
 * */
public class _1408 {
    public static class Solution1 {
        public List<String> stringMatching(String[] words) {
            Set<String> set = new HashSet<>();
            for (String word : words) {
                for (int i = 0; i < words.length; i++) {
                    if (!word.equals(words[i]) && word.length() < words[i].length()) {
                        if (words[i].indexOf(word) != -1) {
                            set.add(word);
                        }
                    }
                }
            }
            List<String> result = new ArrayList<>();
            for (String s : set) {
                result.add(s);
            }
            return result;
        }
    }
}
