package com.fishercoder.solutions;

public class _367 {

    public static class Solution1 {
        public boolean isPerfectSquare(int num) {
            long i = 1;
            long temp = 1;
            while (temp < num) {
                i += 2;
                temp += i;
            }
            return temp == num;
        }
    }
}
