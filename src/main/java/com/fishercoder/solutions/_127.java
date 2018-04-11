package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 127. Word Ladder
 *
 *  Given two words (beginWord and endWord), and a dictionary's word list,
 *  find the length of shortest transformation sequence from beginWord to endWord, such that:
 *  Only one letter can be changed at a time.
 *  Each transformed word must exist in the word list. Note that beginWord is not a transformed word.

 For example,

 Given:
 beginWord = "hit"
 endWord = "cog"
 wordList = ["hot","dot","dog","lot","log","cog"]

 As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog", return its length 5.

 Note:

 Return 0 if there is no such transformation sequence.
 All words have the same length.
 All words contain only lowercase alphabetic characters.
 You may assume no duplicates in the word list.
 You may assume beginWord and endWord are non-empty and are not the same.
 */

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
