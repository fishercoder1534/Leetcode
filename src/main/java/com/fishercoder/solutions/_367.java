package com.fishercoder.solutions;

/**
 * 367. Valid Perfect Square
 *
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

 Note: Do not use any built-in library function such as sqrt.

 Example 1:

 Input: 16
 Returns: True
 Example 2:

 Input: 14
 Returns: False
 */
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
