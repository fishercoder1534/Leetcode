package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

public class _347 {

    public static class Solution1 {
        /**
         * Use buckets to hold numbers of the same frequency
         * It's averaged at 30 ms on Leetcode.
         */
        public List<Integer> topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap();
            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            ArrayList[] bucket = new ArrayList[nums.length + 1];
            for (Entry<Integer, Integer> e : map.entrySet()) {
                int frequency = e.getValue();
                if (bucket[frequency] == null) {
                    bucket[frequency] = new ArrayList<Integer>();
                }
                bucket[frequency].add(e.getKey());
            }
            List<Integer> result = new ArrayList<>();
            for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
                if (bucket[i] != null) {
                    for (int j = 0; j < bucket[i].size(); j++) {
                        result.add((int) bucket[i].get(j));
                    }
                }
            }

            return result;
        }
    }

    public static class Solution2 {
        /**
         * Use hashtable and heap, it's averaged at 100 ms on Leetocde.
         */
        public List<Integer> topKFrequent(int[] nums, int k) {
            // construct the frequency map first, and then iterate through the map
            // and put them into the heap, this is O(n)
            Map<Integer, Integer> map = new HashMap();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // build heap, this is O(logn)
            Queue<Entry<Integer, Integer>> heap = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
            for (Entry<Integer, Integer> entry : map.entrySet()) {
                heap.offer(entry);
            }

            List<Integer> res = new ArrayList();
            while (k-- > 0) {
                res.add(heap.poll().getKey());
            }
            return res;
        }
    }
}
