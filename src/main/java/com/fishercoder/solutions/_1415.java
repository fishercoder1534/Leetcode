package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 1415. The k-th Lexicographical String of All Happy Strings of Length n
 *
 * A happy string is a string that:
 * consists only of letters of the set ['a', 'b', 'c'].
 * s[i] != s[i + 1] for all values of i from 1 to s.length - 1 (string is 1-indexed).
 *
 * For example, strings "abc", "ac", "b" and "abcbabcbcb" are all happy strings and strings "aa", "baa" and "ababbc" are not happy strings.
 * Given two integers n and k, consider a list of all happy strings of length n sorted in lexicographical order.
 * Return the kth string of this list or return an empty string if there are less than k happy strings of length n.
 *
 * Example 1:
 * Input: n = 1, k = 3
 * Output: "c"
 * Explanation: The list ["a", "b", "c"] contains all happy strings of length 1. The third string is "c".
 *
 * Example 2:
 * Input: n = 1, k = 4
 * Output: ""
 * Explanation: There are only 3 happy strings of length 1.
 *
 * Example 3:
 * Input: n = 3, k = 9
 * Output: "cab"
 * Explanation: There are 12 different happy string of length 3 ["aba", "abc", "aca", "acb", "bab", "bac", "bca", "bcb", "cab", "cac", "cba", "cbc"]. You will find the 9th string = "cab"
 *
 * Example 4:
 * Input: n = 2, k = 7
 * Output: ""
 *
 * Example 5:
 * Input: n = 10, k = 100
 * Output: "abacbabacb"
 *
 * Constraints:
 * 1 <= n <= 10
 * 1 <= k <= 100
 * */
public class _1415 {
    public static class Solution1 {
        public String getHappyString(int n, int k) {
            char[] chars = new char[]{'a', 'b', 'c'};
            List<String> happyStrings = new ArrayList<>();
            happyStrings.add("");
            happyStrings = findAllHappyStrings(chars, n, happyStrings);
            return happyStrings.size() < k ? "" : happyStrings.get(k - 1);
        }

        private List<String> findAllHappyStrings(char[] chars, int n, List<String> happyStrings) {
            if (happyStrings.get(0).length() == n) {
                return happyStrings;
            }
            List<String> newHappyStrings = new ArrayList<>();
            for (String str : happyStrings) {
                for (char c : chars) {
                    if (str.equals("") || str.charAt(str.length() - 1) != c) {
                        StringBuilder newSb = new StringBuilder(str);
                        newSb.append(c);
                        newHappyStrings.add(newSb.toString());
                    }
                }
            }
            happyStrings = newHappyStrings;
            return findAllHappyStrings(chars, n, happyStrings);
        }
    }
}
