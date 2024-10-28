package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3274 {
    public static class Solution1 {
        public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
            return isBlack(coordinate2) == isBlack(coordinate1);
        }

        private boolean isBlack(String coordinate) {
            Set<Character> blackColsWithOddRows = new HashSet<>();
            blackColsWithOddRows.add('a');
            blackColsWithOddRows.add('c');
            blackColsWithOddRows.add('e');
            blackColsWithOddRows.add('g');
            if (blackColsWithOddRows.contains(coordinate.charAt(0))) {
                return Character.getNumericValue(coordinate.charAt(1)) % 2 == 1;
            } else {
                return Character.getNumericValue(coordinate.charAt(1)) % 2 == 0;
            }
        }
    }
}
