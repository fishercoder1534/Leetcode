package com.fishercoder.solutions;

public class _418 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/62455/21ms-18-lines-java-solution
         * <p>
         * 1. String s = String.join(" ", sentence) + " " ;. This line gives us a formatted sentence to be put to our screen.
         * 2. start is the counter for how many valid characters from s have been put to our screen.
         * 3. if (s.charAt(start % l) == ' ') is the situation that we don't need an extra space for current row. The current row could be successfully fitted. So that we need to increase our counter by using start++.
         * 4. The else is the situation, which the next word can't fit to current row. So that we need to remove extra characters from next word.
         * 5. start / s.length() is (# of valid characters) / our formatted sentence.
         */
        public int wordsTyping(String[] sentence, int rows, int cols) {
            String s = String.join(" ", sentence) + " ";
            int start = 0;
            int l = s.length();
            for (int i = 0; i < rows; i++) {
                start += cols;
                if (s.charAt(start % l) == ' ') {
                    start++;
                } else {
                    while (start > 0 && s.charAt((start - 1) % l) != ' ') {
                        start--;
                    }
                }
            }
            return start / s.length();
        }
    }
}
