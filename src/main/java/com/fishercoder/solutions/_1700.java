package com.fishercoder.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _1700 {
    public static class Solution1 {
        public int countStudents(int[] students, int[] sandwiches) {
            Queue<Integer> studentsQueue = new LinkedList<>();
            Queue<Integer> sandwichesQueue = new LinkedList<>();
            for (int i = 0; i < sandwiches.length; i++) {
                studentsQueue.add(students[i]);
                sandwichesQueue.add(sandwiches[i]);
            }
            do {
                if (!studentsQueue.isEmpty()) {
                    if (studentsQueue.peek() == sandwichesQueue.peek()) {
                        studentsQueue.poll();
                        sandwichesQueue.poll();
                    } else {
                        if (!studentsQueue.contains(sandwichesQueue.peek())) {
                            break;
                        }
                        studentsQueue.add(studentsQueue.poll());
                    }
                }
            } while (!studentsQueue.isEmpty());
            return studentsQueue.size();
        }
    }
}
