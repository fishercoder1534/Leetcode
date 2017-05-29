package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * 383 Ransom Note:
 * Note:
You may assume that both strings contain only lowercase letters.

canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
*/
public class RansomNote {

    public boolean canConstruct_20160924(String ransomNote, String magazine) {
        char[] mchars = magazine.toCharArray();
        int[] mcnt = new int[256];
        for(int i = 0; i < mchars.length; i++){
            mcnt[mchars[i] - 'a']++;
        }
        
        char[] rchars = ransomNote.toCharArray();
        for(int i = 0; i < rchars.length; i++){
            if(mcnt[rchars[i] - 'a'] <= 0) return false;
            mcnt[rchars[i] - 'a']--;
        }
        return true;
    }

    
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new HashMap();
        Set<Character> ransomSet = new HashSet();
        Map<Character, Integer> magazineMap = new HashMap();
        Set<Character> magazineSet = new HashSet();
        char[] ransom = ransomNote.toCharArray();
        char[] maga = magazine.toCharArray();
        for(int i = 0; i < ransom.length; i++){
            ransomSet.add(ransom[i]);
            ransomMap.put(ransom[i], ransomMap.getOrDefault(ransom[i], 0)+1);
        }
        for(int i = 0; i < maga.length; i++){
            magazineSet.add(maga[i]);
            magazineMap.put(maga[i], magazineMap.getOrDefault(maga[i], 0)+1);
        }
        
        for(char c : ransomSet){
            if(!magazineSet.contains(c)) return false;
        }
        for(char c : ransomMap.keySet()){
            if(!magazineMap.containsKey(c)) return false;
            if(magazineMap.get(c) < ransomMap.get(c)) return false;
        }
        return true;
    }
    
    public static void main(String...strings){
        RansomNote test = new RansomNote();
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(test.canConstruct(ransomNote, magazine));
    }
}
