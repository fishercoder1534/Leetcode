package com.fishercoder.solutions;

/**
 * 1047. Remove All Adjacent Duplicates In String
 *
 * Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.
 *
 * We repeatedly make duplicate removals on S until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.
 *
 *
 *
 * Example 1:
 *
 * Input: "abbaca"
 * Output: "ca"
 * Explanation:
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.
 * The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 *
 *
 * Note:
 *
 * 1 <= S.length <= 20000
 * S consists only of English lowercase letters.*/
public class _1047 {
    public static class Solution1 {
        public String removeDuplicates(String S) {
            StringBuilder sb = new StringBuilder(S);
            for (int i = 0; i < S.length() - 1; i++) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    return removeDuplicates(S.substring(0, i) + S.substring(i + 2));
                }
            }
            return sb.toString();
        }
    }
}
