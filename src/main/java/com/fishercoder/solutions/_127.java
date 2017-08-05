package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 127. Word Ladder
 *
 *  Given two words (beginWord and endWord),
 *  and a dictionary's word list,
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

    /**reference: https://discuss.leetcode.com/topic/29303/two-end-bfs-in-java-31ms/16*/
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        Set<String> startSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        Set<String> visited = new HashSet<>();

        startSet.add(beginWord);
        if (dict.contains(endWord)) {
            endSet.add(endWord); // all transformed words must be in dict (including endWord)
        }

        for (int len = 2; !startSet.isEmpty(); len++) {
            Set<String> nq = new HashSet<>();
            for (String w : startSet) {
                for (int j = 0; j < w.length(); j++) {
                    char[] ch = w.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == w.charAt(j)) continue; // beginWord and endWord should not be the same
                        ch[j] = c;
                        String nb = String.valueOf(ch);
                        if (endSet.contains(nb)) {
                            return len; // meet from two ends
                        }
                        if (dict.contains(nb) && visited.add(nb)) {
                            nq.add(nb); // not meet yet, visited is safe to use
                        }
                    }
                }
            }

            startSet = (nq.size() < endSet.size()) ? nq : endSet; // switch to small one to traverse from other end
            endSet = (startSet == nq) ? endSet : nq;
        }
        return 0;
    }
}
