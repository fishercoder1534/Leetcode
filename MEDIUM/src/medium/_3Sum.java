package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        int left = 0, right = nums.length-1, mid = 0;
        while(left+1 < right){
            mid = left + (right-left)/2;
            int sum = nums[left] + nums[mid] + nums[right];
            if(sum == 0){
                List<Integer> list = new ArrayList();
                list.add(nums[left]);
                list.add(nums[mid]);
                list.add(nums[right]);
                
                //move left forward to get all possible combinations
            } else if(sum > 0){
                right = mid;
            } else {
                left = mid;
            }
        }
    }

}
