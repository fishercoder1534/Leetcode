package com.fishercoder.solutions.fourththousand;

import java.util.HashSet;
import java.util.Set;

public class _3941 {
    public static class Solution1 {
        public int passwordStrength(String password) {
            Set<Character> used = new HashSet<>();
            int strength = 0;
            for (char c : password.toCharArray()) {
                if (used.add(c)) {
                    if (Character.isDigit(c)) {
                        strength += 3;
                    } else if (Character.isLowerCase(c)) {
                        strength += 1;
                    } else if (Character.isUpperCase(c)) {
                        strength += 2;
                    } else {
                        strength += 5;
                    }
                }
            }
            return strength;
        }
    }
}
