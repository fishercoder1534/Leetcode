package com.stevesun.solutions;

public class PalindromePartitioningII {
    /**This solution is cooler than Jiuzhang: https://discuss.leetcode.com/topic/32575/easiest-java-dp-solution-97-36*/
    
    //cut[i] stands for the minimum number of cut needed to cut [0, i] into palindromes
    //we initiazlie cut[i] with its max possible value which is i, this is because a single char is naturally a palindrome, so, we'll cut this string into all single-char substrings, which is the max cuts needed
    
    //dp[j][i] == true stands for s.substring(j,i) is a palindrome
    
    public int minCut(String s) {
        int n = s.length();
        char[] c = s.toCharArray();
        boolean[][] dp = new boolean[n][n];
        int[] cut = new int[n];
        
        for(int i = 0; i < n; i++){
            cut[i] = i;
            for(int j = 0; j <= i; j++){
                if(c[i] == c[j] && (j+1 > i-1 || dp[j+1][i-1])){
                    dp[j][i] = true;
                    if(j == 0){
                        cut[i] = 0;
                    } else {
                        cut[i] = (cut[i] < cut[j-1]+1) ? cut[i] : cut[j-1]+1;
                    }
                }
            }
        }
        
        return cut[n-1];
    }
}
