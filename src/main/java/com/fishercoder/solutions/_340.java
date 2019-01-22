package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * 340. Longest Substring with At Most K Distinct Characters
 *
 * Given a string, find the length of the longest substring T that contains at most k distinct characters.

 For example, Given s = “eceba” and k = 2,

 T is "ece" which its length is 3.

 */
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
                    while (--count[s.charAt(left++)] > 0) {};
                    num--;
                }
                result = Math.max(result, right - left + 1);
            }
            return result;
        }
    }

    public static class Solution2 {
        /**This is a more generic solution for any characters, not limited to ASCII characters.*/
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

}
