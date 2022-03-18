package com.fishercoder.solutions;

import java.util.*;

// same as 316. Remove Duplicate Letters
// from https://github.com/fishercoder1534/Leetcode/blob/master/src/main/java/com/fishercoder/solutions/_316.java

public class _1002 {
    public class Solution1 {
        public String smallestSubsequence(String s) {
            int[] res = new int[26]; //will contain number of occurences of character (i+'a')
            boolean[] visited =
                    new boolean[26]; //will contain if character (i+'a') is present in current result Stack
                    char[] ch = s.toCharArray();
            for (char c : ch) {  //count number of occurences of character
                res[c - 'a']++;
            }
            Deque<Character> st = new ArrayDeque<>(); // answer stack
            int index;
            for (char c : ch) {
                index = c - 'a';
                res[index]--;   //decrement number of characters remaining in the string to be analysed
                if (visited[index]) {
                    //if character is already present in stack, dont bother
                    continue;
                }
                //if current character is smaller than last character in stack which occurs later in the string again
                //it can be removed and  added later e.g stack = bc remaining string abc then a can pop b and then c
                while (!st.isEmpty() && c < st.peek() && res[st.peek() - 'a'] != 0) {
                    visited[st.pop() - 'a'] = false;
                }
                st.push(c); //add current character and mark it as visited
                visited[index] = true;
            }

            StringBuilder sb = new StringBuilder();
            //pop character from stack and build answer string from back
            while (!st.isEmpty()) {
                sb.insert(0, st.pop());
            }
            return sb.toString();
        }
    }
}
