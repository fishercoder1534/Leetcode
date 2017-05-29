package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

/**66. Plus One
Given a non-negative number represented as an array of digits, plus one to the number.

The digits are stored such that the most significant digit is at the head of the list.*/
public class PlusOne {
    //also looked at Discuss, basically the same idea as mine, just their code is more concise.
    
    public int[] plusOne(int[] digits) {
        boolean carry = false;
        int len = digits.length;
        int[] temp = digits;
        //process the last digit at first, to get carry value
        if(digits[len-1] + 1 == 10) {
            carry = true;
            temp[len-1] = 0;
        }
        else {
            temp[len-1] += 1;
            return temp;
        }
        
        //start from the second last element
        for(int i = len-2; i >= 0; i--){
            if(carry && temp[i] + 1 == 10){
                temp[i] = 0;
                carry = true;
            } else if(carry) {
                temp[i] += 1;
                carry = false;
            }
        }
        if(carry && temp[0] == 0) {
            int[] res = new int[len+1];
            res[0] = 1;
            //all the rest of the numbers should all be zeroes, so we don't need to copy from the original array
            return res;
        }
        return temp;
    }
    
    public static void main(String...strings){
        PlusOne test = new PlusOne();
//        int[] digits = new int[]{9,9,9,9};
//        int[] digits = new int[]{8,9,9,9};
        int[] digits = new int[]{2,4,9,3,9};
        int[] res = test.plusOne(digits);
        CommonUtils.printArray(res);
    }
}
