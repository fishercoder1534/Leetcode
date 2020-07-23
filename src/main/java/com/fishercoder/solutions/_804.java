package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _804 {
    public static class Solution1 {
        public int uniqueMorseRepresentations(String[] words) {
            String[] morseCodes =
                    new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                            ".--", "-..-", "-.--", "--.."};
            Set<String> concatenation = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                sb.setLength(0);
                for (char c : word.toCharArray()) {
                    sb.append(morseCodes[c - 'a']);
                }
                concatenation.add(sb.toString());
            }
            return concatenation.size();
        }
    }
}
