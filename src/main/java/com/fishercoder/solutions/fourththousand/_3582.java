package com.fishercoder.solutions.fourththousand;

public class _3582 {
    public static class Solution1 {
        public String generateTag(String caption) {
            String[] words = caption.trim().split(" ");
            StringBuilder sb = new StringBuilder();
            sb.append('#');
            for (int i = 0; i < words.length; i++) {
                for (int j = 0; j < words[i].length() && sb.length() < 100; j++) {
                    if (i == 0) {
                        sb.append(Character.toLowerCase(words[i].charAt(j)));
                    } else {
                        if (j == 0) {
                            sb.append(Character.toUpperCase(words[i].charAt(j)));
                        } else {
                            sb.append(Character.toLowerCase(words[i].charAt(j)));
                        }
                    }
                }
            }
            return sb.toString();
        }
    }
}
