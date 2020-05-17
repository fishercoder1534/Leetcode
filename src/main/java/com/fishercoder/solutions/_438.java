package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _438 {

    public static class Solution1 {
        /**
         * Sliding Window
         */
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> result = new ArrayList();
            int[] hash = new int[26];
            for (char c : p.toCharArray()) {
                hash[c - 'a']++;
            }
            int start = 0;
            int end = 0;
            int count = p.length();
            while (end < s.length()) {
                if (hash[s.charAt(end) - 'a'] > 0) {
                    count--;
                }
                hash[s.charAt(end) - 'a']--;
                end++;

                if (count == 0) {
                    result.add(start);
                }

                if ((end - start) == p.length()) {
                    if (hash[s.charAt(start) - 'a'] >= 0) {
                        count++;
                    }
                    hash[s.charAt(start) - 'a']++;
                    start++;
                }
            }
            return result;
        }
    }
}
