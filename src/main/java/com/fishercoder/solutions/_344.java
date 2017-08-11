package com.fishercoder.solutions;

/**
 * 344. Reverse String
 *
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".*/
public class _344 {
    public String reverseString_cheating(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    public String reverseString(String s){
        int i = 0, j = s.length()-1;
        char[] chars = s.toCharArray();
        while(i < j){
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;

        }
        return new String(chars);
    }
}
