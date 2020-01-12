package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 * 1086. High Five
 *
 * Given a list of scores of different students, return the average score of each student's top five scores in the order of each student's id.
 * Each entry items[i] has items[i][0] the student's id, and items[i][1] the student's score.
 * The average score is calculated using integer division.
 *
 * Example 1:
 * Input: [[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]
 * Output: [[1,87],[2,88]]
 * Explanation:
 * The average of the student with id = 1 is 87.
 * The average of the student with id = 2 is 88.6. But with integer division their average converts to 88.
 *
 * Note:
 * 1 <= items.length <= 1000
 * items[i].length == 2
 * The IDs of the students is between 1 to 1000
 * The score of the students is between 1 to 100
 * For each student, there are at least 5 scores
 * */
public class _1086 {
    public static class Solution1 {
        public int[][] highFive(int[][] items) {
            TreeMap<Integer, List<Integer>> map = new TreeMap<>();
            for (int[] studentToScore : items) {
                if (map.containsKey(studentToScore[0])) {
                    map.get(studentToScore[0]).add(studentToScore[1]);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(studentToScore[1]);
                    map.put(studentToScore[0], list);
                }
            }
            int[][] result = new int[map.size()][2];
            for (int id : map.keySet()) {
                List<Integer> scores = map.get(id);
                Collections.sort(scores);
                int sum = 0;
                for (int i = scores.size() - 1; i >= scores.size() - 5 && i >= 0; i--) {
                    sum += scores.get(i);
                }
                result[id - 1][0] = id;
                result[id - 1][1] = sum / 5;
            }
            return result;
        }
    }

    public static class Solution2 {
        public int[][] highFive(int[][] items) {
            TreeMap<Integer, PriorityQueue<Integer>> treeMap = new TreeMap<>();
            for (int[] studentToScores : items) {
                if (treeMap.containsKey(studentToScores[0])) {
                    PriorityQueue<Integer> maxHeap = treeMap.get(studentToScores[0]);
                    maxHeap.offer(studentToScores[1]);
                    if (maxHeap.size() > 5) {
                        maxHeap.poll();
                    }
                    treeMap.put(studentToScores[0], maxHeap);
                } else {
                    PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
                    maxHeap.offer(studentToScores[1]);
                    treeMap.put(studentToScores[0], maxHeap);
                }
            }
            int[][] result = new int[treeMap.size()][2];
            for (int id : treeMap.keySet()) {
                result[id - 1][0] = id;
                int sum = 0;
                PriorityQueue<Integer> maxHeap = treeMap.get(id);
                while (!maxHeap.isEmpty()) {
                    sum += maxHeap.poll();
                }
                result[id - 1][1] = sum / 5;
            }
            return result;
        }
    }
}
