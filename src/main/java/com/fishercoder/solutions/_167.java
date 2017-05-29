package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

/**
 * 167. Two Sum II - Input array is sorted
 *
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2

 */
public class _167 {
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
