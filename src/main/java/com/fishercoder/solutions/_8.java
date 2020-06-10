package com.fishercoder.solutions;

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
