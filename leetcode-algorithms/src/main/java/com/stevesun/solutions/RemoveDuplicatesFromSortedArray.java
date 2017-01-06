package com.stevesun.solutions;

public class RemoveDuplicatesFromSortedArray {

    /**Same idea as the editorial solution, mine just got more verbose.*/
    public static int removeDuplicates_my_original(int[] nums) {
        int i = 0;
        for(int j = i+1; i < nums.length && j < nums.length;){
            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }
            if(j == nums.length) j--;
            int temp = nums[j];
            nums[j] = nums[i+1];
            nums[i+1] = temp;
            if(nums[i] != nums[i+1]) i++;
            if(j == nums.length) break;
            j++;
        }
        return i+1;
    }
    

    public int removeDuplicates_editorial_solution(int[] nums) {
        int i = 0;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }


    public static void main(String...strings){
        int[] nums = new int[]{1,1,2};
//        int[] nums = new int[]{1,1,2,2,3};
//        int[] nums = new int[]{1,1};
        System.out.println(removeDuplicates_my_original(nums));
    }
}
