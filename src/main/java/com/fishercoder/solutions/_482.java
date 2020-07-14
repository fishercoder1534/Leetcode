package com.fishercoder.solutions;

public class _482 {
    public static class Solution1 {
        public String licenseKeyFormatting(String S, int K) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] SChars = S.toCharArray();
            for (int i = S.length() - 1, j = 0; i >= 0; ) {
                if (j < K) {
                    if (SChars[i] != '-') {
                        if (SChars[i] >= 'a' && SChars[i] <= 'z') {
                            stringBuilder.append(Character.toUpperCase(SChars[i]));
                        } else {
                            stringBuilder.append(SChars[i]);
                        }
                        j++;
                    }
                    i--;
                } else if (j == K) {
                    j = 0;
                    stringBuilder.append('-');
                }
            }
            if (stringBuilder.length() > 1 && stringBuilder.substring(stringBuilder.length() - 1).equals("-")) {
                return stringBuilder.reverse().substring(1);
            }
            return stringBuilder.reverse().toString();
        }
    }
}
