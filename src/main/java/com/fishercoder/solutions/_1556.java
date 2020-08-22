package com.fishercoder.solutions;

public class _1556 {
    public static class Solution1 {
        public String thousandSeparator(int n) {
            String str = Integer.toString(n);
            StringBuilder sb = new StringBuilder();
            for (int i = str.length() - 1, j = 1; i >= 0; i--, j++) {
                sb.append(str.charAt(i));
                j++;
                if (j % 3 == 0) {
                    sb.append(".");
                }
            }
            String result = sb.reverse().toString();
            if (result.charAt(0) == '.') {
                result = result.substring(1);
            }
            return result;
        }
    }
}
