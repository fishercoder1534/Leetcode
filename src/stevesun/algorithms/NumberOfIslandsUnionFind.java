package stevesun.algorithms;

/**
 * Created by fishercoder1534 on 9/30/16.
 */

//Inspired by this post: https://discuss.leetcode.com/topic/39980/1d-union-find-java-solution-easily-generalized-to-other-problems
public class NumberOfIslandsUnionFind {

    class UnionFind{
        int count;
        int m, n;
        int[] ids;

        public UnionFind(char[][] grid){
            m = grid.length;
            n = grid[0].length;
            ids = new int[m*n];
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n; j++){
                    if(grid[i][j] == '1') {
                        count++;
                        ids[i*n+j] = i*n+j;
                    }
                }
            }
        }

        public void union(int i, int j){
            int x = find(ids, i);
            int y = find(ids, j);
            if(x != y) {//note: this is when x != y, only in this case, we should union these two nodes, which makes sense naturally.
                count--;
                ids[x] = y;
            }
        }

        public int find(int[] ids, int i){
            if(ids[i] == i) return i;
            return find(ids, ids[i]);
        }
    }

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int[] dirs = new int[]{0,1,0,-1,0};
        UnionFind uf = new UnionFind(grid);
        int m = grid.length, n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    for(int k = 0; k < 4; k++){
                        int x = i+dirs[k];
                        int y = j+dirs[k+1];
                        if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == '1'){
                            int id1 = i*n+j;
                            int id2 = x*n+y;
                            uf.union(id1, id2);
                        }
                    }
                }
            }
        }
        return uf.count;
    }
}
