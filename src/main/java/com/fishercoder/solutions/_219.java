package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**219. Contains Duplicate II

 Given an array of integers and an integer k,
 find out whether there are two distinct indices i and j in
 the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 */
public class _219 {

    public static class Solution1 {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    if (i - map.get(nums[i]) <= k) {
                        return true;
                    } else {
                        map.put(nums[i], i);
                    }
                } else {
                    map.put(nums[i], i);
                }
            }
            return false;
        }
    }
}
