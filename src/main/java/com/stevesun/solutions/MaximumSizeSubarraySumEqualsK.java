package com.stevesun.solutions;

import com.stevesun.common.utils.CommonUtils;

import java.util.HashMap;
import java.util.Map;

/**Given an array nums and a target value k, find the maximum length of a subarray that sums to k. If there isn't one, return 0 instead.

 Note:
 The sum of the entire nums array is guaranteed to fit within the 32-bit signed integer range.

 Example 1:
 Given nums = [1, -1, 5, -2, 3], k = 3,
 return 4. (because the subarray [1, -1, 5, -2] sums to 3 and is the longest)

 Example 2:
 Given nums = [-2, -1, 2, 1], k = 1,
 return 2. (because the subarray [-1, 2] sums to 1 and is the longest)

 Follow Up:
 Can you do it in O(n) time?*/

public class MaximumSizeSubarraySumEqualsK {
    public int maxSubArrayLen_On_solution(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        int sum = 0, max = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum == k) max = i+1;
            else if(map.containsKey(sum-k)) max = Math.max(max, i-map.get(sum-k));
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        return max;
    }

    
    public static int maxSubArrayLen_On2_solution(int[] nums, int k) {
        //NOTES: didn't finish this one
        int[] sums = new int[nums.length];
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0) sums[i] = nums[i];
            else sums[i] = sums[i-1] + nums[i];
            if(sums[i] == k) max = i+1;//then this one must be the max
        }
        CommonUtils.printArray(sums);
        //do computation for each possible subarray of sums and find the max length
        return max;
    }
    
    public static void main(String...args){
        //correct answer is 4
//        int[] nums = new int[]{1, -1, 5, -2, 3};
//        int k = 3;
        
        //correct answer is 2
        int[] nums = new int[]{-2, -1, 2, 1};
        int k = 1;
        maxSubArrayLen_On2_solution(nums, k);
    }
    
}