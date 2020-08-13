package com.fishercoder.solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _1271 {
    public static class Solution1 {
        public String toHexspeak(String num) {
            long numInt = Long.parseLong(num);
            String hexString = Long.toHexString(numInt);
            StringBuilder sb = new StringBuilder();
            Set<Character> set = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', '1', '0', 'a', 'b', 'c', 'd', 'e', 'f'));
            for (char c : hexString.toCharArray()) {
                if (!set.contains(c)) {
                    return "ERROR";
                } else if (c == '1') {
                    sb.append("I");
                } else if (c == '0') {
                    sb.append("O");
                } else {
                    sb.append(Character.toUpperCase(c));
                }
            }
            return sb.toString();
        }
    }
}
