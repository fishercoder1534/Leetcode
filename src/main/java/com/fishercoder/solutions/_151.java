package com.fishercoder.solutions;

import com.fishercoder.common.utils.CommonUtils;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 151. Reverse Words in a String
 * Given an input string, reverse the string word by word.
For example,
Given s = "the sky is blue",
return "blue is sky the".

 Clarification:
 What constitutes a word?
 A sequence of non-space characters constitutes a word.
 Could the input string contain leading or trailing spaces?
 Yes. However, your reversed string should not contain leading or trailing spaces.
 How about multiple spaces between two words?
 Reduce them to a single space in the reversed string.

 */

public class _151 {

    public String reverseWords(String s) {
        s.trim();
        if (s == null || s.length() == 0) return "";
        String[] words = s.split(" ");
        if (words == null || words.length == 0) return "";
        Deque<String> stack = new ArrayDeque<>();
        for (String word : words) {
            if (!word.equals("")) {
                stack.offer(word);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pollLast()).append(" ");
        }
        return stringBuilder.substring(0, stringBuilder.length()-1).toString();
    }

    public static void main(String... args) {
        /**This main program is to demo:
         * a string that contains consecutive empty spaces when splitting by delimiter " ",
         * it'll produce a an "" as an element.*/
        String s = "a b  c";
        String[] strs = s.split(" ");
        CommonUtils.printArray_generic_type(strs);
    }
}
