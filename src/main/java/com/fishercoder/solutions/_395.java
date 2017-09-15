package com.fishercoder.solutions;

/**
 * 395. Longest Substring with At Least K Repeating Characters
 *
 *  Find the length of the longest substring T of a given string
 *  (consists of lowercase letters only)
 *  such that every character in T appears no less than k times.

 Example 1:
 Input:
 s = "aaabb", k = 3

 Output:
 3

 The longest substring is "aaa", as 'a' is repeated 3 times.


 Example 2:
 Input:
 s = "ababbc", k = 2

 Output:
 5

 The longest substring is "ababb", as 'a' is repeated 2 times and 'b' is repeated 3 times.
 */

public class _395 {
    public static class Solution1 {
        /**Reference: https://discuss.leetcode.com/topic/57372/java-divide-and-conquer-recursion-solution*/
        public int longestSubstring(String s, int k) {
            return findLongestSubstring(s.toCharArray(), 0, s.length(), k);
        }

        int findLongestSubstring(char[] chars, int start, int end, int k) {
            if (end - start < k) {
                return 0;
            }
            int[] count = new int[26];
            for (int i = start; i < end; i++) {
                int index = chars[i] - 'a';
                count[index]++;
            }

            for (int i = 0; i < 26; i++) {
                if (count[i] < k && count[i] > 0) {
                    for (int j = start; j < end; j++) {
                        if (chars[j] == i + 'a') {
                            int left = findLongestSubstring(chars, start, j, k);
                            int right = findLongestSubstring(chars, j + 1, end, k);
                            return Math.max(left, right);
                        }
                    }
                }
            }
            return end - start;
        }
    }
}
