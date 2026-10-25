package com.fishercoder.solutions.fifththousand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class _4093 {
    public static class Solution1 {

        public long maximizeSum(int[] nums, int k) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[1] - b[0]) - (a[1] - a[0]));
            long sum = 0;
            for (int num : nums) {
                int max = maxPossible(num);
                if (max > num) {
                    pq.offer(new int[]{num, max});
                } else {
                    sum += num;
                }
            }
            while (!pq.isEmpty() && k-- > 0) {
                int[] cur = pq.poll();
                sum += cur[1];
            }
            while (!pq.isEmpty()) {
                int[] cur = pq.poll();
                sum += cur[0];
            }
            return sum;
        }

        private int maxPossible(int num) {
            List<Integer> list = new ArrayList<>();
            int tmp = num;
            while (tmp > 0) {
                list.add(tmp % 10);
                tmp /= 10;
            }
            Collections.sort(list);
            int max = 0;
            int tens = 1;
            for (int i = 0; i < list.size(); i++, tens *= 10) {
                max += list.get(i) * tens;
            }
            return max;
        }
    }
}
