package stevesun.algorithms;

import java.util.Set;

public class WordBreak {

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
