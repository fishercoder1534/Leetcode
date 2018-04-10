package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * 126. Word Ladder II

 Given two words (beginWord and endWord), and a dictionary's word list,
 find all shortest transformation sequence(s) from beginWord to endWord, such that:

 Only one letter can be changed at a time
 Each transformed word must exist in the word list. Note that beginWord is not a transformed word.

 For example,
 Given:
 beginWord = "hit"
 endWord = "cog"
 wordList = ["hot","dot","dog","lot","log","cog"]

 Return
 [
 ["hit","hot","dot","dog","cog"],
 ["hit","hot","lot","log","cog"]
 ]

 Note:
 Return an empty list if there is no such transformation sequence.
 All words have the same length.
 All words contain only lowercase alphabetic characters.
 You may assume no duplicates in the word list.
 You may assume beginWord and endWord are non-empty and are not the same.
 */

public class _126 {

    public static class Solution1 {
        /** Reference: https://discuss.leetcode.com/topic/2857/share-two-similar-java-solution-that-accpted-by-oj */

        Map<String, List<String>> map;
        List<List<String>> results;

        public List<List<String>> findLadders(String start, String end, List<String> dict) {
            results = new ArrayList<>();
            if (dict.size() == 0) {
                return results;
            }

            int min = Integer.MAX_VALUE;

            Queue<String> queue = new ArrayDeque<>();
            queue.add(start);

            map = new HashMap<>();

            Map<String, Integer> ladder = new HashMap<>();
            for (String string : dict) {
                ladder.put(string, Integer.MAX_VALUE);
            }
            ladder.put(start, 0);

            dict.add(end);
            //BFS: Dijisktra search
            while (!queue.isEmpty()) {

                String word = queue.poll();

                int step = ladder.get(word)
                    + 1;//'step' indicates how many steps are needed to travel to one word.

                if (step > min) {
                    break;
                }

                for (int i = 0; i < word.length(); i++) {
                    StringBuilder builder = new StringBuilder(word);
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        builder.setCharAt(i, ch);
                        String newWord = builder.toString();
                        if (ladder.containsKey(newWord)) {

                            if (step > ladder.get(newWord)) {
                                //Check if it is the shortest path to one word.
                                continue;
                            } else if (step < ladder.get(newWord)) {
                                queue.add(newWord);
                                ladder.put(newWord, step);
                            } else {
                                // It is a KEY line. If one word already appeared in one ladder,
                                // Do not insert the same word inside the queue twice. Otherwise it gets TLE.
                            }
                            if (map.containsKey(newWord)) {
                                //Build adjacent Graph
                                map.get(newWord).add(word);
                            } else {
                                List<String> list = new LinkedList();
                                list.add(word);
                                map.put(newWord, list);
                                //It is possible to write three lines in one:
                                //map.put(new_word,new LinkedList<String>(Arrays.asList(new String[]{word})));
                                //Which one is better?
                            }

                            if (newWord.equals(end)) {
                                min = step;
                            }
                        }
                        //End if dict contains new_word
                    }
                    //End:Iteration from 'a' to 'z'
                }
                //End:Iteration from the first to the last
            }
            //End While

            //BackTracking
            LinkedList<String> result = new LinkedList<>();
            backTrace(end, start, result);

            return results;
        }

        private void backTrace(String word, String start, List<String> list) {
            if (word.equals(start)) {
                list.add(0, start);
                results.add(new ArrayList<>(list));
                list.remove(0);
                return;
            }
            list.add(0, word);
            if (map.get(word) != null) {
                for (String s : map.get(word)) {
                    backTrace(s, start, list);
                }
            }
            list.remove(0);
        }
    }
}
