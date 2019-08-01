package com.fishercoder.solutions;

/**
 * 616. Add Bold Tag in String
 *
 * Given a string s and a list of strings dict,
 * you need to add a closed pair of bold tag <b> and </b>
 * to wrap the substrings in s that exist in dict.
 * If two such substrings overlap, you need to wrap them together by only one pair of closed bold tag.
 * Also, if two substrings wrapped by bold tags are consecutive, you need to combine them.

 Example 1:
 Input:
 s = "abcxyz123"
 dict = ["abc","123"]
 Output:
 "<b>abc</b>xyz<b>123</b>"

 Example 2:
 Input:
 s = "aaabbcc"
 dict = ["aaa","aab","bc"]
 Output:
 "<b>aaabbc</b>c"

 Note:
 The given dict won't contain duplicates, and its length won't exceed 100.
 All the strings in input have length in range [1, 1000].
 */
public class _616 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/92112/java-solution-boolean-array
         */
        public String addBoldTag(String s, String[] dict) {
            boolean[] shouldBold = new boolean[s.length()];
            for (int i = 0, end = 0; i < s.length(); i++) {
                for (String word : dict) {
                    if (s.startsWith(word, i)) {
                        end = Math.max(end, i + word.length());
                    }
                }
                shouldBold[i] = end > i;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (!shouldBold[i]) {
                    stringBuilder.append(s.charAt(i));
                    continue;
                }
                int j = i;
                while (j < s.length() && shouldBold[j]) {
                    j++;
                }
                stringBuilder.append("<b>" + s.substring(i, j) + "</b>");
                i = j - 1;
            }
            return stringBuilder.toString();
        }
    }

}
