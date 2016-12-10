package stevesun.algorithms;

import stevesun.common.utils.CommonUtils;

/**174. Dungeon Game

    Total Accepted: 27313
    Total Submissions: 125827
    Difficulty: Hard

The demons had captured the princess (P) and imprisoned her in the bottom-right corner of a dungeon. The dungeon consists of M x N rooms laid out in a 2D grid. Our valiant knight (K) was initially positioned in the top-left room and must fight his way through the dungeon to rescue the princess.

The knight has an initial health point represented by a positive integer. If at any point his health point drops to 0 or below, he dies immediately.

Some of the rooms are guarded by demons, so the knight loses health (negative integers) upon entering these rooms; other rooms are either empty (0's) or contain magic orbs that increase the knight's health (positive integers).

In order to reach the princess as quickly as possible, the knight decides to move only rightward or downward in each step.

Write a function to determine the knight's minimum initial health so that he is able to rescue the princess.

For example, given the dungeon below, the initial health of the knight must be at least 7 if he follows the optimal path RIGHT-> RIGHT -> DOWN -> DOWN.
-2 (K)  -3  3
-5  -10     1
10  30  -5 (P)

Notes:

    The knight's health has no upper bound.
    Any room can contain threats or power-ups, even the first room the knight enters and the bottom-right room where the princess is imprisoned.

Credits:
Special thanks to @stellari for adding this problem and creating all test cases.*/
public class DungeonGame {
    
    /**This problem should fill the dp matrix from bottom right.*/
    public int calculateMinimumHP(int[][] dungeon) {
        if(dungeon == null || dungeon.length == 0) return 0;
        
        int height = dungeon.length, width = dungeon[0].length;
        int[][] dp = new int[height][width];
        dp[height-1][width-1] = (dungeon[height-1][width-1] > 0) ? 1 : 1-dungeon[height-1][width-1];

        //fill the last column
        for(int i = height-2; i >= 0; i--){
            int temp = dp[i+1][width-1] - dungeon[i][width-1];
            dp[i][width-1] = Math.max(1, temp);
        }

        //fill the last row
        for(int j = width-2; j >= 0; j--){
            int temp = dp[height-1][j+1] - dungeon[height-1][j];
            dp[height-1][j] = Math.max(temp, 1);
        }
        
        for(int i = height-2; i >= 0; i--){
            for(int j = width -2; j >= 0; j--){
                int down = Math.max(1, dp[i+1][j] - dungeon[i][j]);
                int right = Math.max(1, dp[i][j+1] - dungeon[i][j]);
                dp[i][j] = Math.min(down, right);
            }
        }
        
        CommonUtils.printMatrix(dp);
        return dp[0][0];
    }

    
    public static void main(String...strings){
        DungeonGame test = new DungeonGame();
//        int[][] dungeon = new int[1][1];
//        dungeon[0][0] = 0;
        
//        int[][] dungeon = new int[1][1];
//        dungeon[0][0] = -200;
        
//        int[][] dungeon = new int[1][2];
//        dungeon[0][0] = 0;
//        dungeon[0][1] = -3;
        
//        int[][] dungeon = new int[2][1];
//        dungeon[0][0] = -3;
//        dungeon[1][0] = -7;
        
        int[][] dungeon = new int[2][1];
        dungeon[0][0] = 2;
        dungeon[1][0] = 1;
        
//        int[][] dungeon = new int[1][2];
//        dungeon[0][0] = -3;
//        dungeon[0][1] = 5;
        
//        int[][] dungeon = new int[2][2];
//        dungeon[0][0] = 2;
//        dungeon[0][1] = 1;
//        dungeon[1][0] = 1;
//        dungeon[1][1] = -1;
        
//        int[][] dungeon = new int[1][2];
//        dungeon[0][0] = 0;
//        dungeon[0][1] = 0;
        
//        int[][] dungeon = new int[2][1];
//        dungeon[0][0] = 0;
//        dungeon[1][0] = 0;
        
//        int[][] dungeon = new int[3][3];
//        dungeon[0][0] = -2;
//        dungeon[0][1] = -3;
//        dungeon[0][2] = 3;
//        dungeon[1][0] = -5;
//        dungeon[1][1] = -10;
//        dungeon[1][2] = 1;
//        dungeon[2][0] = 10;
//        dungeon[2][1] = 30;
//        dungeon[2][2] = -5;
        
//        int[][] dungeon = new int[2][3];
//        dungeon[0][0] = 0;
//        dungeon[0][1] = 0;
//        dungeon[0][2] = 0;
//        dungeon[1][0] = 1;
//        dungeon[1][1] = 1;
//        dungeon[1][2] = -1;
        CommonUtils.printMatrix(dungeon);
        System.out.println(test.calculateMinimumHP(dungeon));
    }
    
    public int calculateMinimumHP_attemp2_failed(int[][] dungeon) {
        if(dungeon == null || dungeon.length == 0) return 0;
        
        int height = dungeon.length, width = dungeon[0].length;
        int[][] dp = new int[height][width];
        dp[0][0] = dungeon[0][0] > 0 ? 1 : 1-dungeon[0][0];
        
        //fill the first column
        for(int i = 1; i < height; i++){
            dp[i][0] = dungeon[i][0] >= 0 ? dp[i-1][0] : -dungeon[i][0]+dp[i-1][0];
        }
        
        //fill the first row
        for(int j = 1; j < width; j++){
            dp[0][j] = dungeon[0][j] >= 0 ? dp[0][j-1] : -dungeon[0][j]+dp[0][j-1];
        }
        
        for(int i = 1; i < height; i++){
            for(int j = 1; j < width; j++){
                dp[i][j] = dungeon[i][j] >= 0 ? Math.min(dp[i][j-1], dp[i-1][j]) : -dungeon[i][j]+Math.min(dp[i][j-1], dp[i-1][j]);
            }
        }
        
        CommonUtils.printMatrix(dp);
        return dp[height-1][width-1];
    }
}
