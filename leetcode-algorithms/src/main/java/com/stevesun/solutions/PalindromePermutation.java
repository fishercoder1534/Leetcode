package com.stevesun.solutions;

import java.util.HashMap;
import java.util.Map;

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
