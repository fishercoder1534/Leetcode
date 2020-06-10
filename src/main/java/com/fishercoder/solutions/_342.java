package com.fishercoder.solutions;

public class _342 {
    public static class Solution1 {
        //Just dive a little bit deeper, you can realize that another important feature of a number
        //that is power of four is that its only single one bit must appear on the odd position, and power of two won't meet this requirement
        //decimal number 8 has binary format: 0000-0000-0000-0000-0000-0000-0000-1000
        //decimal number 16 has binary format: 0000-0000-0000-0000-0000-0000-0001-0000
        //hex number 0x55555555 has binary format: 1010-1010-1010-1010-1010-1010-1010-1010
        //thus, doing AND with 0x55555 will check if the only one bit is located on the odd position, thus ruling out those that are power of 2 but not power of 4
        public boolean isPowerOfFour(int num) {
            return (num > 0 && 1073741824 % num == 0 && (num & 0x55555555) != 0);
        }
    }

    public static class Solution2 {
        public boolean isPowerOfFour(int num) {
            //^ means to match the beginning of a line
            //$ means to match the end of a line
            //* means zero or more of the preceding character
            return Integer.toString(num, 4).matches("^10*$");
        }
    }

    public static class Solution3 {
        //a regular loop method to make it AC'ed
        public boolean isPowerOfFour(int num) {
            if (num < 4 && num != 1) {
                return false;
            }
            while (num != 1) {
                if (num % 4 != 0) {
                    return false;
                }
                num /= 4;
            }
            return true;
        }
    }

}
