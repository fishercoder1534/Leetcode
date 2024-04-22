package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _409 {
    public static class Solution1 {
        public int longestPalindrome(String s) {
            int[] counts = new int[56];
            for (char c : s.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    counts[c - 'A' + 33]++;
                } else {
                    counts[c - 'a']++;
                }
            }
            boolean hasOdd = false;
            int len = 0;
            for (int i = 0; i < 56; i++) {
                if (counts[i] % 2 != 0) {
                    hasOdd = true;
                    if (counts[i] > 1) {
                        len += counts[i] - 1;
                    }
                } else {
                    len += counts[i];
                }
            }
            return hasOdd ? len + 1 : len;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution on 10/14/2021.
         */
        public int longestPalindrome(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int ans = 0;
            boolean hasOdd = false;
            for (char key : map.keySet()) {
                if (map.getOrDefault(key, 0) % 2 == 0) {
                    ans += map.getOrDefault(key, 0);
                } else {
                    hasOdd = true;
                    if (map.containsKey(key)) {
                        ans += map.getOrDefault(key, 0) - 1;
                    }
                }
            }
            if (hasOdd) {
                ans++;
            }
            return ans;
        }
    }
}
