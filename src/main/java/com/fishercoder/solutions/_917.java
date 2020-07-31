package com.fishercoder.solutions;

public class _917 {
    public static class Solution1 {
        public String reverseOnlyLetters(String S) {
            char[] array = S.toCharArray();
            for (int i = 0, j = array.length - 1; i < j; ) {
                if (Character.isLetter(array[i]) && Character.isLetter(array[j])) {
                    char temp = array[i];
                    array[i++] = array[j];
                    array[j--] = temp;
                } else if (Character.isLetter(array[i])) {
                    j--;
                } else if (Character.isLetter(array[j])) {
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
            return new String(array);
        }
    }
}
