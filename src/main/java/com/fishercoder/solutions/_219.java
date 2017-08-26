package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

/**219. Contains Duplicate II
 *
Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.*/
public class _219 {

    //pretty straightforward, use a hashmap, key is the number itself, value is the last index that this value appeared in the array
    //we can keep updating the value as we move forward, since if the current index minus the last index cannot be smaller than k, then
    //the later indices won't even do either. So, we only need to keep one index in the value of the HashMap. Cheers!
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
