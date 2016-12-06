package medium;

import utils.CommonUtils;

public class SearchForARange {

    public static int[] searchRange(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        int[] range = new int[2];
        range[0] = -1; range[1] = -1;
        while(start+1 < end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                int left = mid;
                while(left-1 >= 0 && nums[left] == nums[left-1]){
                    left--;
                }
                range[0] = left;
                int right = mid;
                while(right+1< nums.length && nums[right] == nums[right+1]){
                    right++;
                }
                range[1] = right;
                break;
            } else if(nums[mid] < target){
                start = mid;
            } else {
                end = mid;
            }
        }
        if(nums[start] == target){
            range[0] = start;
            while(start+1 < nums.length && nums[start] == nums[start+1]){
                start++;
            }
            range[1] = start;
        }
        if(nums[end] == target){
            range[1] = end;
            while(end-1 >= 0 && nums[end] == nums[end-1]){
                end--;
            }
            range[0] = end;
        }
        return range;
    }

    public static void main(String...strings){
        int[] nums = new int[]{1,2,3};
        int target = 2;
        int[] result = searchRange(nums, target);
        CommonUtils.printArray(result);
    }
}
