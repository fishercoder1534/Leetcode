package com.fishercoder.solutions;

/**
 * 383 Ransom Note
 *
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if
 * the ransom note can be constructed from the magazines ; otherwise, it will return false.
 * Each letter in the magazine string can only be used once in your ransom note.

 Note:

 You may assume that both strings contain only lowercase letters.
 canConstruct("a", "b") -> false
 canConstruct("aa", "ab") -> false
 canConstruct("aa", "aab") -> true
*/
public class _383 {

    public static class Solution1 {
        public boolean canConstruct(String ransomNote, String magazine) {
            char[] mchars = magazine.toCharArray();
            int[] mcnt = new int[256];
            for (int i = 0; i < mchars.length; i++) {
                mcnt[mchars[i] - 'a']++;
            }

            char[] rchars = ransomNote.toCharArray();
            for (int i = 0; i < rchars.length; i++) {
                if (mcnt[rchars[i] - 'a'] <= 0) {
                    return false;
                }
                mcnt[rchars[i] - 'a']--;
            }
            return true;
        }
    }

}