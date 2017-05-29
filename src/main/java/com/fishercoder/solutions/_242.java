package com.fishercoder.solutions;

import java.util.Arrays;

/**Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.

 Note:
 You may assume the string contains only lowercase alphabets.

 Follow up:
 What if the inputs contain unicode characters? How would you adapt your solution to such case?*/

public class _242 {
    public boolean isAnagram_solution1(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        return new String(schar).equals(new String(tchar));
    }
    
    //another way: although much slower
    public boolean isAnagram_solution2(String s, String t) {
        if(s == null || t == null || s.length() != t.length()) return false;
        int[] counts = new int[26];
        for(int i = 0; i < s.length(); i++){
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }
        for(int i : counts){
            if(i != 0) return false;
        }
        return true;
    }
}
