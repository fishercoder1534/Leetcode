package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. Find Common Characters
 *
 * Given an array A of strings made only from lowercase letters,
 * return a list of all characters that show up in all strings within the list (including duplicates).
 * For example, if a character occurs 3 times in all strings but not 4 times, you need to include that character three times in the final answer.
 *
 * You may return the answer in any order.
 *
 * Example 1:
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 *
 * Example 2:
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 *
 * Note:
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] is a lowercase letter
 */
public class _1002 {
    public static class Solution1 {
        public List<String> commonChars(String[] A) {
            int[][] charCount = new int[A.length][26];
            for (int i = 0; i < A.length; i++) {
                for (char c : A[i].toCharArray()) {
                    charCount[i][c - 'a']++;
                }
            }
            List<String> result = new ArrayList<>();
            for (int i = 0; i < 26; i++) {
                while (charCount[0][i] != 0) {
                    char c = (char) (i + 'a');
                    boolean valid = true;
                    charCount[0][i]--;
                    for (int j = 1; j < A.length; j++) {
                        if (charCount[j][i] == 0) {
                            valid = false;
                            break;
                        } else {
                            charCount[j][i]--;
                        }
                    }
                    if (!valid) {
                        break;
                    } else {
                        result.add("" + c);
                    }
                }
            }
            return result;
        }
    }
}
