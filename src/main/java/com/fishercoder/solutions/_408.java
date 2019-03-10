package com.fishercoder.solutions;

/**
 * 408. Valid Word Abbreviation
 *
 * Given a non-empty string s and an abbreviation abbr,
 * return whether the string matches with the given abbreviation.
 * A string such as "word" contains only the following valid abbreviations:

 ["word", "1ord", "w1rd", "wo1d", "wor1", "2rd", "w2d", "wo2", "1o1d", "1or1", "w1r1", "1o2", "2r1", "3d", "w3", "4"]
 Notice that only the above abbreviations are valid abbreviations of the string "word".
 Any other string is not a valid abbreviation of "word".

 Note:
 Assume s contains only lowercase letters and abbr contains only lowercase letters and digits.

 Example 1:
 Given s = "internationalization", abbr = "i12iz4n":

 Return true.
 Example 2:
 Given s = "apple", abbr = "a2e":

 Return false.
 */
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
