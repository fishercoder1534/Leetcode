package com.stevesun.solutions;

import java.util.HashMap;
import java.util.Map;

/**Given a string, determine if a permutation of the string could form a palindrome.

 For example,
 "code" -> False, "aab" -> True, "carerac" -> True.

 Hint:

 Consider the palindromes of odd vs even length. What difference do you notice?
 Count the frequency of each character.
 If each character occurs even number of times, then it must be a palindrome. How about character which occurs odd number of times?*/
public class PalindromePermutation {

    public boolean canPermutePalindrome(String s) {
 
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c : chars){
            if(!map.containsKey(c)) map.put(c, 1); 
            else map.put(c, map.get(c)+1);
        }
        int evenCount = 0;
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() % 2 != 0) evenCount++;
            if(evenCount > 1) return false;
        }
        return true;
           
    }

}
