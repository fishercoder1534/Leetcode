package com.fishercoder.solutions.firstthousand;

import java.util.*;
import java.util.Map.Entry;

public class _347 {

    public static class Solution1 {
        /*
         * Bucket sort:
         * Use buckets to hold numbers of the same frequency, some buckets might be empty while the rest might have more than one element.
         * This editorial explains it well enough: https://leetcode.com/problems/top-k-frequent-elements/editorial/ starting from 08'55".
         * <p>
         * This is the most optimal solution.
         * Time: O(n)
         * Space: O(n)
         */
        public int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            // use nums.length + 1, so that we can directly use the frequency as the index for this
            // array
            // how this buckets look like is: buckets[1] holds numbers that have frequency one,
            // buckets[2] holds numbers that have frequency two, etc.
            // so, the numbers that have the highest frequencies are on the right-most side.
            List[] bucket = new ArrayList[nums.length + 1];
            for (Entry<Integer, Integer> entry : map.entrySet()) {
                int freq = entry.getValue();
                if (bucket[freq] == null) {
                    bucket[freq] = new ArrayList<Integer>();
                }
                bucket[freq].add(entry.getKey());
            }
            int[] result = new int[k];
            for (int i = bucket.length - 1, l = 0; i >= 0 && l < k; i--) {
                if (bucket[i] != null) {
                    for (int j = 0; j < bucket[i].size(); j++) {
                        result[l++] = (int) bucket[i].get(j);
                    }
                }
            }
            return result;
        }
    }

    public static class Solution2 {
        /*
         * Use hashtable and heap.
         * Time: O(nlogn)
         * Space: O(n)
         */
        public int[] topKFrequent(int[] nums, int k) {
            // construct the frequency map first, and then iterate through the map
            // and put them into the heap, this is O(n)
            Map<Integer, Integer> map = new HashMap();
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            // build heap, this is O(nlogn)
            Queue<Entry<Integer, Integer>> heap =
                    new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
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
}
