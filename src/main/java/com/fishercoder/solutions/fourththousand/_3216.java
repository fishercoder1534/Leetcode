package com.fishercoder.solutions.fourththousand;

public class _3216 {
    public static class Solution1 {
        public String getSmallestString(String s) {
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) > s.charAt(i + 1) && sameParity(s.charAt(i), s.charAt(i + 1))) {
                    char[] charArray = s.toCharArray();
                    char tmp = charArray[i];
                    charArray[i] = charArray[i + 1];
                    charArray[i + 1] = tmp;
                    return new String(charArray);
                }
            }
            return s;
        }

        private boolean sameParity(char c1, char c2) {
            int num1 = Integer.parseInt(c1 + "");
            int num2 = Integer.parseInt(c2 + "");
            if (num2 % 2 == 0 && num1 % 2 == 0 || (num2 % 2 == 1 && num1 % 2 == 1)) {
                return true;
            }
            return false;
        }
    }
}
