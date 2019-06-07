package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 522. Longest Uncommon Subsequence II
 *
 * Given a list of strings, you need to find the longest uncommon subsequence among them.
 * The longest uncommon subsequence is defined as the longest subsequence of one of these strings and
 * this subsequence should not be any subsequence of the other strings.
 * A subsequence is a sequence that can be derived from one sequence by deleting some characters
 * without changing the order of the remaining elements.
 * Trivially, any string is a subsequence of itself and an empty string is a subsequence of any string.
 * The input will be a list of strings, and the output needs to be the length of the longest uncommon subsequence.
 * If the longest uncommon subsequence doesn't exist, return -1.

 Example 1:
 Input: "aba", "cdc", "eae"
 Output: 3
 Note:

 All the given strings' lengths will not exceed 10.
 The length of the given list will be in the range of [2, 50].
 */
public class _522 {

    public static class Solution1 {
        /**Idea: if there's such a LUS there in the list, it must be one of the strings in the given list,
        so we'll just go through the list and check if one string is NOT subsequence of any others, if so, return it, otherwise, return -1*/
        public int findLUSlength(String[] strs) {
            Arrays.sort(strs, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.length() - o1.length();
                }
            });

            for (int i = 0; i < strs.length; i++) {
                boolean found = true;
                for (int j = 0; j < strs.length; j++) {
                    if (i == j) {
                        continue;
                    } else if (isSubsequence(strs[i], strs[j])) {
                        found = false;
                        break;
                    }
                }
                if (found) {
                    return strs[i].length();
                }
            }
            return -1;
        }

        private boolean isSubsequence(String a, String b) {
            int i = 0;
            for (int j = 0; i < a.length() && j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    i++;
                }
            }
            return i == a.length();
        }
    }
}
