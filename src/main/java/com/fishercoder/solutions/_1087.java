package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1087. Brace Expansion
 *
 * A string S represents a list of words.
 * Each letter in the word has 1 or more options.  If there is one option, the letter is represented as is.
 * If there is more than one option, then curly braces delimit the options.
 * For example, "{a,b,c}" represents options ["a", "b", "c"].
 * For example, "{a,b,c}d{e,f}" represents the list ["ade", "adf", "bde", "bdf", "cde", "cdf"].
 *
 * Return all words that can be formed in this manner, in lexicographical order.
 *
 * Example 1:
 * Input: "{a,b}c{d,e}f"
 * Output: ["acdf","acef","bcdf","bcef"]
 *
 * Example 2:
 * Input: "abcd"
 * Output: ["abcd"]
 *
 * Note:
 * 1 <= S.length <= 50
 * There are no nested curly brackets.
 * All characters inside a pair of consecutive opening and ending curly brackets are different.
 * */
public class _1087 {
    public static class Solution1 {
        public String[] expand(String S) {
            List<char[]> letters = parse(S);
            List<String> result = backtracking(letters, 0, new StringBuilder(), new ArrayList<>());
            String[] r = result.stream().toArray(String[]::new);
            Arrays.sort(r);
            return r;
        }

        private List<String> backtracking(List<char[]> letters, int start, StringBuilder sb, List<String> result) {
            if (start >= letters.size()) {
                result.add(sb.toString());
                return result;
            }
            char[] chars = letters.get(start);
            for (int i = 0; i < chars.length; i++) {
                sb.append(chars[i]);
                backtracking(letters, start + 1, sb, result);
                sb.setLength(sb.length() - 1);
            }
            return result;
        }

        private List<char[]> parse(String s) {
            List<char[]> result = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '{') {
                    int start = ++i;
                    while (i < s.length() && s.charAt(i) != '}') {
                        i++;
                    }
                    String[] strings = s.substring(start, i).split(",");
                    char[] chars = new char[strings.length];
                    for (int j = 0; j < strings.length; j++) {
                        chars[j] = strings[j].charAt(0);
                    }
                    result.add(chars);
                } else {
                    char[] chars = new char[1];
                    chars[0] = s.charAt(i);
                    result.add(chars);
                }
            }
            return result;
        }
    }
}
