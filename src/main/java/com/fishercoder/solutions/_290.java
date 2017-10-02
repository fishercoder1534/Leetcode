package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 290. Word Pattern
 *
 * Given a pattern and a string str, find if str follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.

 Notes:
 You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 */

public class _290 {

    public static class Solution1 {
        public boolean wordPattern(String pattern, String str) {
            String[] words = str.split(" ");
            char[] patterns = pattern.toCharArray();
            Map<Character, String> map = new HashMap();
            if (patterns.length != words.length) {
                return false;
            }
            for (int i = 0; i < patterns.length; i++) {
                if (map.containsKey(patterns[i])) {
                    if (!map.get(patterns[i]).equals(words[i])) {
                        return false;
                    }
                } else {
                    if (map.containsValue(words[i])) {
                        return false;//this is for this case: "abba", "dog dog dog dog"
                    }
                    map.put(patterns[i], words[i]);
                }
            }
            return true;
        }
    }

}