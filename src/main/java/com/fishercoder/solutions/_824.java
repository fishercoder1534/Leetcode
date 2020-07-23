package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _824 {

    public static class Solution1 {
        public String toGoatLatin(String S) {
            StringBuilder sb = new StringBuilder();
            Set<Character> vowels =
                    new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
            String[] words = S.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (vowels.contains(words[i].charAt(0))) {
                    String newWord = words[i] + "ma";
                    int j = i + 1;
                    while (j-- > 0) {
                        newWord += 'a';
                    }
                    sb.append(newWord);
                    sb.append(" ");
                } else {
                    StringBuilder subSb = new StringBuilder(words[i].substring(1));
                    subSb.append(words[i].charAt(0));
                    subSb.append("ma");
                    int j = i + 1;
                    while (j-- > 0) {
                        subSb.append("a");
                    }
                    sb.append(subSb.toString());
                    sb.append(" ");
                }
            }
            return sb.substring(0, sb.length() - 1);
        }
    }
}
