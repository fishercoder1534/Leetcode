package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _2273 {
    public static class Solution1 {
        public List<String> removeAnagrams(String[] words) {
            List<String> result = new ArrayList<>();
            result.add(words[0]);
            for (int i = 1; i < words.length; i++) {
                String sorted0 = sortWord(words[i - 1]);
                String sorted1 = sortWord(words[i]);
                if (!sorted0.equals(sorted1)) {
                    result.add(words[i]);
                }
            }
            return result;
        }

        private static String sortWord(String words) {
            char[] chars = words.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
    }
}
