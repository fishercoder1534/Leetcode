package medium;

import utils.CommonUtils;

public class TwoSumIIInputArrayIsSorted {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length-1;
        int[] result = new int[2];
        while(numbers[right] > target) right--;
        if(right < numbers.length-1) right++;
        while(left <= right){
            int sum = numbers[left] + numbers[right];
            if(sum > target) right--;
            else if(sum < target) left++;
            else if(sum == target){
                result[0] = left+1;
                result[1] = right+1;
                break;
            }
        }
        return result;
    }
    
    public static void main(String...strings){
        int[] nums = new int[]{-3,3,4,90};
        int k = 0;
        int[] result = twoSum(nums, k);
        CommonUtils.printArray(result);
    }
}
