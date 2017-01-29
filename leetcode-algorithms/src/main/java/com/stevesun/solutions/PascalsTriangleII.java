package com.stevesun.solutions;
import java.util.*;
/**Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].

 Note:
 Could you optimize your algorithm to use only O(k) extra space?*/
public class PascalsTriangleII {

    public List<Integer> getRow(int rowIndex) {
        if(rowIndex < 0) return new ArrayList();
        List<List<Integer>> result = new ArrayList();
        List<Integer> row = new ArrayList();
        row.add(1);
        result.add(row);
        for(int i = 1; i <= rowIndex; i++){
            List<Integer> newRow = new ArrayList();
            newRow.add(1);
            List<Integer> lastRow = result.get(i-1);
            for(int j = 1; j < lastRow.size(); j++){
                newRow.add(lastRow.get(j-1) + lastRow.get(j));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result.get(result.size()-1);
    }

}
