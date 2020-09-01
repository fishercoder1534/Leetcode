package com.fishercoder.solutions;

public class _158 {

    public static class Solution1 {
        /**
         * @param buf Destination buffer
         * @param n   Maximum number of characters to read
         * @return The number of characters read
         */
        private int buffPtr = 0;
        private int buffCnt = 0;
        private char[] buff = new char[4];

        public int read(char[] buf, int n) {
            int ptr = 0;
            while (ptr < n) {
                if (buffPtr == 0) {
                    buffCnt = read4(buff);
                }
                if (buffCnt == 0) {
                    break;
                }
                while (ptr < n && buffPtr < buffCnt) {
                    buf[ptr++] = buff[buffPtr++];
                }
                if (buffPtr >= buffCnt) {
                    buffPtr = 0;
                }
            }
            return ptr;
        }

        //This is a fake method to make IDE happy.
        private int read4(char[] buff) {
            return 1;
        }
    }
}
