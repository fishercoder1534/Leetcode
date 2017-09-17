package com.fishercoder.solutions;

/**
 * 680. Valid Palindrome II
 *
 *  Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

 Example 1:
 Input: "aba"
 Output: True

 Example 2:
 Input: "abca"
 Output: True
 Explanation: You could delete the character 'c'.

 Note:
 The string will only contain lowercase characters a-z. The maximum length of the string is 50000.

 */
public class _680 {
    public static class Solution1 {
        public boolean validPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            int diff = 0;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    left++;
                    diff++;
                    if (diff > 1) {
                        break;
                    }
                } else {
                    left++;
                    right--;
                }
            }
            if (diff < 2) {
                return true;
            }
            diff = 0;
            left = 0;
            right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    right--;
                    diff++;
                    if (diff > 1) {
                        break;
                    }
                } else {
                    left++;
                    right--;
                }
            }
            return diff < 2;
        }
    }

    public static class Solution2 {
        public boolean validPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    return isValid(s, left + 1, right) || isValid(s, left, right - 1);
                }
                left++;
                right--;
            }
            return true;
        }

        private boolean isValid(String s, int left, int right) {
            while (left < right) {
                if (s.charAt(left++) != s.charAt(right--)) {
                    return false;
                }
            }
            return true;
        }
    }
}
