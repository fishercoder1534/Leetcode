package com.fishercoder.solutions;

/**
 * 5. Longest Palindromic Substring
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

 Example:
 Input: "babad"
 Output: "bab"
 Note: "aba" is also a valid answer.

 Example:
 Input: "cbbd"
 Output: "bb"
 */
public class _5 {
 public int getPalindromeLength(String str){
        // 1.构造新的字符串
        // 为了避免奇数回文和偶数回文的不同处理问题，在原字符串中插入'#'，将所有回文变成奇数回文
        StringBuilder newStr = new StringBuilder();
        newStr.append('#');
        for (int i = 0; i < str.length(); i ++) {
            newStr.append(str.charAt(i));
            newStr.append('#');
        }

        // rad[i]表示以i为中心的回文的最大半径，i至少为1，即该字符本身
        int [] rad = new int[newStr.length()];
        // right表示已知的回文中，最右的边界的坐标
        int right = -1;
        // id表示已知的回文中，拥有最右边界的回文的中点坐标
        int id = -1;
        // 2.计算所有的rad
        // 这个算法是O(n)的，因为right只会随着里层while的迭代而增长，不会减少。
        for (int i = 0; i < newStr.length(); i ++) {
            // 2.1.确定一个最小的半径
            int r = 1;
            if (i <= right) {
                r = Math.min(rad[id] - i + id, rad[2 * id - i]);
            }
            // 2.2.尝试更大的半径
            while (i - r >= 0 && i + r < newStr.length() && newStr.charAt(i - r) == newStr.charAt(i + r)) {
                r++;
            }
            // 2.3.更新边界和回文中心坐标
            if (i + r - 1> right) {
                right = i + r - 1;
                id = i;
            }
            rad[i] = r;
        }

        // 3.扫描一遍rad数组，找出最大的半径
        int maxLength = 0;
        for (int r : rad) {
            if (r > maxLength) {
                maxLength = r;
            }
        }
        return maxLength - 1;
    }

    public static class Solution1 {
        private int low;
        private int maxLen;

        public String longestPalindrome(String s) {
            int len = s.length();
            if (len < 2) {
                return s;
            }

            for (int i = 0; i < len - 1; i++) {
                extendPalindrome(s, i, i); // assume odd length, try to extend Palindrome as possible
                extendPalindrome(s, i, i + 1); // assume even length.
            }
            return s.substring(low, low + maxLen);
        }

        private void extendPalindrome(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (maxLen < right - left - 1) {
                low = left + 1;
                maxLen = right - left - 1;
            }
        }
    }
}
