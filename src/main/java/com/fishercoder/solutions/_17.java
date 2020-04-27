package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

public class _17 {

    public static class Solution1 {
        public List<String> letterCombinations(String digits) {
            List<String> result = new ArrayList();
            if (digits.length() == 0) {
                return result;
            }

            String[] digits2Letters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

            result.add("");//this line is important, otherwise result is empty and Java will default it to an empty String
            for (int i = 0; i < digits.length(); i++) {
                result = combine(digits2Letters[digits.charAt(i) - '0'], result);
            }

            return result;
        }

        List<String> combine(String letters, List<String> result) {
            List<String> newResult = new ArrayList();

            for (int i = 0; i < letters.length(); i++) {
                //the order of the two for loops doesn't matter, you could swap them and it still works.
                for (String str : result) {
                    newResult.add(str + letters.charAt(i));
                }
            }
            return newResult;
        }
    }
}
