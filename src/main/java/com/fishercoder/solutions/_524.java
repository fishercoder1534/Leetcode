package com.fishercoder.solutions;

import java.util.Collections;
import java.util.List;

public class _524 {

    public static class Solution1 {
        public String findLongestWord(String s, List<String> d) {
            Collections.sort(d, (a, b) -> a.length() == b.length() ? a.compareTo(b) : b.length() - a.length());
            for (String dictWord : d) {
                int i = 0;
                for (char c : s.toCharArray()) {
                    if (i < dictWord.length() && dictWord.charAt(i) == c) {
                        i++;
                    }
                }
                if (i == dictWord.length()) {
                    return dictWord;
                }
            }
            return "";
        }
    }

}
