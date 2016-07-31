package easy;

/**Leetcode 70: You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/
public class ClimbingStairs {
    //classical dp problem
    public int climbStairs(int n) {
        if(n < 1) return 0;
        if(n < 4) return n;
        int[] dp = new int[n+1];
        //the number of ways to reach step n could be calculated from n-1 and n-2
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static void main(String... strings) {
        ClimbingStairs test = new ClimbingStairs();
        System.out.println(test.climbStairs(6));
    }
}
