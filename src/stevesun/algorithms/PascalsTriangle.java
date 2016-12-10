package stevesun.algorithms;
import java.util.*;

public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        if(numRows < 1) return result;
        List<Integer> row = new ArrayList();
        row.add(1);
        result.add(row);
        for(int i = 1; i < numRows; i++){
            List<Integer> newRow = new ArrayList();
            newRow.add(1);
            List<Integer> lastRow = result.get(i-1);
            for(int j = 1; j < lastRow.size(); j++){
                newRow.add(lastRow.get(j-1) + lastRow.get(j));
            }
            newRow.add(1);
            result.add(newRow);
        }
        return result;
    }

    public static void main(String...strings){
        int numRows = 2;
        generate(numRows);
    }
}
