package com.stevesun.solutions;
/**326. Power of Three  QuestionEditorial Solution  My Submissions
Total Accepted: 57555
Total Submissions: 151383
Difficulty: Easy
Given an integer, write a function to determine if it is a power of three.

Follow up:
Could you do it without using any loop / recursion?

*/

public class PowerOfThree {
    //then I turned to the Editorial solution, it's pretty elegant to use base conversion which can be easily extended to any radix k
    //Idea: for a number in base 10, if it's power of 10, then it must be in this format: 10, 100, 1000... with a leading one and all trailing zeros
    //similarly, if a number is power of 3, then in its base 3 format, it must be in this format as well: 10, 100, 1000, 1000...
    //some Java built-in function could help us along the way:
    public boolean isPowerOfThree_base_conversion(int n){
        return Integer.toString(n, n).matches("^10*$");
    }
    
    //it turns out they're using a trick to solve this question without using a loop: find the max possible integer that is a power of 3, then do modulor with this number
    public boolean isPowerOfThree_without_loop(int n) {
        return (n > 0 && 1162261467 % n == 0);
    }
    
//I'm not able to think of a method that has no loop to do it, use regular method to solve it first
    public boolean isPowerOfThree(int n) {
        if(n < 3 && n != 1) return false;
        while(n != 1){
            if(n%3 != 0) return false;
            n /= 3;
        }
        return true;
    }
    
    public static void main(String...strings){
        PowerOfThree test = new PowerOfThree();
        System.out.println(test.isPowerOfThree(12));
        
        //find the max integer that is power of 3
        int maxPowerOf3_one_step_further = 3, maxPowerOf3 = 0;
        while(maxPowerOf3_one_step_further >= 0){
            maxPowerOf3_one_step_further = (int) maxPowerOf3_one_step_further*3;
            if(maxPowerOf3_one_step_further > 0) maxPowerOf3 = maxPowerOf3_one_step_further;
            System.out.println("maxPowerOf3 is: " + maxPowerOf3);
        }
    }
}
