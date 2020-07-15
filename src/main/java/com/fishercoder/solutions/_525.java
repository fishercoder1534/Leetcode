package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _525 {

    public static class Solution1 {
        //credit: https://leetcode.com/articles/contiguous-array/#approach-3-using-hashmap-accepted
        public int findMaxLength(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            int count = 0;
            int max = 0;
            Map<Integer, Integer> map = new HashMap();
            map.put(0, -1);//initialize the map, which means at index zero, the length of contiguous subarray is -1
            for (int i = 0; i < nums.length; i++) {
                count += nums[i] == 1 ? 1 : -1;
                if (map.containsKey(count)) {
                    max = Math.max(i - map.get(count), max);
                } else {
                    map.put(count, i);//only when the map does not have this key, we put it in the map, this avoids overwriting the map
                    //also, it helps us keep the most leftside value in the map to help us compute the longest contigous array length
                }
            }
            return max;
        }
    }
}
