package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _2062 {
    public static class Solution1 {
        public int countVowelSubstrings(String word) {
            int count = 0;
            Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
            Set<Character> window = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                window.clear();
                if (vowels.contains(word.charAt(i))) {
                    window.add(word.charAt(i));
                    for (int j = i + 1; j < word.length(); j++) {
                        if (!vowels.contains(word.charAt(j))) {
                            break;
                        } else {
                            window.add(word.charAt(j));
                            if (window.size() == 5) {
                                count++;
                            }
                        }
                    }
                }
            }
            return count;
        }
    }
}
