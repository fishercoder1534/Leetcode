package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _3 {

    public static class Solution1 {
        public int lengthOfLongestSubstring(String s) {
            int result = 0;
            Map<Character, Integer> map = new HashMap();
            for (int i = 0, j = i; j < s.length(); ) {
                if (!map.containsKey(s.charAt(j)) || (map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) == 0)) {
                    map.put(s.charAt(j), 1);
                    result = Math.max(j - i + 1, result);
                    j++;
                } else {
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    i++;
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /**
         * Sliding Window
         * O(n) time
         * O(min(m,n)) or O(k) space
         */
        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            Set<Character> set = new HashSet<>();
            int result = 0;
            int i = 0;
            int j = 0;
            while (i < n && j < n) {
                /**Try to extend the range i, j*/
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j++));
                    result = Math.max(result, j - i);
                } else {
                    set.remove(s.charAt(i++));
                }
            }
            return result;
        }
    }

    public static class Solution3 {
        /**
         * Sliding Window
         * O(n) time
         * O(n) space
         */
        public int lengthOfLongestSubstring(String s) {
            if (s.length() == 0) {
                return 0;
            }
            int max = 0;
            Map<Character, Integer> map = new HashMap<>();
            /**Try to extend the range (i, j)*/
            for (int i = 0, j = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    j = Math.max(j, map.get(s.charAt(i)) + 1);
                }
                map.put(s.charAt(i), i);
                max = Math.max(max, i + 1 - j);
            }
            return max;
        }
    }

    public static class Solution4 {
        /**
         * Sliding Window Optimized
         * O(n) time
         * O(n) space
         */
        public int lengthOfLongestSubstring(String s) {
            if (s.length() == 0) {
                return 0;
            }
            int max = 0;
            int[] index = new int[128];
            /**Try to extend the range (i, j)*/
            for (int i = 0, j = 0; j < s.length(); j++) {
                i = Math.max(index[s.charAt(j)], i);
                max = Math.max(max, j - i + 1);
                index[s.charAt(j)] = j + 1;
            }
            return max;
        }
    }

    public static class Solution5 {
        /**
         * Sliding Window, my completely original idea on 9/17/2021.
         * Basically, keep moving the left boundary towards the right and keep updating the result along the way.
         * O(n) time
         * O(n) space
         */
        public int lengthOfLongestSubstring(String s) {
            int startIndex = 0;
            int longest = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    Integer removedIndex = map.get(s.charAt(i));
                    if (removedIndex >= startIndex) {
                        startIndex = removedIndex + 1;
                    }
                }
                map.put(s.charAt(i), i);
                longest = Math.max(longest, i - startIndex + 1);
            }
            return longest;
        }
    }

    public static class Solution6 {
        /**
         * Sliding Window, my completely original idea on 10/20/2021. Although less efficient then Solution5, it follows a generic template without any manipulation.
         * Basically, keep moving the left boundary towards the right and keep updating the result along the way.
         * O(n) time
         * O(n) space
         */

        public int lengthOfLongestSubstring(String s) {
            int left = 0;
            int right = 0;
            int ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            while (right < s.length()) {
                map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
                right++;
                if (allUnique(map)) {
                    ans = Math.max(ans, right - left);
                }
                while (!allUnique(map)) {
                    map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                    if (map.get(s.charAt(left)) == 0) {
                        map.remove(s.charAt(left));
                    }
                    left++;
                }
            }
            return ans;
        }

        private boolean allUnique(Map<Character, Integer> map) {
            for (char key : map.keySet()) {
                if (map.get(key) > 1) {
                    return false;
                }
            }
            return true;
        }
    }
}
