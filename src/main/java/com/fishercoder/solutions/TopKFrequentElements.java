package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;

/**Given a non-empty array of integers, return the k most frequent elements.

 For example,
 Given [1,1,1,2,2,3] and k = 2, return [1,2].

 Note:
 You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 Your algorithm's time complexity must be better than O(n log n), where n is the array's size.*/
public class TopKFrequentElements {
	// Approach 1: use buckets to hold numbers of the same frequency
	/**Attn: we must use a simple array to solve this problem, instead of using List<List<Integer>>, 
	 * we have to use List<Integer>[], otherwise, cases like this one: [-1,-1] 
	 * 1 will fail due to the fact that ArrayList.get(i), 
	 * this i must be a non-negative number, however, in simple arrays, the index could be negative.
	 * Although in this question, frequency will be at least 1, but still in problems like this where bucket sort
	 * works the best, you should use List<Integer>[], this will simplify the code.*/
	public List<Integer> topKFrequent_using_bucket(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap();
		for(int i : nums){
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		ArrayList[] bucket = new ArrayList[nums.length+1];
		for(Entry<Integer, Integer> e : map.entrySet()){
			int frequency = e.getValue();
			if(bucket[frequency] == null){
				bucket[frequency] = new ArrayList<Integer>();
			}
			bucket[frequency].add(e.getKey());
		}
		List<Integer> result = new ArrayList<Integer>();
		for(int i = bucket.length-1; i >= 0 && result.size() < k; i--){
			if(bucket[i] != null) result.addAll(bucket[i]);
		}
		
		return result;
	}

	// Approach 2: use hashtable and heap
	/**
	 * Bonus tips on how to write a priority queue:
	 * 
	 * Tip1:
	 * it should be like this:
	 * PriorityQueue's angle brackets should be left blank, the type should be in
	 * Comparator's angle brackets and the compare method should be in Comparator's
	 * brackets. new PriorityQueue<>(new Comparator<int[]>(){ public int
	 * compare(int[] o1, int[] o2){ } })
	 * 
	 * Tip2:
	 * if you want things in DEscending order, then if(01 > o2), it should return -1
	 * if Ascending order, then if(01 > o2), it should return 1
	 */
	public List<Integer> topKFrequent_using_heap(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap();
		Queue<Entry<Integer, Integer>> heap = new PriorityQueue<>(new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				if (o1.getValue() > o2.getValue())
					return -1;
				else if (o1.getValue() < o2.getValue())
					return 1;
				return 0;
			}
		});

		// construct the frequency map first, and then iterate through the map
		// and put them into the heap, this is O(n)
		for (int x : nums) {
			if (map.containsKey(x))
				map.put(x, map.get(x) + 1);
			else
				map.put(x, 1);
		}

		// build heap, this is O(n) as well
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			heap.offer(entry);
		}

		List<Integer> res = new ArrayList<Integer>();
		while (k-- > 0) {
			res.add(heap.poll().getKey());
		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 3, 0, 1, 0 };
		TopKFrequentElements test = new TopKFrequentElements();
		test.topKFrequent_using_heap(nums, 1);
//		test.topKFrequent_using_bucket(nums, 1);
	}

}
