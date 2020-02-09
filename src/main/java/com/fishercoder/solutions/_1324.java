package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * 1324. Print Words Vertically
 *
 * Given a string s. Return all the words vertically in the same order in which they appear in s.
 * Words are returned as a list of strings, complete with spaces when is necessary. (Trailing spaces are not allowed).
 * Each word would be put on only one column and that in one column there will be only one word.
 *
 * Example 1:
 * Input: s = "HOW ARE YOU"
 * Output: ["HAY","ORO","WEU"]
 * Explanation: Each word is printed vertically.
 *  "HAY"
 *  "ORO"
 *  "WEU"
 *
 * Example 2:
 * Input: s = "TO BE OR NOT TO BE"
 * Output: ["TBONTB","OEROOE","   T"]
 * Explanation: Trailing spaces is not allowed.
 * "TBONTB"
 * "OEROOE"
 * "   T"
 *
 * Example 3:
 * Input: s = "CONTEST IS COMING"
 * Output: ["CIC","OSO","N M","T I","E N","S G","T"]
 *
 * Constraints:
 * 1 <= s.length <= 200
 * s contains only upper case English letters.
 * It's guaranteed that there is only one space between 2 words.
 * */
public class _1324 {
    public static class Solution1 {
        public List<String> printVertically(String s) {
            String[] words = s.split(" ");
            int columnMax = 0;
            for (String word : words) {
                columnMax = Math.max(columnMax, word.length());
            }
            char[][] matrix = new char[words.length][columnMax];
            for (int i = 0; i < words.length; i++) {
                int j = 0;
                for (; j < words[i].length(); j++) {
                    matrix[i][j] = words[i].charAt(j);
                }
                while (j < columnMax) {
                    matrix[i][j++] = '#';
                }
            }
            List<String> result = new ArrayList<>();
            for (int j = 0; j < columnMax; j++) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < matrix.length; i++) {
                    if (matrix[i][j] != '#') {
                        sb.append(matrix[i][j]);
                    } else {
                        sb.append(' ');
                    }
                }
                String str = sb.toString();
                int k = str.length() - 1;
                while (k >= 0 && str.charAt(k) == ' ') {
                    k--;
                }
                result.add(str.substring(0, k + 1));
                sb.setLength(0);
            }
            return result;
        }
    }
}
