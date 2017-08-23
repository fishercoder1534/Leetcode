package com.fishercoder.solutions;

/**
 * The API: int read4(char *buf) reads 4 characters at a time from a file.
 * 
 * The return value is the actual number of characters read. For example, it returns 3 if there is
 * only 3 characters left in the file.
 * 
 * By using the read4 API, implement the function int read(char *buf, int n) that reads n characters
 * from the file.
 * 
 * Note: The read function will only be called once for each test case.
 */

/**
 * The problem description is pretty ambiguous, actually the problem means to Keep reading until
 * either you have gotten n characters or there is no more characters to read.
 */
public class _157 {
    public int read(char[] buf, int n) {
        int index = 0, next = 0;
        char[] buffer = new char[4];
        while (index < n && (next = read4(buffer)) != 0) {
            for (int i = 0; i < next && index < n; index++, i++) {
                buf[index] = buffer[i];
            }
        }
        return index;
    }

    private int read4(char[] buffer) {
        //this is a fake method to make Eclipse happy
        return 0;
    }
}
