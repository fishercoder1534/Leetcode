package com.fishercoder.solutions;

/**
 * 650. 2 Keys Keyboard
 *
 * Initially on a notepad only one character 'A' is present. You can perform two operations on this notepad for each step:

 Copy All: You can copy all the characters present on the notepad (partial copy is not allowed).
 Paste: You can paste the characters which are copied last time.
 Given a number n. You have to get exactly n 'A' on the notepad by performing the minimum number of steps permitted. Output the minimum number of steps to get n 'A'.

 Example 1:
 Input: 3
 Output: 3

 Explanation:
 Intitally, we have one character 'A'.
 In step 1, we use Copy All operation.
 In step 2, we use Paste operation to get 'AA'.
 In step 3, we use Paste operation to get 'AAA'.

 Note:
 The n will be in the range [1, 1000].
 */
public class _650 {

    public static class Solution1 {
        public int minSteps(int n) {
            int[] dp = new int[n + 1];
            for (int i = 2; i <= n; i++) {
                dp[i] = i;//we assign i to dp[i] first, because for a lot of cases, e.g. for most cases when i is odd, its min steps is i itself, if it's not, we can overwrite it later
                for (int j = i - 1; j > 1; j--) {
                    //traverse backwards, whenever it's divisible by j, we'll update dp[i] because it's guaranteed to be smaller when j is smaller.
                    if (i % j == 0) {
                        dp[i] = dp[j] + (i / j);
                        break;
                    }
                }
            }
            return dp[n];
        }
    }
}
