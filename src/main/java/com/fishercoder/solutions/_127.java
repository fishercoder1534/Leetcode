package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _127 {
    public static class Solution1 {

        public int ladderLength(String beginWord, String endWord, List<String> wordList) {
            Set<String> beginSet = new HashSet<>();
            Set<String> endSet = new HashSet<>();
            Set<String> visited = new HashSet<>();
            Set<String> dict = new HashSet<>(wordList);
            int len = 1;

            beginSet.add(beginWord);

            if (dict.contains(endWord)) {
                endSet.add(endWord);
            }

            while (!beginSet.isEmpty() && !endSet.isEmpty()) {
                Set<String> nextBeginSet = new HashSet<>();
                for (String word : beginSet) {
                    char[] chars = word.toCharArray();
                    for (int i = 0; i < chars.length; i++) {
                        for (char c = 'a'; c <= 'z'; c++) {
                            char old = chars[i];
                            chars[i] = c;
                            String newWord = new String(chars);
                            if (endSet.contains(newWord)) {
                                return len + 1;
                            }

                            if (!visited.contains(newWord) && dict.contains(newWord)) {
                                visited.add(newWord);
                                nextBeginSet.add(newWord);
                            }
                            chars[i] = old;
                        }
                    }
                }

                beginSet = nextBeginSet;
                len++;
            }
            return 0;
        }
    }
}
