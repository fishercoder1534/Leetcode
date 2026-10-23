package com.fishercoder.solutions.firstthousand;

import java.util.ArrayList;
import java.util.List;

public class _17 {

    public static class Solution1 {
        /**
         * This solution is not using backtracking, instead, it's using an iterative/BFS level order traversal strategy.
         */
        public List<String> letterCombinations(String digits) {
            List<String> result = new ArrayList();

            if (digits.isEmpty()) {
                return result;
            }

            String[] digits2Letters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

            result.add(""); // this line is important, otherwise result is empty and Java will default it to an empty String
            for (int i = 0; i < digits.length(); i++) {
                result = combine(digits2Letters[digits.charAt(i) - '0'], result);
            }

            return result;
        }

        List<String> combine(String letters, List<String> result) {
            List<String> newResult = new ArrayList();

            for (int i = 0; i < letters.length(); i++) {
                // the order of the two for loops doesn't matter, you could swap them and it still works.
                for (String str : result) {
                    newResult.add(str + letters.charAt(i));
                }
            }
            return newResult;
        }
    }

    public static class Solution2 {
        /**
         * It's recommended to use recursion to solve this problem, I got this feedback from a Meta interviewer on 6/17/2024 during the mock interview.
         * My completely original solution on 10/11/2021, no backtracking involved: it lacks the core "choose-explore-undo" paradigm that defines backtracking.
         * This is basically a recursive version of the above iterative/BFS strategy.
         */
        public List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();

            if (digits.length() == 0 || digits.equals("")) {
                return ans;
            }

            String[] buttons = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            ans.add("");

            return recursion(ans, buttons, digits, 0);
        }

        private List<String> recursion(List<String> result, String[] buttons, String digits, int index) {
            if (index >= digits.length()) {
                return result;
            }

            List<String> newResult = new ArrayList<>();
            String candidates = buttons[digits.charAt(index) - '0'];

            for (String str : result) {
                for (int i = 0; i < candidates.length(); i++) {
                    newResult.add(str + candidates.charAt(i));
                }
            }
            return recursion(newResult, buttons, digits, index + 1);
        }
    }

    public static class Solution3 {
        /**
         * My completely original solution on 5/9/2022, no backtracking involved or helper method involved.
         */
        public List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();
            if (digits.equals("")) {
                return ans;
            }

            String[] buttons = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            ans.add("");

            for (char c : digits.toCharArray()) {
                String button = buttons[Integer.parseInt(c + "")];
                List<String> newList = new ArrayList<>();
                for (String str : ans) {
                    for (char b : button.toCharArray()) {
                        newList.add(str + b);
                    }
                }
                ans = newList;
            }
            return ans;
        }
    }
}
