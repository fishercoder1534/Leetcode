package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _325 {

    public static class Solution1 {
        public int maxSubArrayLen(int[] nums, int k) {
            int n = nums.length;
            // HashMap to store (sum, index) tuples
             HashMap<Integer, Integer> map = new HashMap<>();
             int sum = 0, maxLen = 0;
 
             // traverse the given array
             for (int i = 0; i < n; i++) {
                 
                  // accumulate sum
                  sum += arr[i];
                 
                  // when subarray starts from index '0'
                  if (sum == k)
                      maxLen = i + 1;
 
                  // make an entry for 'sum' if it is
                  // not present in 'map'
                  if (!map.containsKey(sum)) {
                      map.put(sum, i);
                  }
 
                  // check if 'sum-k' is present in 'map'
                  // or not
                  if (map.containsKey(sum - k)) {
                       
                      // update maxLength
                      if (maxLen < (i - map.get(sum - k)))
                          maxLen = i - map.get(sum - k);
                  }
             }
              
             return maxLen; 
    }

}
