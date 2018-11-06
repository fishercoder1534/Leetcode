package com.fishercoder.solutions;

/**
 * 7. Reverse Integer
 *
 * Reverse digits of an integer.

 Example1: x = 123, return 321

 Example2: x = -123, return -321

 */
public class _7 {

    public static class Solution1 {
        public int reverse(int x) {
            long xL = x; // in case x=Integer.MIN_VALUE and cause error for 'x=-x' in line 7
            long temp = 0;
            boolean negative = false;
            if(xL < 0){
                xL = -xL;
                negative = true;
            }
            while (xL != 0){
                temp = temp*10 + xL%10;
                xL /= 10;
            }
        
            if(negative){
                return -temp < Integer.MIN_VALUE ? 0 : (int)-temp;
            } 
            return temp > Integer.MAX_VALUE ? 0 : (int)temp;
        }
    }
}
