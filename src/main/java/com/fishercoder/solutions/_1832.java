package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _1832 {
    public static class Solution1 {
        public boolean checkIfPangram(String sentence) {
            Set<Character> alphabet = new HashSet<>();
            for (char c : sentence.toCharArray()) {
                alphabet.add(c);
            }
            return alphabet.size() == 26;
        }
    }
}
