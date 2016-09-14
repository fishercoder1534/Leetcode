package medium;

import java.util.Set;

public class WordBreak {

    //Jiuzhang gives a very good illustration for this problem!

    public boolean wordBreak(String s, Set<String> wordDict) {
        int maxLen = Integer.MIN_VALUE;
        for(String word : wordDict){
            maxLen = (word.length() > maxLen) ? word.length() : maxLen;
        }
        
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i && j <= maxLen; j++){
                if(!dp[i-j]) continue;
                
                String sub = s.substring(i-j, i);
                if(wordDict.contains(sub)){
                    dp[i] = true;
                    break;
                }
            }
        }
        
        return dp[n];
    }

}
