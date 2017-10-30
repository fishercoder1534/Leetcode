package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number
 *
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.

 Input:Digit string "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

 Note:
 Although the above answer is in lexicographical order, your answer could be in any order you want.
 */

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
