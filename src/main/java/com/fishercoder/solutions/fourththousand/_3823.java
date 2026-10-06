package com.fishercoder.solutions.fourththousand;

import java.util.ArrayList;
import java.util.List;

public class _3823 {
    public static class Solution1 {
        public String reverseByType(String s) {
            List<Character> letters = new ArrayList<>();
            List<Character> specialChars = new ArrayList<>();
            boolean[] isLetter = new boolean[s.length()];
            for (int i = 0; i < s.length(); i++) {
                if (Character.isAlphabetic(s.charAt(i))) {
                    isLetter[i] = true;
                    letters.add(s.charAt(i));
                } else {
                    specialChars.add(s.charAt(i));
                }
            }
            StringBuilder sb = new StringBuilder();
            int i = letters.size() - 1;
            int j = specialChars.size() - 1;
            for (int k = 0; k < s.length(); k++) {
                if (isLetter[k]) {
                    sb.append(letters.get(i--));
                } else {
                    sb.append(specialChars.get(j--));
                }
            }
            return sb.toString();
        }
    }
}
