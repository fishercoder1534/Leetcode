package stevesun.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4Sum {
    /**Then I went online and found that there're really smarter/more efficient solutions out there:
     * Post 1: https://discuss.leetcode.com/topic/29585/7ms-java-code-win-over-100
     *  this post basically uses two subfunctions, it keeps using binary search to divide this 4sum to 3sum and then to 2sum,
     *  thus, it's really fast!!!! Instead of using two for loops.*/
    
/**My original solution:*/


    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList();
        if(nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length -3; i++){
            if(i > 0 && nums[i-1] == nums[i]) continue;
            for(int j = i+1; j < nums.length-2; j++){
                if(j > i+1 && nums[j-1] == nums[j]) continue;
                int left = j+1, right = nums.length-1;
                while(left < right){
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while(left+1 < right && nums[left] == nums[left+1]) left++;
                        while(right-1 > left && nums[right] == nums[right-1]) right--;
                        left++;
                        right--;
                    } else if(sum > target) right--;
                    else left++;
                }
            }
        }
        return result;
    }

}
