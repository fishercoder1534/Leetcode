package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1297. Maximum Number of Occurrences of a Substring
 *
 * Given a string s, return the maximum number of ocurrences of any substring under the following rules:
 *
 * The number of unique characters in the substring must be less than or equal to maxLetters.
 * The substring size must be between minSize and maxSize inclusive.
 *
 * Example 1:
 * Input: s = "aababcaab", maxLetters = 2, minSize = 3, maxSize = 4
 * Output: 2
 * Explanation: Substring "aab" has 2 ocurrences in the original string.
 * It satisfies the conditions, 2 unique letters and size 3 (between minSize and maxSize).
 *
 * Example 2:
 * Input: s = "aaaa", maxLetters = 1, minSize = 3, maxSize = 3
 * Output: 2
 * Explanation: Substring "aaa" occur 2 times in the string. It can overlap.
 *
 * Example 3:
 * Input: s = "aabcabcab", maxLetters = 2, minSize = 2, maxSize = 3
 * Output: 3
 *
 * Example 4:
 * Input: s = "abcde", maxLetters = 2, minSize = 3, maxSize = 3
 * Output: 0
 *
 * Constraints:
 * 1 <= s.length <= 10^5
 * 1 <= maxLetters <= 26
 * 1 <= minSize <= maxSize <= min(26, s.length)
 * s only contains lowercase English letters.
 * */
public class _1297 {
    public static class Solution1 {
        public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
            int maxFreq = 0;
            for (int size = minSize; size <= maxSize; size++) {
                maxFreq = Math.max(maxFreq, getMaxFreqWithThisSize(s, maxLetters, size));
            }
            return maxFreq;
        }

        private int getMaxFreqWithThisSize(String str, int maxLetters, int size) {
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i <= str.length() - size; i++) {
                String substring = str.substring(i, i + size);
                Set<Character> set = new HashSet<>();
                for (int j = 0; j < substring.length(); j++) {
                    set.add(substring.charAt(j));
                    if (set.size() > maxLetters) {
                        break;
                    }
                }
                if (set.size() <= maxLetters) {
                    map.put(substring, map.getOrDefault(substring, 0) + 1);
                }
            }
            int max = 0;
            for (String key : map.keySet()) {
                max = Math.max(max, map.get(key));
            }
            return max;
        }
    }
}
