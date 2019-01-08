package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**336. Palindrome Pairs
 *
 * Given a list of unique words, find all pairs of distinct indices (i, j) in the given list, so that the concatenation of the two words, i.e. words[i] + words[j] is a palindrome.

 Example 1:
 Given words = ["bat", "tab", "cat"]
 Return [[0, 1], [1, 0]]
 The palindromes are ["battab", "tabbat"]
 Example 2:
 Given words = ["abcd", "dcba", "lls", "s", "sssll"]
 Return [[0, 1], [1, 0], [3, 2], [2, 4]]
 The palindromes are ["dcbaabcd", "abcddcba", "slls", "llssssll"]
 */
public class _336 {

    public static class Solution1 {
        public List<List<Integer>> palindromePairs(String[] words) {
            List<List<Integer>> pairs = new ArrayList();
            Map<String, Integer> map = new HashMap();
            for (int i = 0; i < words.length; i++) {
                map.put(words[i], i);
            }

            for (int i = 0; i < words.length; i++) {
                int l = 0;
                int r = 0;
                while (l <= r) {
                    String s = words[i].substring(l, r);
                    Integer j = map.get(new StringBuilder(s).reverse().toString());
                    if (j != null && j != i && isPalindrome(
                        words[i].substring(l == 0 ? r : 0, l == 0 ? words[i].length() : l))) {
                        pairs.add(
                            Arrays.asList(l == 0 ? new Integer[] {i, j} : new Integer[] {j, i}));
                    }
                    if (r < words[i].length()) {
                        r++;
                    } else {
                        l++;
                    }
                }
            }
            return pairs;
        }

        private boolean isPalindrome(String s) {
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
