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
         * My completely original solution on 10/11/2021.
         * This is basically a recursive version of the above iterative/BFS strategy.
         * <p>
         * <p>
         * Why this is Backtracking (The "Hidden" Choose-Explore-Undo)
         * <p>
         * The code actually does have the "choose-explore-undo" paradigm, but it relies on immutable string copying instead of an explicit pop() or delete step:
         * • Choose: The loop picks a character candidates.charAt(i) and chooses it by concatenating it to an existing string: str + candidates.charAt(i).
         * • Explore: It passes the newly generated strings (newResult) down into the next recursive call to process the remaining digits.
         * • Undo: Because Java strings are immutable, creating str + candidates.charAt(i) does not modify the original prefix str. When the loop finishes processing one character and moves to the next index i + 1, the original str is still intact. This loop increment is the implicit "undo" step.
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
         * My completely original solution on 5/9/2022, this is technically also backtracking:
         * The "Undo" Step: In recursive backtracking, you undo a choice explicitly via a remove() or pop() step.
         * In this iterative version, the "undoing" and "moving to the next option" is handled automatically by
         * the inner loops transitioning from one character ('d') to the next ('e') without modifying the original prefix (str).
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

    public static class Solution4 {
        /**
         * Backtracking solution by Gemini, beats 100% on LeetCode submissions.
         * Time Complexity: O(N * 4^N)
         * - Where N is the length of the input digits string.
         * - In the worst-case scenario (digits like 7 or 9 mapping to 4 letters),
         * every digit presents up to 4 choices, leading to at most 4^N leaves.
         * - For each valid combination, converting the path to a String takes O(N) time.
         * - Note: This is commonly simplified in interviews to O(4^N) to emphasize exponential growth.
         * <p>
         * Space Complexity: O(N)
         * - Highly memory efficient compared to iterative BFS approaches.
         * - Recursion Stack: Maximum depth of the recursive call stack is O(N).
         * - State Tracking: The StringBuilder path strictly grows to a max length of N characters, taking O(N) space.
         * - (Excludes the final output list space, which is standard interviewing practice).
         */
        public List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();

            // Base case for empty input
            if (digits == null || digits.isEmpty()) {
                return ans;
            }

            String[] buttons = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

            // Kick off the backtracking with index 0 and an empty tracking path
            backtrack(ans, new StringBuilder(), buttons, digits, 0);

            return ans;
        }

        private void backtrack(List<String> ans, StringBuilder path, String[] buttons, String digits, int index) {
            // BASE CASE: If the path length matches digits length, we found a valid combination
            if (index == digits.length()) {
                ans.add(path.toString());
                return;
            }

            // Get the letters corresponding to the current digit
            String letters = buttons[digits.charAt(index) - '0'];

            // Loop through all candidate choices for this position
            for (int i = 0; i < letters.length(); i++) {
                char letter = letters.charAt(i);

                // 1. CHOOSE: Add the candidate to our current path
                path.append(letter);

                // 2. EXPLORE: Move deeper down the tree to the next index
                backtrack(ans, path, buttons, digits, index + 1);

                // 3. UNDO: Remove the last letter to reset state for the next loop iteration
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
}
