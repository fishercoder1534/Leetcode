package com.fishercoder.solutions.secondthousand;

public class _1844 {
    public static class Solution1 {
        public String replaceDigits(String s) {
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (Character.isAlphabetic(c)) {
                    sb.append(c);
                } else {
                    sb.append((char) (sb.charAt(sb.length() - 1) + Character.getNumericValue(c)));
                }
            }
            return sb.toString();
        }
    }

    public static class Solution2 {
        public String replaceDigits(String s) {
            char[] inpArr = s.toCharArray();
            for (int i = 1; i < inpArr.length; i += 2) {
                inpArr[i] = (char) (inpArr[i - 1] + inpArr[i] - '0');
            }
            return String.valueOf(inpArr);
        }
    }
}
