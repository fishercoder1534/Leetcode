package com.fishercoder.solutions;

/**
 * 418. Sentence Screen Fitting
 *
 * Given a rows x cols screen and a sentence represented by a list of non-empty words, find how many times the given sentence can be fitted on the screen.

 Note:

 A word cannot be split into two lines.
 The order of words in the sentence must remain unchanged.
 Two consecutive words in a line must be separated by a single space.
 Total words in the sentence won't exceed 100.
 Length of each word is greater than 0 and won't exceed 10.
 1 ≤ rows, cols ≤ 20,000.

 Example 1:

 Input:
 rows = 2, cols = 8, sentence = ["hello", "world"]

 Output:
 1

 Explanation:
 hello---
 world---

 The character '-' signifies an empty space on the screen.

 Example 2:

 Input:
 rows = 3, cols = 6, sentence = ["a", "bcd", "e"]

 Output:
 2

 Explanation:
 a-bcd-
 e-a---
 bcd-e-

 The character '-' signifies an empty space on the screen.

 Example 3:

 Input:
 rows = 4, cols = 5, sentence = ["I", "had", "apple", "pie"]

 Output:
 1

 Explanation:
 I-had
 apple
 pie-I
 had--

 The character '-' signifies an empty space on the screen.

 */
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
