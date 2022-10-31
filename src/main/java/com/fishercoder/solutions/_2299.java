package com.fishercoder.solutions;

import java.util.HashSet;
import java.util.Set;

public class _2299 {
    public static class Solution1 {
        public boolean strongPasswordCheckerII(String password) {
            if (password.length() < 8) {
                return false;
            }
            boolean hasLower = false;
            boolean hasUpper = false;
            boolean hasDigit = false;
            boolean hasSpecialChar = false;
            Set<Character> specialChars = new HashSet<>();
            specialChars.add('!');
            specialChars.add('@');
            specialChars.add('%');
            specialChars.add('^');
            specialChars.add('&');
            specialChars.add('*');
            specialChars.add('(');
            specialChars.add(')');
            specialChars.add('-');
            specialChars.add('+');
            specialChars.add('$');
            specialChars.add('#');
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLowerCase(password.charAt(i))) {
                    hasLower = true;
                }
                if (Character.isUpperCase(password.charAt(i))) {
                    hasUpper = true;
                }
                if (Character.isDigit(password.charAt(i))) {
                    hasDigit = true;
                }
                if (specialChars.contains(password.charAt(i))) {
                    hasSpecialChar = true;
                }
                if (i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                    return false;
                }
            }
            return hasLower && hasUpper && hasDigit && hasSpecialChar;
        }
    }
}
