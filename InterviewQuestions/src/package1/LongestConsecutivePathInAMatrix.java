package package1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import utils.CommonUtils;

public class LongestConsecutivePathInAMatrix {
    
    final int[] dirs = new int[]{0, 1, 0, -1, 0};

    public int[] longestConsecutivePath(int[][] grid){
        List<Integer> resultList = new ArrayList();
        Map<Integer, List<Integer>> map = new HashMap();
        if(grid == null || grid.length == 0) return new int[]{};
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                List<Integer> thisList = dfs(grid, i, j, map);
                if(thisList.size() > resultList.size()){
                    resultList.clear();
                    resultList.addAll(thisList);
                }
            }
        }
        int[] result = new int[resultList.size()];
        for(int i = 0; i < resultList.size(); i++){
            result[i] = resultList.get(i);
        }
        return result;
    }

    private List<Integer> dfs(int[][] grid, int row, int col, Map<Integer, List<Integer>> map) {
        if(map.containsKey(grid[row][col])) return map.get(grid[row][col]);
        List<Integer> thisList = new ArrayList();
        thisList.add(grid[row][col]);
        List<Integer> max = new ArrayList();
        for(int i = 0; i < 4; i++){
            int nextRow = row+dirs[i];
            int nextCol = col+dirs[i+1];
            if(nextRow < 0 || nextRow >= grid.length || nextCol < 0 || nextCol >= grid[0].length || grid[nextRow][nextCol]-1 != grid[row][col]) continue;
            if(grid[nextRow][nextCol]-1 == grid[row][col]){
                List<Integer> nextList = dfs(grid, nextRow, nextCol, map);
                if(!nextList.isEmpty() && max.size() < nextList.size()) {
                    max.clear();
                    max.addAll(nextList);
                }
            }
        }
        thisList.addAll(max);
        map.put(grid[row][col], thisList);
        return thisList;
    }
    
    public static void main(String...args){
        LongestConsecutivePathInAMatrix test = new LongestConsecutivePathInAMatrix();
//        int[][] grid = new int[][]{
//                {1,  2, 13,  5},
//                {11, 10,  9,  6},
//                 {3,  4,  8,  7},
//                {12, 14, 15, 16},
//        };
        
        int[][] grid = new int[][]{
                {2,  3},
                {1, 4},
        };
        int[] result = test.longestConsecutivePath(grid);
        CommonUtils.printArray(result);
    }
}
