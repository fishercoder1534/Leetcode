package com.fishercoder.solutions;

/**
 * 917. Reverse Only Letters
 *
 * Given a string S, return the "reversed" string where all characters
 * that are not a letter stay in the same place, and all letters reverse their positions.
 *
 * Example 1:
 *
 * Input: "ab-cd"
 * Output: "dc-ba"
 * Example 2:
 *
 * Input: "a-bC-dEf-ghIj"
 * Output: "j-Ih-gfE-dCba"
 * Example 3:
 *
 * Input: "Test1ng-Leet=code-Q!"
 * Output: "Qedo1ct-eeLg=ntse-T!"
 *
 *
 * Note:
 *
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S doesn't contain \ or "
 * */
public class _917 {
    public static class Solution1 {
        public String reverseOnlyLetters(String S) {
            char[] array = S.toCharArray();
            for (int i = 0, j = array.length - 1; i < j;) {
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
