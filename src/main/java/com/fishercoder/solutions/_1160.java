package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1160. Find Words That Can Be Formed by Characters
 *
 * You are given an array of strings words and a string chars.
 * A string is good if it can be formed by characters from chars (each character can only be used once).
 * Return the sum of lengths of all good strings in words.
 *
 * Example 1:
 *
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
 * Explanation:
 * The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
 *
 * Example 2:
 *
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * Output: 10
 * Explanation:
 * The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 *
 * Note:
 *
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, chars.length <= 100
 * All strings contain lowercase English letters only.
 * */
public class _1160 {
    public static class Solution1 {
        public int countCharacters(String[] words, String chars) {
            int length = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (char c : chars.toCharArray()) {
                int count = map.getOrDefault(c, 0);
                map.put(c, count + 1);

            }
            for (String word : words) {
                if (canForm(word, map)) {
                    length += word.length();
                }
            }
            return length;
        }

        private boolean canForm(String word, final Map<Character, Integer> map) {
            Map<Character, Integer> tmp = new HashMap<>(map);
            for (Character c : word.toCharArray()) {
                if (tmp.containsKey(c) && tmp.get(c) > 0) {
                    int count = tmp.get(c);
                    tmp.put(c, count - 1);
                } else {
                    return false;
                }
            }
            return true;
        }

    }
}
