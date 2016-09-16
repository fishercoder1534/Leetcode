package chapter5_DynamicProgrammingII;
/**Given two strings, find the longest common subsequence (LCS).

Your code should return the length of LCS.
Example
For "ABCD" and "EDCA", the LCS is "A" (or "D", "C"), return 1.

For "ABCD" and "EACB", the LCS is "AC", return 2.
*/
public class LongestCommonSubsequence {

    /**
     * @param A, B: Two strings.
     * @return: The length of longest common subsequence of A and B.
     */
    public int longestCommonSubsequence(String A, String B) {
        // write your code here
        int m = A.length(), n = B.length();
        int[][] dp = new int[m+1][n+1];
        
        for(int i = 0; i <= m; i++) dp[i][0] = 0;
        
        for(int j = 0; j <= n; j++) dp[0][j] = 0;
        
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                int match = 0;
                if(A.charAt(i-1) == B.charAt(j-1)) match = 1;
                dp[i][j] = Math.max(Math.max(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]+match);
            }
        }
        
        return dp[m][n];
    }

}
