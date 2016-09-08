package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {
/**This solution is pretty clear and similar to my own thought:
 * https://discuss.leetcode.com/topic/26050/simple-o-n-2-two-pointers-java-solution*/
    
    /**ATTN: this two-pointer technique here doesn't need a middle pointer!!! Instead, we just increment/decrement left
     * or right pointer by 1 each time when the sum != 0*/
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if(nums == null || nums.length == 0) return result;
        Arrays.sort(nums);//you'll have to sort it first, this is very important and very natural to think of 
        for(int i = 0; i < nums.length; i++){//we can let i reach the last element, it's fine since we have other checks afterwards, it won't go out of bound exception.
            if(i >= 1 && nums[i] == nums[i-1]) continue;//skip equal elements to avoid duplicates
            int left = i+1, right = nums.length-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left +1 < right && nums[left] == nums[left+1]) left++;
                    while(right -1 > left && nums[right] == nums[right-1]) right--;
                    left++;//be sure to have these two lines after the above two while loops
                    right--;
                } else if(sum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }

}
