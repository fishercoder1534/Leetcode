package com.fishercoder.solutions;
import  java.util.*;
/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:

 'A' -> 1
 'B' -> 2
 ...
 'Z' -> 26
 Given an encoded message containing digits, determine the total number of ways to decode it.

 For example,
 Given encoded message "12", it could be decoded as "AB" (1 2) or "L" (12).

 The number of ways decoding "12" is 2.
 */
public class _91 {
    /**Credit: https://discuss.leetcode.com/topic/35840/java-clean-dp-solution-with-explanation
     * I used a dp array of size n + 1 to save subproblem solutions.
     * dp[0] means an empty string will have one way to decode,
     * dp[1] means the way to decode a string of size 1.
     *
     * I then check one digit and two digit combination and save the results along the way.
     * In the end, dp[n] will be the end result.*/

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

    public static void main(String...args){
        String msg = "100";
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

}
