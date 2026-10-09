package com.fishercoder.solutions.fourththousand;

import java.util.PriorityQueue;

public class _3769 {
    public static class Solution1 {
        public int[] sortByReflection(int[] nums) {
            PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> {
                if (a[0] != b[0]) {
                    return (int) (a[0] - b[0]);
                }
                return Math.toIntExact(a[1] - b[1]);
            });
            for (int num : nums) {
                String binNum = Integer.toBinaryString(num);
                StringBuilder sb = new StringBuilder(binNum);
                String reversed = sb.reverse().toString();
                long newNumber = Long.parseLong(reversed, 2);//this radix = 2 param is important, otherwise, this Long.parseLong() function will parse it based on radix=10, i.e. decimal, Long.parseLong("1011") = 1011L
                pq.offer(new long[]{newNumber, num});
            }
            int[] res = new int[nums.length];
            int i = 0;
            while (!pq.isEmpty()) {
                res[i++] = (int) pq.poll()[1];
            }
            return res;
        }
    }
}
