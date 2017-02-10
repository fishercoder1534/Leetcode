package com.stevesun.solutions;

/**Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Solve it without division and in O(n).

 For example, given [1,2,3,4], return [24,12,8,6].

 Follow up:
 Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)*/

public class ProductOfArrayExceptItself {
/**The trick is to construct the arrays (in the case of 4 elements)

{              1,         a[0],    a[0]*a[1],    a[0]*a[1]*a[2],  }
{ a[1]*a[2]*a[3],    a[2]*a[3],         a[3],                 1,  }

Both of which can be done in O(n) by starting at the left and right edges respectively.
Then multiplying the two arrays element by element gives the required result*/
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        res[0] = 1;
        for(int i = 1; i < len; i++){
            res[i] = res[i-1]*nums[i-1];
        }
        int right = 1;
        for(int i = len-1; i >= 0; i--){
            /**I need to better understand this for loop: how it's constructing the 2nd array:
             * it's going from the right side to the left since it starts from i = len - 1;
             * So, what the two following lines mean:
             * 
             * res[i] *= right; means to multiply element by element
             * right *= nums[i]; means to construct the second array
             * 
             * It's basically doing the two things in this same for loop.
            */
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
