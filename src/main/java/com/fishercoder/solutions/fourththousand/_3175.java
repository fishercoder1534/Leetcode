package com.fishercoder.solutions.fourththousand;

import java.util.Deque;
import java.util.LinkedList;

public class _3175 {
    public static class Solution1 {
        public int findWinningPlayer(int[] skills, int k) {
            Deque<int[]> q = new LinkedList<>();
            int highestSkill = 0;
            for (int i = 0; i < skills.length; i++) {
                q.offer(new int[]{i, skills[i], 0});
                highestSkill = Math.max(highestSkill, skills[i]);
            }
            int count = 0;
            while (true) {
                int[] first = q.pollFirst();
                if (first[1] == highestSkill) {
                    //if the highest skill stands at the head of the queue, then it'll keep standing there
                    //so it's guaranteed that it'll be the winner
                    return first[0];
                }
                int[] second = q.pollFirst();
                if (first[2] >= k) {
                    return first[0];
                }
                if (first[1] > second[1]) {
                    first[2]++;
                    q.addLast(second);
                    q.addFirst(first);
                } else {
                    second[2]++;
                    q.addFirst(second);
                    q.addLast(first);
                }
                count++;
            }
        }
    }
}
