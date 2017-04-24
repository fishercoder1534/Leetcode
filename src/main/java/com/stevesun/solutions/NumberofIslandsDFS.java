package com.stevesun.solutions;

/**
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 Example 1:

 11110
 11010
 11000
 00000
 Answer: 1

 Example 2:

 11000
 11000
 00100
 00011
 Answer: 3
 */
public class NumberofIslandsDFS {


    public static int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int count = 0;
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j, m, n);
                }
            }
        }
        return count;
    }

    static void dfs(char[][] grid, int i, int j, int m, int n){
        if(i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == '0') return;
        grid[i][j] = '0';
        dfs(grid, i+1, j, m, n);
        dfs(grid, i, j+1, m, n);
        dfs(grid, i-1, j, m, n);
        dfs(grid, i, j-1, m, n);
    }


    public static void main(String...args){
//        char[][] grid = new char[][]{
//                {'1','1','1','1','0'},
//                {'1','1','0','1','0'},
//                {'1','1','0','0','0'},
//                {'0','0','0','0','0'},
//        };

//        ["11000","11000","00100","00011"]
//        char[][] grid = new char[][]{
//                {'1','1','0','0','0'},
//                {'1','1','0','0','0'},
//                {'0','0','1','0','0'},
//                {'0','0','0','1','1'},
//        };

//        ["111","010","111"]
        //doing normal row by row and column by column scan will fail by this test case:
        //when encountering grid[2][0], grid[2][1] hasn't been marked to '#' yet, so, it'll count grid[2][0] as a new island, which
        //in fact it is not!
        //So, we must apply DFS, so how does Union Find work?
        char[][] grid = new char[][]{
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'},
        };
        System.out.println(numIslands(grid));
    }
}
