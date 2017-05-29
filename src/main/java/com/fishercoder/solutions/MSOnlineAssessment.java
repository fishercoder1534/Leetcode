package com.fishercoder.solutions;

import java.util.*;

public class MSOnlineAssessment {
    /**Given an array, return the start/end indices of the contiguous subarray that have the largest sum.

     Note:
     1. There could be multiple subarrays, return all of the indices.*/

    public static void main(String... args) {
        int[] nums = new int[]{1,2,3,4,5, -1, -3, -6, 3, 2, -4};
//        int[] nums = new int[]{-1, -2, 1,2,3};
//        int[] nums = new int[]{-1, -2, 1,2,3,-1, -2};
//        List<int[]> result = subarraySum_v2(nums);

    }

    public static List<int[]> subarraySum_v2(int[] nums) {
        int[] preSums = new int[nums.length+1];
        for (int i = 1; i <= nums.length; i++) {
            preSums[i] = preSums[i-1] + nums[i-1];
        }
        TreeMap<Integer, List<int[]>> preSum = new TreeMap(Collections.reverseOrder());
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j < i-1; j++) {
                int sum = preSums[i] - preSums[j];
                if (!preSum.containsKey(sum)) {
                    List<int[]> value = new ArrayList<>();
                    value.add(new int[]{j, i-1});
                    preSum.put(sum, value);
                } else {
                    List<int[]> value = preSum.get(sum);
                    value.add(new int[]{j, i-1});
                    preSum.put(sum, value);
                }
            }
        }
        Map.Entry<Integer, List<int[]>> firstEntry = preSum.firstEntry();
        return firstEntry.getValue();
    }
}
