package com.fishercoder.solutions;

public class _326 {
    public static class Solution1 {
        //regular method that has a loop
        public boolean isPowerOfThree(int n) {
            if (n < 3 && n != 1) {
                return false;
            }
            while (n != 1) {
                if (n % 3 != 0) {
                    return false;
                }
                n /= 3;
            }
            return true;
        }
    }

    public static class Solution2 {
        //find the max possible integer that is a power of 3, then do modulor with this number
        public boolean isPowerOfThree(int n) {
            return (n > 0 && 1162261467 % n == 0);
        }
    }

    public static class Solution3 {
        //Editorial solution: it's pretty elegant to use base conversion which can be easily extended to any radix k
        //Idea: for a number in base 10, if it's power of 10, then it must be in this format: 10, 100, 1000... with a leading one and all trailing zeros
        //similarly, if a number is power of 3, then in its base 3 format, it must be in this format as well: 10, 100, 1000, 1000...
        //some Java built-in function could help us along the way:
        public boolean isPowerOfThree(int n) {
            return Integer.toString(n, 3).matches("^10*$");
        }
    }

}