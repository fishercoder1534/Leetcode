package com.fishercoder.solutions;

import java.util.*;

/**
 * 533. Lonely Pixel II
 *
 * Given a picture consisting of black and white pixels, and a positive integer N,
 * find the number of black pixels located at some specific row R and column C that align with all the following rules:

 Row R and column C both contain exactly N black pixels.
 For all rows that have a black pixel at column C, they should be exactly the same as row R
 The picture is represented by a 2D char array consisting of 'B' and 'W', which means black and white pixels respectively.

 Example:
 Input:
 [['W', 'B', 'W', 'B', 'B', 'W'],
 ['W', 'B', 'W', 'B', 'B', 'W'],
 ['W', 'B', 'W', 'B', 'B', 'W'],
 ['W', 'W', 'B', 'W', 'B', 'W']]

 N = 3
 Output: 6
 Explanation: All the bold 'B' are the black pixels we need (all 'B's at column 1 and 3).
         0    1    2    3    4    5         column index
 0    [['W', 'B', 'W', 'B', 'B', 'W'],
 1     ['W', 'B', 'W', 'B', 'B', 'W'],
 2     ['W', 'B', 'W', 'B', 'B', 'W'],
 3     ['W', 'W', 'B', 'W', 'B', 'W']]
 row index

 Take 'B' at row R = 0 and column C = 1 as an example:
 Rule 1, row R = 0 and column C = 1 both have exactly N = 3 black pixels.
 Rule 2, the rows have black pixel at column C = 1 are row 0, row 1 and row 2. They are exactly the same as row R = 0.

 Note:
 The range of width and height of the input 2D array is [1,200].
 */
public class _533 {

    public int findBlackPixel(char[][] picture, int N) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        int m = picture.length;
        int n = picture[0].length;
        for (int i = 0; i < m; i++) {
            int blackPixelRowCount = 0;
            for (int j = 0; j < n; j++) {
                if (picture[i][j] == 'B') blackPixelRowCount++;
            }
            if (blackPixelRowCount == N) rows.add(i);
        }

        for (int j = 0; j < n; j++) {
            int blackPixelColCount = 0;
            for (int i = 0; i < m; i++) {
                if (picture[i][j] == 'B') blackPixelColCount++;
            }
            if (blackPixelColCount == N) cols.add(j);
        }

        if (!cols.isEmpty()) {
            Iterator<Integer> colIterator = cols.iterator();
            int colNumber = colIterator.next();
            Iterator<Integer> rowIterator = rows.iterator();
            int compareRowNumber = -1;
            Set<Integer> rowsThatHaveBlackAtThisCol = new HashSet<>();
            boolean firstTime = true;
            while (rowIterator.hasNext()) {
                int rowNumber = rowIterator.next();
                if (picture[rowNumber][colNumber] == 'B' && firstTime) {
                    compareRowNumber = rowNumber;
                    firstTime = false;
                } else if (picture[rowNumber][colNumber] == 'B') {
                    rowsThatHaveBlackAtThisCol.add(rowNumber);
                }
            }
            if (compareRowNumber == -1) return 0;
            List<Integer> candidateRows = new ArrayList<>();
            Iterator<Integer> iterator = rowsThatHaveBlackAtThisCol.iterator();
            while (iterator.hasNext()) {
                int row = iterator.next();
                if (Arrays.equals(picture[row], picture[compareRowNumber])){
                    candidateRows.add(row);
                }
            }
            if (candidateRows.size() == 0) return 0;

            candidateRows.add(compareRowNumber);

            colIterator = cols.iterator();
            int result = 0;
            for (int i = 0; i < candidateRows.size(); i++) {
                for (int j = 0; j < n; j++) {
                    if (cols.contains(j) && picture[i][j] == 'B') {
                        result++;
                    }
                }
            }
            return result;
        }
        return 0;
    }

}
