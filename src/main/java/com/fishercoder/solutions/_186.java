package com.fishercoder.solutions;

public class _186 {
    public static class Solution1 {
        public void reverseWords(char[] s) {
            // Three steps to reverse
            // 1, reverse the whole sentence
            reverse(s, 0, s.length - 1);
            // 2, reverse each word
            int start = 0;
            for (int i = 0; i < s.length; i++) {
                if (s[i] == ' ') {
                    reverse(s, start, i - 1);
                    start = i + 1;
                }
            }
            // 3, reverse the last word, if there is only one word this will solve the corner case
            reverse(s, start, s.length - 1);
        }

        private void reverse(char[] s, int start, int end) {
            while (start < end) {
                char temp = s[start];
                s[start++] = s[end];
                s[end--] = temp;
            }
        }
    }

    public static class Solution2 {
        public void reverseWords(char[] s) {
            reverse(s, 0, s.length);
            for (int i = 0; i < s.length; i++) {
                int start = i;
                while (i < s.length && s[i] != ' ') {
                    i++;
                }
                reverse(s, start, i);
            }
        }

        private void reverse(char[] chars, int start, int end) {
            int left = start;
            int right = end - 1;
            while (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
        }
    }

}
