package com.fishercoder.solutions;

import java.util.Arrays;

/**
 * 1347. Minimum Number of Steps to Make Two Strings Anagram
 *
 * Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.
 * Return the minimum number of steps to make t an anagram of s.
 * An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
 *
 * Example 1:
 * Input: s = "bab", t = "aba"
 * Output: 1
 * Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
 *
 * Example 2:
 * Input: s = "leetcode", t = "practice"
 * Output: 5
 * Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
 *
 * Example 3:
 * Input: s = "anagram", t = "mangaar"
 * Output: 0
 * Explanation: "anagram" and "mangaar" are anagrams.
 *
 * Example 4:
 * Input: s = "xxyyzz", t = "xxyyzz"
 * Output: 0
 *
 * Example 5:
 * Input: s = "friend", t = "family"
 * Output: 4
 *
 * Constraints:
 * 1 <= s.length <= 50000
 * s.length == t.length
 * s and t contain lower-case English letters only.
 * */
public class _1347 {
    public static class Solution1 {
        public int minSteps(String s, String t) {
            int[] counts = new int[26];
            for (char c : s.toCharArray()) {
                counts[c - 'a']++;
            }
            for (char c : t.toCharArray()) {
                if (counts[c - 'a'] > 0) {
                    counts[c - 'a']--;
                }
            }
            return Arrays.stream(counts).sum();
        }
    }
}
