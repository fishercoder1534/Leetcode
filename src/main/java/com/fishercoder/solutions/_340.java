package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _340 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/41671/15-lines-java-solution-using-slide-window
         */
        public int lengthOfLongestSubstringKDistinct(String s, int k) {
            int[] count = new int[256];
            int left = 0;
            int result = 0;
            int num = 0;
            for (int right = 0; right < s.length(); right++) {
                if (count[s.charAt(right)]++ == 0) {
                    num++;
                }
                if (num > k) {
                    while (--count[s.charAt(left++)] > 0) {
                    }
                    num--;
                }
                result = Math.max(result, right - left + 1);
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * This is a more generic solution for any characters, not limited to ASCII characters.
         */
        public int lengthOfLongestSubstringKDistinct(String s, int k) {
            Map<Character, Integer> map = new HashMap<>();
            int longest = 0;
            int left = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                map.put(c, map.getOrDefault(c, 0) + 1);
                while (map.size() > k) {
                    char leftChar = s.charAt(left);
                    if (map.containsKey(leftChar)) {
                        map.put(leftChar, map.get(leftChar) - 1);
                        if (map.get(leftChar) == 0) {
                            map.remove(leftChar);
                        }
                    }
                    left++;
                }
                longest = Math.max(longest, i - left + 1);
            }
            return longest;
        }
    }

    public static class Solution3 {
        /**
         * My original solution on 10/20/2021, a very generic sliding window template.
         */
        public int lengthOfLongestSubstringKDistinct(String s, int k) {
            int left = 0;
            int right = 0;
            int ans = 0;
            int[] count = new int[256];
            int distinctCount = 0;
            while (right < s.length()) {
                if (count[s.charAt(right)] == 0) {
                    distinctCount++;
                }
                count[s.charAt(right)]++;
                right++;
                if (distinctCount <= k) {
                    ans = Math.max(ans, right - left);
                }
                while (distinctCount > k) {
                    count[s.charAt(left)]--;
                    if (count[s.charAt(left)] == 0) {
                        distinctCount--;
                    }
                    left++;
                }
            }
            return ans;
        }
    }

}
