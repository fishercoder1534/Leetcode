package com.stevesun.solutions;

import java.util.Set;

/**Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words. You may assume the dictionary does not contain duplicate words.

 For example, given
 s = "leetcode",
 dict = ["leet", "code"].

 Return true because "leetcode" can be segmented as "leet code".

 UPDATE (2017/1/4):
 The wordDict parameter had been changed to a list of strings (instead of a set of strings). Please reload the code definition to get the latest changes.*/
public class _139 {

    //Jiuzhang gives a very good illustration for this problem!

    public boolean wordBreak_2ms(String s, Set<String> wordDict) {
        int maxLen = Integer.MIN_VALUE;
        for(String word : wordDict){
            maxLen = (word.length() > maxLen) ? word.length() : maxLen;
        }
        
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i = 1; i <= n; i++){
            for(int lastWordLength = 1; lastWordLength <= i && lastWordLength <= maxLen; lastWordLength++){
                if(!dp[i-lastWordLength]) continue;
                
                String sub = s.substring(i-lastWordLength, i);
                if(wordDict.contains(sub)){
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n];
    }
    

    //this is much slower, although AC'ed on Leetcode, TLE on Lintcode.
    //This is because in the inner for loop, this method is looping from left to right which is unnecessary, we only need to find the
    //right-most true element, then check that substring. That's why we could write wordBreak_2ms() above.
    public boolean wordBreak_14ms(String s, Set<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                if(!dp[j]) continue;
                
                String sub = s.substring(j, i);
                if(wordDict.contains(sub)){
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n];
    }


}
