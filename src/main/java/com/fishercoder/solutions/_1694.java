package com.fishercoder.solutions;

public class _1694 {
    public static class Solution1 {
        public String reformatNumber(String number) {
            StringBuilder sb = new StringBuilder();
            for (char c : number.toCharArray()) {
                if (Character.isDigit(c)) {
                    sb.append(c);
                }
            }
            String cleaned = sb.toString();
            sb.setLength(0);
            for (int i = 0; i < cleaned.length(); ) {
                if (i + 4 == cleaned.length()) {
                    sb.append(cleaned.substring(i, i + 2));
                    sb.append("-");
                    sb.append(cleaned.substring(i + 2));
                    break;
                } else if (i + 3 <= cleaned.length()) {
                    sb.append(cleaned.substring(i, i + 3));
                    sb.append("-");
                    i += 3;
                } else {
                    sb.append(cleaned.substring(i));
                    break;
                }
            }
            if (sb.charAt(sb.length() - 1) == '-') {
                sb.setLength(sb.length() - 1);
            }
            return sb.toString();
        }
    }
}
