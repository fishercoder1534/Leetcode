package com.fishercoder.solutions;

/**
 * 245. Shortest Word Distance III
 *
 * This is a follow up of Shortest Word Distance. The only difference is now word1 could be the same as word2.
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.
 * word1 and word2 may be the same and they represent two individual words in the list.

 For example,
 Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

 Given word1 = “makes”, word2 = “coding”, return 1.
 Given word1 = "makes", word2 = "makes", return 3.

 Note:
 You may assume word1 and word2 are both in the list.
 */
public class _245 {

    public static class Solution1 {
        public int shortestWordDistance(String[] words, String word1, String word2) {
            int p1 = -1;
            int p2 = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(word1)) {
                    if (word1.equals(word2)) {
                        if (p1 != -1 && i - p1 < min) {
                            min = i - p1;
                        }
                        p1 = i;
                    } else {
                        p1 = i;
                        if (p2 != -1 && p1 - p2 < min) {
                            min = p1 - p2;
                        }
                    }
                } else if (words[i].equals(word2)) {
                    p2 = i;
                    if (p1 != -1 && p2 - p1 < min) {
                        min = p2 - p1;
                    }
                }
            }
            return min;
        }
    }
}
