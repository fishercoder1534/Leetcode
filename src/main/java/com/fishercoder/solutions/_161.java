package com.fishercoder.solutions;

/**
 * 161. One Edit Distance
 *
 * Given two strings s and t, determine if they are both one edit distance apart.
 *
 * Note:
 * There are 3 possiblities to satisify one edit distance apart:
 * Insert a character into s to get t
 * Delete a character from s to get t
 * Replace a character of s to get t
 *
 * Example 1:
 * Input: s = "ab", t = "acb"
 * Output: true
 * Explanation: We can insert 'c' into s to get t.
 *
 * Example 2:
 * Input: s = "cab", t = "ad"
 * Output: false
 * Explanation: We cannot get t from s by only one step.
 *
 * Example 3:
 * Input: s = "1203", t = "1213"
 * Output: true
 * Explanation: We can replace '0' with '1' to get t.
 */
public class _161 {
    public static class Solution1 {
        public boolean isOneEditDistance(String s, String t) {
            char[] schar = s.toCharArray();
            char[] tchar = t.toCharArray();

            if (Math.abs(s.length() - t.length()) == 1) {
                char[] longer = (s.length() > t.length()) ? schar : tchar;
                char[] shorter = (longer == schar) ? tchar : schar;

                int diffCnt = 0;
                int i = 0;
                int j = 0;
                for (; i < shorter.length && j < longer.length; ) {
                    if (longer[j] != shorter[i]) {
                        diffCnt++;
                        j++;
                    } else {
                        i++;
                        j++;
                    }
                }
                return diffCnt == 1
                        || diffCnt
                        == 0;//it could be the last char of the longer is the different one, in that case, diffCnt remains to be zero
            } else if (s.length() == t.length()) {
                int diffCnt = 0;
                for (int i = 0; i < s.length(); i++) {
                    if (schar[i] != tchar[i]) {
                        diffCnt++;
                    }
                    if (diffCnt > 1) {
                        return false;
                    }
                }
                return diffCnt == 1;
            }
            return false;
        }
    }
}
