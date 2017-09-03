package com.fishercoder.solutions;

/**
 * 670. Maximum Swap
 *
 * Given a non-negative integer, you could swap two digits at most once to get the maximum valued number.
 * Return the maximum valued number you could get.

 Example 1:
 Input: 2736
 Output: 7236
 Explanation: Swap the number 2 and the number 7.

 Example 2:
 Input: 9973
 Output: 9973
 Explanation: No swap.

 Note:
 The given number is in the range [0, 108]

 */
public class _670 {
    public static class Solution1 {
        public int maximumSwap(int num) {
            String numStr = String.valueOf(num);
            int max = num;
            for (int i = 0; i < numStr.length() - 1; i++) {
                for (int j = i + 1; j < numStr.length(); j++) {
                    if (numStr.charAt(i) < numStr.charAt(j)) {
                        StringBuilder sb = new StringBuilder(numStr);
                        sb.replace(i, i + 1, String.valueOf(numStr.charAt(j)));
                        sb.replace(j, j + 1, String.valueOf(numStr.charAt(i)));
                        max = Math.max(max, Integer.parseInt(sb.toString()));
                    }
                }
            }
            return max;
        }
    }
}
