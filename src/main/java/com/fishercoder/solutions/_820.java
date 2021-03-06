package com.fishercoder.solutions;

import java.util.Arrays;

public class _820 {
    public static class Solution1 {
        public int minimumLengthEncoding(String[] words) {
            Arrays.sort(words, (a, b) -> a.length() - b.length());
            boolean[] removed = new boolean[words.length];
            for (int j = words.length - 2; j >= 0; j--) {
                for (int i = j + 1; i < words.length; i++) {
                    if (!removed[i]) {
                        if (words[i].substring(words[i].length() - words[j].length()).equals(words[j])) {
                            removed[j] = true;
                            break;
                        }
                    }
                }
            }
            int len = 0;
            for (int i = 0; i < words.length; i++) {
                if (!removed[i]) {
                    len += words[i].length();
                    len++;
                }
            }
            return len;
        }
    }
}
