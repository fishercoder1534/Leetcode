package com.fishercoder.solutions.fourththousand;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _3769 {
    public static class Solution1 {
        public int[] sortByReflection(int[] nums) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];
            });
            for (int num : nums) {
                String binNum = Integer.toBinaryString(num);
                StringBuilder sb = new StringBuilder(binNum);
                String reversed = sb.reverse().toString();
                int newNumber = Integer.parseInt(reversed, 2);//this radix = 2 param is important, otherwise, this Long.parseLong() function will parse it based on radix=10, i.e. decimal, Long.parseLong("1011") = 1011L
                pq.offer(new int[]{newNumber, num});
            }
            int[] res = new int[nums.length];
            int i = 0;
            while (!pq.isEmpty()) {
                res[i++] = pq.poll()[1];
            }
            return res;
        }
    }

    public static class Solution2 {
        public int[] sortByReflection(int[] nums) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                } else {
                    return Integer.compare(a[1], b[1]);
                }
            });
            for (int num : nums) {
                int reversed = reverseBinary(num);
                pq.offer(new int[]{reversed, num});
            }
            int[] res = new int[nums.length];
            int i = 0;
            while (!pq.isEmpty()) {
                res[i++] = pq.poll()[1];
            }
            return res;
        }

        /**
         * See _190.Solution2 for detailed explanation
         */
        private int reverseBinary(int num) {
            int reversed = 0;
            while (num > 0) {
                //this is to get the rightmost bit, i.e. the least significant bit
                int leastBit = num & 1;

                //this is to shift the reversed number to the left by one to make one open spot for the least bit to be inserted into
                reversed <<= 1;

                //this is the insert the least bit into the rightmost open spot
                reversed |= leastBit;

                //this is to shift the number to the right by one,
                num >>= 1;
            }
            return reversed;
        }
    }
}
