package com.fishercoder.solutions;

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