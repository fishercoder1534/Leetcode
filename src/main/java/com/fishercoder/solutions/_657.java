package com.fishercoder.solutions;

/**
 * 657. Judge Route Circle
 *
 * Initially, there is a Robot at position (0, 0).
 * Given a sequence of its moves, judge if this robot makes a circle,
 * which means it moves back to the original place.

 The move sequence is represented by a string.
 And each move is represent by a character.
 The valid robot moves are R (Right), L (Left), U (Up) and D (down).
 The output should be true or false representing whether the robot makes a circle.

 Example 1:
 Input: "UD"
 Output: true

 Example 2:
 Input: "LL"
 Output: false
 */

public class _657 {
    public static class Solution1 {
        public boolean judgeCircle(String moves) {
            int hori = 0;
            int verti = 0;
            for (char c : moves.toCharArray()) {
                if (c == 'U') {
                    verti++;
                } else if (c == 'D') {
                    verti--;
                } else if (c == 'L') {
                    hori--;
                } else if (c == 'R') {
                    hori++;
                }
            }
            return verti == 0 && hori == 0;
        }
    }
}
