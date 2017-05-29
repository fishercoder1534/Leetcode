package com.fishercoder.solutions;

public class DistinctSubsequences {
    /**This is a typical DP problem, illustrated in Jiuzhang.
     * 
     * I've drawn out the 2d matrix on the whiteboard:
     * 
     * 1. initialize a 2d matrix of size (m+1)*(n+1)
     * 2. initialize row 0, it should be 1,0,0,0,0... this is because when S is an empty string, only when T is empty, it could be a subsequence
     * 3. initialize column 0, it should be 1,1,1,1,1,1...
     * 4. starting from (1,1)*/

    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        int[][] dp = new int[m+1][n+1];
        
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        
        for(int i = 0; i <= m; i++) dp[i][0] = 1;
        
        for(int j = 1; j <= n; j++) dp[0][j] = 0;
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(schar[i-1] == tchar[j-1]) dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
                else dp[i][j] = dp[i-1][j];
            }
        }
        
        return dp[m][n];
    }

}
