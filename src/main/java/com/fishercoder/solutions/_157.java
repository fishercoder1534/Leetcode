package com.fishercoder.solutions;

public class _157 {
    public static class Solution1 {
        public int read(char[] buf, int n) {
            int index = 0;
            int next = 0;
            char[] buffer = new char[4];
            while (index < n && (next = read4(buffer)) != 0) {
                for (int i = 0; i < next && index < n; index++, i++) {
                    buf[index] = buffer[i];
                }
            }
            return index;
        }

        private int read4(char[] buffer) {
            //this is a dummy method to make it compile
            return 0;
        }
    }
}
