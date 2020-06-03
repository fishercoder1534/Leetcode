package com.fishercoder.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

public class _316 {
    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/32259/java-solution-using-stack-with-comments/2
         */
        public String removeDuplicateLetters(String s) {
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

    public static class Solution2 {
        /**
         * Credit: https://discuss.leetcode.com/topic/31404/a-short-o-n-recursive-greedy-solution
         */
        public String removeDuplicateLetters(String s) {
            int[] count = new int[26];
            int pos = 0; // the position for the smallest s[i]
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < s.charAt(pos)) {
                    pos = i;
                }
                count[s.charAt(i) - 'a']--;
                if (count[s.charAt(i) - 'a'] == 0) {
                    break;
                }
            }
            return s.length() == 0 ? "" : s.charAt(pos) + removeDuplicateLetters(
                    s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));
        }
    }
}
