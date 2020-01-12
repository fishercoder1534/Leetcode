package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1119. Remove Vowels from a String
 *
 * Given a string S, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.
 *
 * Example 1:
 * Input: "leetcodeisacommunityforcoders"
 * Output: "ltcdscmmntyfrcdrs"
 *
 * Example 2:
 * Input: "aeiou"
 * Output: ""
 *
 * Note:
 * S consists of lowercase English letters only.
 * 1 <= S.length <= 1000
 * */
public class _1119 {
    public static class Solution1 {
        public String removeVowels(String S) {
            Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            StringBuilder stringBuilder = new StringBuilder();
            for (char c : S.toCharArray()) {
                if (!vowels.contains(c)) {
                    stringBuilder.append(c);
                }
            }
            return stringBuilder.toString();
        }
    }

    public static class Solution2 {
        public String removeVowels(String S) {
            return S.replaceAll("[aeiou]", "");
        }
    }
}
