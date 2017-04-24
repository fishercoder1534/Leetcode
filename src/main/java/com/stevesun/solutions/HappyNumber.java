package com.stevesun.solutions;

import java.util.HashSet;
import java.util.Set;
/**Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

 Example: 19 is a happy number

 12 + 92 = 82
 82 + 22 = 68
 62 + 82 = 100
 12 + 02 + 02 = 1*/
public class HappyNumber {

    public static boolean isHappy(int n) {
        if(n == 1) return true;
        Set<Integer> set = new HashSet();
        while(n != 1){
            String str = String.valueOf(n);
            n = 0;
            for(int i = 0; i < str.length(); i++){
                int temp = Character.getNumericValue(str.charAt(i));
                n += temp*temp;
            }
            if(n == 1) return true;
            if(!set.add(n)) return false;
        }
        return false;
    }

    
    public static void main(String...strings){
       int n = 7;
        System.out.println(isHappy(n)); 
    }
}
