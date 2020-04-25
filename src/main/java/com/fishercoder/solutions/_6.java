package com.fishercoder.solutions;

public class _6 {
	public static class Solution1 {
		public String convert(String s, int numRows) {
			StringBuilder[] sb = new StringBuilder[numRows];
			char[] c = s.toCharArray();
			int len = s.length();
			for (int i = 0; i < numRows; i++) {
				sb[i] = new StringBuilder();//this is an important step to initialize it
			}
			int i = 0;
			while (i < len) {
				for (int index = 0; index < numRows && i < len; index++) {
					sb[index].append(c[i++]);// vertically down
				}

				for (int index = numRows - 2; index >= 1 && i < len; index--) {
					/**Why it should start from numRows - 2? Think of the example when numRows = 3
					 the starting point of obliquely going up is 1, which is numRows-2.*/
					sb[index].append(c[i++]);// obliquely up
				}
			}

			for (i = 1; i < numRows; i++) {
				sb[0].append(sb[i]);
			}
			return sb[0].toString();
		}
	}

}
