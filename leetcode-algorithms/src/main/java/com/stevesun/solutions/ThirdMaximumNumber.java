package com.stevesun.solutions;

public class ThirdMaximumNumber {

    public static int thirdMax_20161115(int[] nums) {

        if (nums == null || nums.length == 0) return 0;
        if (nums.length < 3) {
           int max = 0;
           for (int i : nums) {
               max = Math.max(i, max);
           }
           return max;
        }
        
        long first = Long.MIN_VALUE, second = Long.MIN_VALUE, third = Long.MIN_VALUE;
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > first) {
                long tmpFirst = first;
                first = nums[i];
                
                long tmpSecond = second;
                second = tmpFirst;
                
                third = tmpSecond;
            } else if (nums[i] == first) continue;
            else if (nums[i] > second) {
                long tmpSecond = second;
                second = nums[i];
                
                third = tmpSecond;
            } else if (nums[i] == second) continue; 
            else if (nums[i] > third) {
                third = nums[i];
            }
        }
        
        if (third == Long.MIN_VALUE){
           return (int) first;
        }
        
        return (int) third;
    
    }
    
    public static void main(String...strings){
//        int[] nums = new int[]{1,2};
//        int[] nums = new int[]{2,2,3,1};
//        int[] nums = new int[]{1,1,2};//should be 2
        int[] nums = new int[]{1,2,-2147483648};//should be -2147483648
//        int[] nums = new int[]{3,2,1};
//        System.out.println(thirdMax(nums));
        System.out.println(thirdMax_20161115(nums));
    }

}
