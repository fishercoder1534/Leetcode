package com.fishercoder.solutions;

import java.util.*;

public class _2231 {
    public static class Solution1 {
        public int largestInteger(int num) {
            List<Integer> odds = new ArrayList<>();
            List<Integer> evens = new ArrayList<>();
            PriorityQueue<Integer> oddTimes = new PriorityQueue<>();
            PriorityQueue<Integer> evenTimes = new PriorityQueue<>();
            int times = 1;
            while (num != 0) {
                int digit = num % 10;
                num /= 10;
                if (digit % 2 == 0) {
                    evens.add(digit);
                    evenTimes.offer(times);
                } else {
                    odds.add(digit);
                    oddTimes.offer(times);
                }
                times *= 10;
            }
            Collections.sort(evens);
            Collections.sort(odds);
            int composite = 0;
            for (int i = 0; i < odds.size(); i++) {
                composite += odds.get(i) * oddTimes.poll();
            }
            for (int i = 0; i < evens.size(); i++) {
                composite += evens.get(i) * evenTimes.poll();
            }
            return composite;
        }
    }
}
