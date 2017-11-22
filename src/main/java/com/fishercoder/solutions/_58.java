package com.fishercoder.solutions;
/**
 * 58. Length of Last Word
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * If the last word does not exist, return 0.

 Note: A word is defined as a character sequence consists of non-space characters only.

 For example,
 Given s = "Hello World",
 return 5.

 */
public class _58 {

    public static class Solution1 {
        public int lengthOfLastWord(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            s = s.trim();
            int n = s.length() - 1;
            while (n >= 0 && s.charAt(n) != ' ') {
                n--;
            }
            return s.length() - n - 1;
        }
    }

}
