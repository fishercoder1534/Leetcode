package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.List;

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
