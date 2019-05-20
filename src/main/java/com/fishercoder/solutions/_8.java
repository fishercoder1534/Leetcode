package com.fishercoder.solutions;

/**
 * 8. String to Integer (atoi)
 *
 * Implement atoi to convert a string to an integer.
 *
 * Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 *
 * Requirements for atoi:
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found.
 * Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * If the first sequence of non-whitespace characters in str is not a valid integral number,
 * or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 * If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.*/

public class _8 {

	public static class Solution1 {
		/**
		 * four corner cases:
		 * 1. discards all leading zeroes
		 * 2. sign of the number
		 * 3. overflow
		 * 4. invalid input
		 * */
		public int myAtoi(String str) {
			int pointer = 0;
			int result = 0;
			while (pointer < str.length() && Character.isWhitespace(str.charAt(pointer))) {
				pointer++;
			}
			if (pointer == str.length()) {
				return 0;
			}
			boolean negativeFlag = (str.charAt(pointer) == '-');
			if (str.charAt(pointer) == '+' || str.charAt(pointer) == '-') {
				pointer++;
			}
			for (; pointer < str.length(); pointer++) {
				if (str.charAt(pointer) > '9' || str.charAt(pointer) < '0') {
					break;
				} else {
					int digit = str.charAt(pointer) - '0';
					if (!negativeFlag && result > (Integer.MAX_VALUE - digit) / 10) {
						return Integer.MAX_VALUE;
					} else if (negativeFlag && result < (Integer.MIN_VALUE + digit) / 10) {
						return Integer.MIN_VALUE;
					}
					result = result * 10 + (negativeFlag ? -digit : digit);
				}
			}
			return result;
		}
	}

}
