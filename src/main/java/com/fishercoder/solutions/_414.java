package com.fishercoder.solutions;

/**
 * 414. Third Maximum Number
 *
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number. The time complexity must be in O(n).

 Example 1:
 Input: [3, 2, 1]

 Output: 1

 Explanation: The third maximum is 1.
 Example 2:
 Input: [1, 2]

 Output: 2

 Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 Example 3:
 Input: [2, 2, 3, 1]

 Output: 1

 Explanation: Note that the third maximum here means the third maximum distinct number.
 Both numbers with value 2 are both considered as second maximum.
 */
public class _414 {

    public static int thirdMax(int[] nums) {

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
        System.out.println(thirdMax(nums));
    }

}
