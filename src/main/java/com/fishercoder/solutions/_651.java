package com.fishercoder.solutions;

/**
 * 651. 4 Keys Keyboard
 *
 * Imagine you have a special keyboard with the following keys:

 Key 1: (A): Prints one 'A' on screen.

 Key 2: (Ctrl-A): Select the whole screen.

 Key 3: (Ctrl-C): Copy selection to buffer.

 Key 4: (Ctrl-V): Print buffer on screen appending it after what has already been printed.

 Now, you can only press the keyboard for N times (with the above four keys), find out the maximum numbers of 'A' you can print on screen.

 Example 1:
 Input: N = 3
 Output: 3
 Explanation:
 We can at most get 3 A's on screen by pressing following key sequence:
 A, A, A

 Example 2:
 Input: N = 7
 Output: 9
 Explanation:
 We can at most get 9 A's on screen by pressing following key sequence:
 A, A, A, Ctrl A, Ctrl C, Ctrl V, Ctrl V

 Note:
 1 <= N <= 50
 Answers will be in the range of 32-bit signed integer.
 */
public class _651 {

    public static class Solution1 {
        /**
         * Minimum needs to be more than 3 A's in a row, otherwise "Ctrl A, Ctrl C, Ctrl V" will make fewer A's than directly
         * copying A's with the equal number of steps.
         * E.g. when n == 5,
         * if we do 5 this: A, A, Ctrl A, Ctrl C, Ctrl V, => this will result in only AAAA (4 A's)
         * while if we do A, A, A, A, A, => this will result in AAAAA (5 A's)
         * So, at a minimum, we need to have 3 A's, then it's worth to do "Ctrl A, Ctrl C, Ctrl V"..
         * That's why we have j = 3 in the inner for loop below.
         */
        public int maxA(int N) {
            int[] dp = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                dp[i] = i;
                for (int j = 3; j < i; j++) {
                    dp[i] = Math.max(dp[i], dp[i - j] * (j - 1));
                }
            }
            return dp[N];
        }
    }

}
