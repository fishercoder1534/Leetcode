package com.fishercoder.solutions;

/**
 * 521. Longest Uncommon Subsequence I
 *
 * Given a group of two strings, you need to find the longest uncommon subsequence of this group of two strings.
 * The longest uncommon subsequence is defined as the longest subsequence of one of these strings and this subsequence should not be any subsequence of the other strings.
 * A subsequence is a sequence that can be derived from one sequence by deleting some characters without changing the order of the remaining elements.
 * Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.
 * The input will be two strings, and the output needs to be the length of the longest uncommon subsequence.
 * If the longest uncommon subsequence doesn't exist, return -1.

 Example 1:
 Input: "aba", "cdc"
 Output: 3
 Explanation: The longest uncommon subsequence is "aba" (or "cdc"),
 because "aba" is a subsequence of "aba",
 but not a subsequence of any other strings in the group of two strings.

 Note:
 Both strings' lengths will not exceed 100.
 Only letters from a ~ z will appear in input strings.
 */
public class _521 {
    public static class Solution1 {
        /**
         * The gotcha point of this question is:
         * 1. if a and b are identical, then there will be no common subsequence, return -1
         * 2. else if a and b are of equal length, then any one of them will be a subsequence of the other string
         * 3. else if a and b are of different length, then the longer one is a required subsequence because the longer string cannot be a subsequence of the shorter one
         * Or in other words, when a.length() != b.length(), no subsequence of b will be equal to a, so return Math.max(a.length(), b.length())
         */
        public int findLUSlength(String a, String b) {
            if (a.equals(b)) {
                return -1;
            }
            return Math.max(a.length(), b.length());
        }
    }
}
