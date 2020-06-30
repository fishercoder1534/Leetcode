package com.fishercoder.solutions;

public class _408 {

    public static class Solution1 {
        public boolean validWordAbbreviation(String word, String abbr) {
            if (abbr.length() > word.length()) {
                return false;
            } else {
                char[] abbrChars = abbr.toCharArray();
                char[] wordChars = word.toCharArray();
                if (abbr.length() == word.length()) {
                    boolean prevDigit = false;
                    for (int i = 0, j = 0; i < abbrChars.length && j < wordChars.length; i++, j++) {
                        if (Character.isDigit(abbrChars[i]) && !prevDigit) {
                            prevDigit = true;
                            if (Character.getNumericValue(abbrChars[i]) != 1) {
                                return false;
                            }
                        } else if (Character.isDigit(abbrChars[i]) && prevDigit) {
                            return false;
                        } else if (abbrChars[i] != wordChars[j]) {
                            return false;
                        } else if (prevDigit) {
                            prevDigit = false;
                        }
                    }
                    return true;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    boolean firstDigit = true;
                    for (int i = 0, j = 0; i < abbrChars.length && j < wordChars.length; i++) {
                        while (i < abbrChars.length && Character.isDigit(abbrChars[i])) {
                            if (firstDigit && Character.getNumericValue(abbrChars[i]) == 0) {
                                return false;
                            }
                            stringBuilder.append(abbrChars[i]);
                            i++;
                            firstDigit = false;
                        }
                        firstDigit = true;
                        if (!stringBuilder.toString().isEmpty()) {
                            int number = Integer.valueOf(stringBuilder.toString());
                            j += number;
                            stringBuilder.setLength(0);
                        }
                        if ((i >= abbrChars.length && j < wordChars.length) || (i < abbrChars.length
                                && j >= wordChars.length)) {
                            return false;
                        }
                        if (i < abbrChars.length
                                && j < wordChars.length
                                && abbrChars[i] != wordChars[j]) {
                            return false;
                        }
                        if (j > wordChars.length && i <= abbrChars.length) {
                            return false;
                        }
                        j++;
                    }
                    return true;
                }
            }
        }
    }
}
