package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _159 {
    public static class Solution1 {
        public int lengthOfLongestSubstringTwoDistinct(String s) {
            if (s.length() < 1) {
                return 0;
            }
            Map<Character, Integer> index = new HashMap<>();
            int lo = 0;
            int hi = 0;
            int maxLength = 0;
            while (hi < s.length()) {
                if (index.size() <= 2) {
                    char c = s.charAt(hi);
                    index.put(c, hi);
                    hi++;
                }
                if (index.size() > 2) {
                    int leftMost = s.length();
                    for (int i : index.values()) {
                        leftMost = Math.min(leftMost, i);
                    }
                    char c = s.charAt(leftMost);
                    index.remove(c);
                    lo = leftMost + 1;
                }
                maxLength = Math.max(maxLength, hi - lo);
            }
            return maxLength;
        }
    }

    public static class Solution2 {
        /**
         * My completely original solution, classic sliding window problem:
         * use two pointers, one keeps moving towards the right to expand;
         * the other moves only when we are no longer meeting the requirement, i.e. shrinks.
         */
        public int lengthOfLongestSubstringTwoDistinct(String s) {
            int distinct = 0;
            int ans = 0;
            int left = 0;
            int right = 0;
            int[] counts = new int[256];
            while (right < s.length()) {
                char c1 = s.charAt(right);
                if (counts[c1] == 0) {
                    distinct++;
                }
                counts[c1]++;
                right++;
                if (distinct <= 2) {
                    ans = Math.max(ans, right - left);
                }
                while (distinct > 2) {
                    char c2 = s.charAt(left);
                    counts[c2]--;
                    if (counts[c2] == 0) {
                        distinct--;
                    }
                    left++;
                }
            }
            return ans;
        }
    }
}
