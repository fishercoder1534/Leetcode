package stevesun.algorithms;

/**
 * Created by fishercoder1534 on 10/4/16.
 */
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int i = 0, j = 0, min = Integer.MAX_VALUE, sum = 0;
        while(j < nums.length){
            sum += nums[j++];

            while(sum >= s){
                min = Math.min(min, j-i);
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

}
