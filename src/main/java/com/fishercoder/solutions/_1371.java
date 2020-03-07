package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 1371. Find the Longest Substring Containing Vowels in Even Counts
 *
 * Given the string s, return the size of the longest substring containing each vowel an even number of times. That is, 'a', 'e', 'i', 'o', and 'u' must appear an even number of times.
 *
 * Example 1:
 * Input: s = "eleetminicoworoep"
 * Output: 13
 * Explanation: The longest substring is "leetminicowor" which contains two each of the vowels: e, i and o and zero of the vowels: a and u.
 *
 * Example 2:
 * Input: s = "leetcodeisgreat"
 * Output: 5
 * Explanation: The longest substring is "leetc" which contains two e's.
 *
 * Example 3:
 * Input: s = "bcbcbc"
 * Output: 6
 * Explanation: In this case, the given string "bcbcbc" is the longest because all vowels: a, e, i, o and u appear zero times.
 *
 * Constraints:
 * 1 <= s.length <= 5 x 10^5
 * s contains only lowercase English letters.
 * */
public class _1371 {
    public static class Solution1 {
        public int findTheLongestSubstring(String s) {
            int max = 0;
            for (int i = 0; i < s.length(); i++) {
                Map<Character, Integer> map = setupMap();
                if (s.length() - i < max) {
                    return max;
                }
                for (int j = i; j < s.length(); j++) {
                    Character b = s.charAt(j);
                    if (map.containsKey(b)) {
                        map.put(b, map.get(b) + 1);
                    }
                    if (allEven(map)) {
                        max = Math.max(max, j - i + 1);
                    }
                }
            }
            return max;
        }

        private Map<Character, Integer> setupMap() {
            Map<Character, Integer> map = new HashMap<>();
            map.put('a', 0);
            map.put('e', 0);
            map.put('i', 0);
            map.put('o', 0);
            map.put('u', 0);
            return map;
        }

        private boolean allEven(Map<Character, Integer> map) {
            for (char c : map.keySet()) {
                if (map.get(c) % 2 != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
