package com.fishercoder.solutions;

public class _520 {
    public static class Solution1 {
        public boolean detectCapitalUse(String word) {
            char[] words = word.toCharArray();
            boolean firstLetterCap = false;
            if (Character.isUpperCase(words[0])) {
                firstLetterCap = true;
            }

            if (firstLetterCap) {
                if (words.length >= 2) {
                    int i = 2;
                    if (Character.isUpperCase(words[1])) {
                        //then all following must be all uppercase
                        while (i < words.length) {
                            if (!Character.isUpperCase(words[i])) {
                                return false;
                            }
                            i++;
                        }
                        return true;
                    } else {
                        //then all following must be all lowercase
                        while (i < words.length) {
                            if (!Character.isLowerCase(words[i])) {
                                return false;
                            }
                            i++;
                        }
                        return true;
                    }
                }
                return true;
            } else {
                //then all following must be all lowercase
                int i = 1;
                while (i < words.length) {
                    if (!Character.isLowerCase(words[i])) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
    }
}
