package com.fishercoder.solutions;


import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
 ]

 */
public class _118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        int len = 1;
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList(len);
            row.add(1);
            if (i > 0) {
                List<Integer> lastRow = result.get(i - 1);
                for (int j = 1; j < len; j++) {
                    if (j < lastRow.size()) {
                        row.add(lastRow.get(j - 1) + lastRow.get(j));
                    }
                }
                row.add(1);
            }
            result.add(row);
            len++;
        }
        return result;
    }
}
