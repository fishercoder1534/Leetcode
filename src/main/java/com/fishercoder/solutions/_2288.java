package com.fishercoder.solutions;

public class _2288 {
    public static class Solution1 {
        public String discountPrices(String sentence, int discount) {
            StringBuilder sb = new StringBuilder();
            String[] words = sentence.split(" ");
            for (String word : words) {
                if (word.charAt(0) == '$') {
                    try {
                        long num = Long.parseLong(word.substring(1));
                        double newNum = Math.round(num * (1 - ((discount * 1.0) / 100)) * 100.00) / 100.00;
                        sb.append("$");
                        sb.append(String.format("%.2f", newNum));
                    } catch (Exception e) {
                        sb.append(word);
                    }
                } else {
                    sb.append(word);
                }
                sb.append(" ");
            }
            return sb.substring(0, sb.length() - 1);
        }
    }
}
