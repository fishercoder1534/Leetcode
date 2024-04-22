package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1138 {
    public static class Solution1 {
        public String alphabetBoardPath(String target) {
            Map<Character, int[]> map = initMap();
            StringBuilder sb = new StringBuilder();
            int[] currPos = new int[2];
            for (char c : target.toCharArray()) {
                moveToDest(currPos, map.get(c), sb);
            }
            return sb.toString();
        }

        private void moveToDest(int[] currPos, int[] dest, StringBuilder sb) {
            int currRow = currPos[0];
            int currCol = currPos[1];
            int destRow = dest[0];
            int destCol = dest[1];
            while (currRow != destRow || currCol != destCol) {
                if (currRow < destRow) {
                    while (currRow < destRow) {
                        if (currCol != 0 && currRow == 4) {
                            break;
                        }
                        sb.append("D");
                        currRow++;
                    }
                    currPos[0] = currRow;
                }
                if (currRow > destRow) {
                    while (currRow > destRow) {
                        sb.append("U");
                        currRow--;
                    }
                    currPos[0] = currRow;
                }
                if (currCol < destCol) {
                    while (currCol < destCol) {
                        sb.append("R");
                        currCol++;
                    }
                    currPos[1] = currCol;
                }
                if (currCol > destCol) {
                    while (currCol > destCol) {
                        sb.append("L");
                        currCol--;
                    }
                    currPos[1] = currCol;
                }
            }
            sb.append("!");
            return;
        }

        private Map<Character, int[]> initMap() {
            Map<Character, int[]> map = new HashMap<>();
            int row;
            int col;
            int number = 0;
            for (char c = 'a'; c <= 'z'; c++, number++) {
                row = number / 5;
                col = number % 5;
                map.put(c, new int[]{row, col});
            }
            return map;
        }
    }
}
