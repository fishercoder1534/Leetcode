package com.fishercoder.solutions;

import java.util.*;

/**
 * There is a new alien language which uses the latin alphabet. However, the order among letters are unknown to you. You receive a list of words from the dictionary, where words are sorted lexicographically by the rules of this new language. Derive the order of letters in this language.

 For example,
 Given the following words in dictionary,

 [
 "wrt",
 "wrf",
 "er",
 "ett",
 "rftt"
 ]
 The correct order is: "wertf".

 Note:
 You may assume all letters are in lowercase.
 If the order is invalid, return an empty string.
 There may be multiple valid order of letters, return any one of them is fine.
 */
public class AlienDictionary {

/**With this code, this test case: ["wrtkj","wrt"], expected "", my output: "jkrtw", this is a new test case that got added
 * on 9/29/2016, it's 113/115 test cases.
 * And all code on the Discuss board fail by this test case.*/
    public static String alienOrder(String[] words) {
        Set<String> orders = new HashSet();
        for(int i = 0; i < words.length-1; i++){
            for(int j = 0; j < Math.min(words[i].length(), words[i+1].length());j++){
                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    String order = "" + words[i].charAt(j) + words[i+1].charAt(j);
                    String reverseOrder = "" + words[i+1].charAt(j) + words[i].charAt(j);
                    if(!orders.contains(order)) {
                        orders.add(order);                    }
                    if(orders.contains(reverseOrder)) return "";
                    break;
                }
            }
        }

        //computer all letters that appeared:
        Set<Character> appearedLetters = new HashSet();
        for(String word : words){
            char[] cs = word.toCharArray();
            for(char c : cs){
                appearedLetters.add(c);
            }
        }

        int[] indegree = new int[26];
        for(String order : orders){
            indegree[order.charAt(1) - 'a']++;
        }

        //use a set to store all characters that have zero indegrees
        Set<Character> zeroDegree = new HashSet();
        Queue<Character> q = new LinkedList();
        for(int i = 0; i < 26; i++){
            if(indegree[i] == 0 && appearedLetters.contains((char) (i+'a'))) {
                zeroDegree.add((char) (i+'a'));
                q.offer((char) (i+'a'));
            }
        }

        while(!zeroDegree.isEmpty()){
            Iterator<Character> iter = zeroDegree.iterator();
            char letter = iter.next();
            zeroDegree.remove(letter);
            for(String order : orders){
                if(order.charAt(0) == letter){
                    indegree[order.charAt(1)-'a']--;
                    if(indegree[order.charAt(1)-'a'] == 0){
                        zeroDegree.add(order.charAt(1));
                        q.offer(order.charAt(1));
                    }
                }
            }
        }

        for(int i : indegree){
            if(i != 0) return "";
        }

        StringBuilder sb = new StringBuilder();
        while(!q.isEmpty()){
            sb.append(q.poll());
        }
        return sb.toString();
    }

    public static void main(String ... args){
        System.out.println("Hello world.");
        String[] words = new String[]{"wrt","wrf","er","ett","rftt"};
        String order = alienOrder(words);
        System.out.print(order);
    }
}
