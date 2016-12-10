package stevesun.algorithms;

import stevesun.common.utils.CommonUtils;

import java.util.HashMap;
import java.util.Map;

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