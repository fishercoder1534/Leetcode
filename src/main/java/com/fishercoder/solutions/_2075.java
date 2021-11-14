package com.fishercoder.solutions;

public class _2075 {
    public static class Solution1 {
        public String decodeCiphertext(String encodedText, int rows) {
            if (rows == 1) {
                return encodedText;
            }
            int total = encodedText.length();
            int cols = total / rows;
            char[][] grid = new char[rows][cols];
            int index = 0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    grid[i][j] = encodedText.charAt(index++);
                }
            }
            StringBuilder sb = new StringBuilder();
            int colIndex = 0;
            while (colIndex < cols) {
                for (int j = colIndex, i = 0; j < cols && i < rows; j++, i++) {
                    sb.append(grid[i][j]);
                }
                colIndex++;
            }
            int i = sb.length() - 1;
            while (i >= 0 && sb.charAt(i) == ' ') {
                i--;
            }
            return sb.substring(0, i + 1);
        }
    }
}
