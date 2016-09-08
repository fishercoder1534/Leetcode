package medium;

import java.util.Arrays;

public class _3SumClosest {
/**One implicit requirement is that you must have THREE elements!!! You cannot have just one!*/
    
    /**Another cool trick that I learned here is that:
     * after comparing the absolute difference, we'll see if thisSum > target or not, then we decide to shift left or right pointer.*/
    

    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        int len = nums.length;
        if(len < 3){
            int sum = 0;
            for(int i : nums){
                sum += i;
            }
            return sum;
        }
        int sum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length-2; i++){
            int left = i+1, right = nums.length-1;
            while(left < right){
                int thisSum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - thisSum) < Math.abs(target - sum)) {
                    sum = thisSum;
                    if(sum == target) return sum;
                }
                else if(target > thisSum){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return sum;
    }

}
