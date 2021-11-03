package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

public class _347 {

    public static class Solution1 {
        /**
         * Use buckets to hold numbers of the same frequency
         * It's averaged at 30 ms on Leetcode.
         */
        public int[] topKFrequent(int[] nums, int k) {
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
            int[] arr = new int[result.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = result.get(i);
            }
            return arr;
        }
    }

    public static class Solution2 {
        /**
         * Use hashtable and heap, it's averaged at 100 ms on Leetocde.
         */
        public int[] topKFrequent(int[] nums, int k) {
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

            List<Integer> result = new ArrayList();
            while (k-- > 0) {
                result.add(heap.poll().getKey());
            }
            int[] arr = new int[result.size()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = result.get(i);
            }
            return arr;
        }
    }

    public static class Solution3 {
        /**
         * Use hashtable and heap, it's averaged at 10 ms on Leetocde.
         */
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i : nums) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>((a, b) -> b - a);
            for (int key : map.keySet()) {
                List<Integer> list = treeMap.getOrDefault(map.get(key), new ArrayList<>());
                list.add(key);
                treeMap.put(map.get(key), list);
            }
            List<Integer> list = new ArrayList<>();
            while (!treeMap.isEmpty()) {
                list.addAll(treeMap.pollFirstEntry().getValue());
                if (list.size() == k) {
                    break;
                }
            }
            int[] ans = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ans[i] = list.get(i);
            }
            return ans;
        }
    }
}
