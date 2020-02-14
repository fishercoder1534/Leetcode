package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * 1100. Find K-Length Substrings With No Repeated Characters
 *
 * Given a string S, return the number of substrings of length K with no repeated characters.
 *
 * Example 1:
 * Input: S = "havefunonleetcode", K = 5
 * Output: 6
 * Explanation:
 * There are 6 substrings they are : 'havef','avefu','vefun','efuno','etcod','tcode'.
 *
 * Example 2:
 * Input: S = "home", K = 5
 * Output: 0
 * Explanation:
 * Notice K can be larger than the length of S. In this case is not possible to find any substring.
 *
 * Note:
 * 1 <= S.length <= 10^4
 * All characters of S are lowercase English letters.
 * 1 <= K <= 10^4
 * */
public class _1100 {
    public static class Solution1 {
        public int numKLenSubstrNoRepeats(String S, int K) {
            int count = 0;
            Set<Character> set = new HashSet<>();
            for (int i = 0; i <= S.length() - K; i++) {
                String string = S.substring(i, i + K);
                boolean invalid = false;
                for (char c : string.toCharArray()) {
                    if (!set.add(c)) {
                        invalid = true;
                        break;
                    }
                }
                count += invalid ? 0 : 1;
                set.clear();
            }
            return count;
        }
    }
}
