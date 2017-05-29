package com.fishercoder.solutions;

/**Given a list of words and two words word1 and word2, return the shortest distance between these two words in the list.

 For example,
 Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

 Given word1 = “coding”, word2 = “practice”, return 3.
 Given word1 = "makes", word2 = "coding", return 1.

 Note:
 You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.*/
public class ShortestWordDistance {

    public int shortestDistance(String[] words, String word1, String word2) {
        
        int p = -1, q = -1, min = Integer.MAX_VALUE;
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1)) p = i;
            if(words[i].equals(word2)) q = i;
            if(p != -1 && q != -1) min = Math.min(min, Math.abs(p-q));
        }
        return min;
    
    }

}
