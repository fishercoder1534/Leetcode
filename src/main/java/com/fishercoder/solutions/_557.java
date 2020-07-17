package com.fishercoder.solutions;

public class _557 {

    public static class Solution1 {
        public String reverseWords(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder sbUtils = new StringBuilder();
            for (String word : s.split(" ")) {
                sbUtils.setLength(0);
                sbUtils.append(word);
                stringBuilder.append(sbUtils.reverse().toString());
                stringBuilder.append(" ");
            }
            stringBuilder.setLength(stringBuilder.length() - 1);
            return stringBuilder.toString();
        }
    }
}
