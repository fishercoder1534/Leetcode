package com.fishercoder.solutions;

public class _481 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/74917/simple-java-solution-using-one-array-and-two-pointers
         * Algorithm:
         * <p>
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
