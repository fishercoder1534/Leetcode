package com.stevesun.solutions;

public class SortColors {


    public void sortColors(int[] nums) {
        int zero = 0, two = nums.length-1;
        for(int i = 0; i <= two;){
            if(nums[i] == 0 && i > zero) swap(nums, i, zero++);
            else if(nums[i] == 2 && i < two) swap(nums, i, two--);
            else i++;
        }
    }
    
    void swap(int[] nums, int m, int n){
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }


    public static void main(String...args){
//        int[] nums = new int[]{0,1,2,0,2,1};
//        int[] nums = new int[]{0};
//        int[] nums = new int[]{2};
        int[] nums = new int[]{2,2,1};
//        int[] nums = new int[]{1,0};
    }
}
