package com.fishercoder.solutions;

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
