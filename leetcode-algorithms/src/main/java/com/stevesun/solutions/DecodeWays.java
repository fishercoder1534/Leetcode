package com.stevesun.solutions;
import  java.util.*;
/**
 * Created by fishercoder1534 on 10/3/16.
 */
public class DecodeWays {
    /**Then I found this post is very concise: https://discuss.leetcode.com/topic/35840/java-clean-dp-solution-with-explanation*/
    public static int numDecodings_solution2(String s) {
        if(s == null || s.length() == 0) return 0;
        int[] dp = new int[s.length()+1];
        dp[0] = 1;
        dp[1] = (s.charAt(0) != '0') ? 1 : 0;
        for(int i = 2; i <= s.length(); i++){
            int first = Integer.valueOf(s.substring(i-1,i));
            int second = Integer.valueOf(s.substring(i-2, i));
            if(first > 0 && first <= 9) dp[i] += dp[i-1];
            if(second >= 10 && second <= 26) dp[i] += dp[i-2];
        }
        return dp[s.length()];
    }


    /**My original accepted yet lengthy solution.*/
    public static int numDecodings_solution1(String s) {

        if(s == null || s.length() == 0) return 0;
        Set<String> validStrings = new HashSet();
        validStrings.add("1");
        validStrings.add("2");
        validStrings.add("3");
        validStrings.add("4");
        validStrings.add("5");
        validStrings.add("6");
        validStrings.add("7");
        validStrings.add("8");
        validStrings.add("9");
        validStrings.add("10");
        validStrings.add("11");
        validStrings.add("12");
        validStrings.add("13");
        validStrings.add("14");
        validStrings.add("15");
        validStrings.add("16");
        validStrings.add("17");
        validStrings.add("18");
        validStrings.add("19");
        validStrings.add("20");
        validStrings.add("21");
        validStrings.add("22");
        validStrings.add("23");
        validStrings.add("24");
        validStrings.add("25");
        validStrings.add("26");

        int n = s.length();
        int[] dp = new int[n];
        if(validStrings.contains(s.substring(0,1))) dp[0] = 1;
        else dp[0] = 0;

        for(int i = 1; i < n; i++){
            if(validStrings.contains(s.substring(i,i+1)) && validStrings.contains(s.substring(i-1,i+1))) {
                if(i > 1){
                    dp[i] = dp[i-2] + dp[i-1];
                } else {
                    dp[1] = 2;
                }
            } else if(!validStrings.contains(s.substring(i,i+1)) && !validStrings.contains(s.substring(i-1,i+1))){
                return 0;
            } else if(!validStrings.contains(s.substring(i,i+1)) && validStrings.contains(s.substring(i-1,i+1))){
                if(i > 1) dp[i] = dp[i-2];
                else dp[i] = dp[i-1];
            }
            else dp[i] = dp[i-1];
        }

        return dp[n-1];

    }

    public static void main(String...args){
        String msg = "100";

    }
}
