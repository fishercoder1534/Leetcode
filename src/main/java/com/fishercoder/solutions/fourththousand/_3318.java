package com.fishercoder.solutions.fourththousand;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _3318 {
    public static class Solution1 {
        public int[] findXSum(int[] nums, int k, int x) {
            PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> a[1] != b[1] ? b[1] - a[1] : b[0] - a[0]);//a[0] is the number itself, a[1] is the frequency
            Map<Integer, int[]> map = new HashMap<>();
            int i = 0;
            for (; i < k; i++) {
                int[] a = map.getOrDefault(nums[i], new int[2]);
                a[0] = nums[i];
                a[1]++;
                map.put(nums[i], a);
            }
            maxHeap.addAll(map.values());
            int[] ans = new int[nums.length - k + 1];
            for (int j = i - 1, p = 0; j < nums.length; ) {
                ans[p++] = computeTopX(new PriorityQueue<>(maxHeap), x);

                j++;
                if (j >= nums.length) {
                    break;
                }
                int[] a = map.getOrDefault(nums[j], new int[2]);
                a[0] = nums[j];
                a[1]++;
                map.put(nums[j], a);

                a = map.getOrDefault(nums[j - k], new int[2]);
                a[0] = nums[j - k];
                a[1]--;
                map.put(nums[j - k], a);

                maxHeap.clear();
                maxHeap.addAll(map.values());
            }
            return ans;
        }

        private int computeTopX(PriorityQueue<int[]> maxHeap, int x) {
            int sum = 0;
            while (!maxHeap.isEmpty() && x-- > 0) {
                int[] a = maxHeap.poll();
                sum += a[0] * a[1];
            }
            return sum;
        }
    }
}
