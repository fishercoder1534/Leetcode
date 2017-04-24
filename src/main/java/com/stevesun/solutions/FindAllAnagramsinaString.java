package com.stevesun.solutions;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString {
    /**O(m*n) solution, my original and most intuitive one, but kind of brute force.*/
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList();
        for (int i = 0; i <= s.length()-p.length(); i++){
            if (isAnagram(s.substring(i, i+p.length()), p)) result.add(i);
        }
        return result;
    }
    
    private boolean isAnagram(String s, String p){
        int[] c = new int[26];
        for (int i = 0; i < s.length(); i++){
            c[s.charAt(i) - 'a']++;
            c[p.charAt(i) - 'a']--;
        }
        
        for (int i : c){
            if(i != 0) return false;
        }
        return true;
    }

    
    static class SlidingWindowSolution {
        /**O(n) solution inspired by this post: https://discuss.leetcode.com/topic/64434/shortest-concise-java-o-n-sliding-window-solution*/
        public List<Integer> findAnagrams(String s, String p) {
            List<Integer> result = new ArrayList();
            int[] hash = new int[26];
            for (char c : p.toCharArray()){
                hash[c - 'a']++;
            }
            int start = 0, end = 0, count = p.length();
            while (end < s.length()){
                if(hash[s.charAt(end) - 'a'] > 0){
                    count--;
                }
                hash[s.charAt(end) - 'a']--;
                end++;
                
                if(count == 0) result.add(start);
                
                if((end - start) == p.length()){
                    if(hash[s.charAt(start) - 'a'] >= 0) count++;
                    hash[s.charAt(start) - 'a']++;
                    start++;
                }
            }
            return result;
        }
    }
    
    public static void main(String...args){
        SlidingWindowSolution test = new SlidingWindowSolution();
        String s = "cbaebabacd";
        String p = "abc";
        test.findAnagrams(s, p);
    }
}
