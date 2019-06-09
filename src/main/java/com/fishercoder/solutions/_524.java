package com.fishercoder.solutions;

import java.util.Collections;
import java.util.List;

/**
 * 524. Longest Word in Dictionary through Deleting
 *
 * Given a string and a string dictionary, find the longest string in the dictionary that
 * can be formed by deleting some characters of the given string.
 * If there are more than one possible results,
 * return the longest word with the smallest lexicographical order.
 * If there is no possible result, return the empty string.

 Example 1:
 Input:
 s = "abpcplea", d = ["ale","apple","monkey","plea"]

 Output:
 "apple"
 Example 2:
 Input:
 s = "abpcplea", d = ["a","b","c"]

 Output:
 "a"

 Note:
 All the strings in the input will only contain lower-case letters.
 The size of the dictionary won't exceed 1,000.
 The length of all the strings in the input won't exceed 1,000.
 */
public class _524 {

    public static class Solution1 {
        public String findLongestWord(String s, List<String> d) {
            Collections.sort(d, (a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
            for (String dictWord : d) {
                int i = 0;
                for (char c : s.toCharArray()) {
                    if (i < dictWord.length() && dictWord.charAt(i) == c) {
                        i++;
                    }
                }
                if (i == dictWord.length()) {
                    return dictWord;
                }
            }
            return "";
        }
    }

}
