package com.fishercoder.solutions;

/**
 * 481. Magical String
 *
 * A magical string S consists of only '1' and '2' and obeys the following rules:

 The string S is magical because concatenating the number of contiguous occurrences of characters '1' and '2' generates the string S itself.

 The first few elements of string S is the following: S = "1221121221221121122……"

 If we group the consecutive '1's and '2's in S, it will be:

 1 22 11 2 1 22 1 22 11 2 11 22 ......

 and the occurrences of '1's or '2's in each group are:

 1 2	2 1 1 2 1 2 2 1 2 2 ......

 You can see that the occurrence sequence above is the S itself.

 Given an integer N as input, return the number of '1's in the first N number in the magical string S.

 Note: N will not exceed 100,000.

 Example 1:
 Input: 6
 Output: 3
 Explanation: The first 6 elements of magical string S is "12211" and it contains three 1's, so return 3.
 */
public class _481 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/74917/simple-java-solution-using-one-array-and-two-pointers
         * Algorithm:
         *
         * 1. Create an int array a and initialize the first 3 elements with 1, 2, 2.
         * 2. Create two pointers head and tail. head points to the number which will be used to generate new numbers.
         * tail points to the next empty position to put the new number. Then keep generating new numbers until tail >= n.
         * 3. Need to create the array 1 element more than n to avoid overflow because the last round head might points to a number 2.
         * 4. A trick to flip number back and forth between 1 and 2: num = num ^ 3
         */
        public int magicalString(int n) {
            if (n <= 0) {
                return 0;
            }
            if (n <= 3) {
                return 1;
            }

            int[] a = new int[n + 1];
            a[0] = 1;
            a[1] = 2;
            a[2] = 2;

            int head = 2;
            int tail = 3;
            int num = 1;
            int result = 1;

            while (tail < n) {
                for (int i = 0; i < a[head]; i++) {
                    a[tail] = num;
                    if (num == 1 && tail < n) {
                        result++;
                    }
                    tail++;
                }
                num = num ^ 3;
                head++;
            }

            return result;
        }
    }

}
