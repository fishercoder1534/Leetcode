package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _345 {
    public static class Solution1 {
        public String reverseVowels(String s) {
            StringBuilder sb = new StringBuilder(s);
            Set<Character> vowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
            //use two pointers approach would be the fastest
            int i = 0;
            int j = s.length() - 1;
            while (i < j) {
                char left = s.charAt(i);
                char right = s.charAt(j);
                while (i < j && !vowels.contains(left)) {
                    i++;
                    left = s.charAt(i);
                }
                while (i < j && !vowels.contains(right)) {
                    j--;
                    right = s.charAt(j);
                }
                char temp = left;
                sb.setCharAt(i, right);
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
            return sb.toString();
        }
    }
}
