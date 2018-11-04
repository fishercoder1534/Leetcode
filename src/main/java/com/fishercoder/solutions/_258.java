package com.fishercoder.solutions;

public class _258 {

    public static class Solution1 {
        //only three cases as the code shows
        public int addDigits(int num) {
            if (num == 0) {
                return 0;
            }
            if (num % 9 == 0) {
                return 9;
            }
            return num % 9;
        }
    }
}
