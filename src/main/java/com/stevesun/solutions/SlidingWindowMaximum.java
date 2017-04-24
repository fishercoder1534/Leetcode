package com.stevesun.solutions;

import java.util.*;

/**
 * Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

 For example,
 Given nums = [1,3,-1,-3,5,3,6,7], and k = 3.

 Window position                Max
 ---------------               -----
 [1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
 Therefore, return the max sliding window as [3,3,5,5,6,7].

 Note:
 You may assume k is always valid, ie: 1 ≤ k ≤ input array's size for non-empty array.

 Follow up:
 Could you solve it in linear time?

 Hint:

 How about using a data structure such as deque (double-ended queue)?
 The queue size need not be the same as the window’s size.
 Remove redundant elements and the queue should store only elements that need to be considered.
 */
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k == 0) return new int[0];
        Queue<Integer> heap = new PriorityQueue<Integer>(new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) return -1;
                else if(o1 < o2) return 1;
                else return 0;
            }

        }
        );
        int i = 0;
        for(; i < k; i++){
            heap.offer(nums[i]);
        }
        List<Integer> list = new ArrayList<Integer>();
        list.add(heap.peek());
        for(; i < nums.length; i++){
            heap.remove(nums[i-k]);
            heap.offer(nums[i]);
            list.add(heap.peek());
        }
        int[] res = new int[list.size()];
        for(int j = 0; j < list.size(); j++){
            res[j] = list.get(j);
        }
        return res;
    }

}
