package medium;

import java.util.Set;

public class WordBreak {

    //Jiuzhang gives a very good illustration for this problem!
    public boolean wordBreak(String s, Set<String> wordDict) {
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
