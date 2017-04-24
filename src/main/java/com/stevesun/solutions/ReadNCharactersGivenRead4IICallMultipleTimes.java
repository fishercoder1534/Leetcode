package com.stevesun.solutions;

/**
 * The API: int read4(char *buf) reads 4 characters at a time from a file.

 The return value is the actual number of characters read. For example, it returns 3 if there is only 3 characters left in the file.

 By using the read4 API, implement the function int read(char *buf, int n) that reads n characters from the file.

 Note:
 The read function may be called multiple times.
 */
public class ReadNCharactersGivenRead4IICallMultipleTimes {

	/**
	 * @param buf Destination buffer
	 * @param n   Maximum number of characters to read
	 * @return    The number of characters read
	 */
	private int buffPtr = 0;
	private int buffCnt = 0;
	private char[] buff = new char[4];
	public int read(char[] buf, int n) {
		int ptr = 0;
		while(ptr < n){
			if(buffPtr == 0){
				buffCnt = read4(buff);
			}
			if(buffCnt == 0) break;
			while(ptr < n && buffPtr < buffCnt) {
				buf[ptr++] = buff[buffPtr++];
			}
			if(buffPtr >= buffCnt) buffPtr = 0;
		}
		return ptr;
	}

	//This is a fake method to make IDE happy.
	private int read4(char[] buff) {
		return 1;
	}

}
