package com.fishercoder.solutions;

public class _1678 {
    public static class Solution1 {
        public String interpret(String command) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < command.length(); i++) {
                if (command.charAt(i) == 'G') {
                    sb.append("G");
                } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                    sb.append("o");
                    i++;
                } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                    sb.append("al");
                    i += 3;
                }
            }
            return sb.toString();
        }
    }
}
