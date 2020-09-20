package com.fishercoder.solutions;

public class _1592 {
    public static class Solution1 {
        public String reorderSpaces(String text) {
            int spaceCount = 0;
            for (char c : text.toCharArray()) {
                if (c == ' ') {
                    spaceCount++;
                }
            }
            String[] words = text.trim().split("\\s+");
            if (words.length == 1) {
                StringBuilder sb = new StringBuilder(words[0]);
                for (int i = 0; i < spaceCount; i++) {
                    sb.append(" ");
                }
                return sb.toString();
            }
            int trailingSpaces = spaceCount % (words.length - 1);
            int newSpaces = spaceCount / (words.length - 1);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < words.length; j++) {
                sb.append(words[j]);
                if (j < words.length - 1) {
                    for (int i = 0; i < newSpaces; i++) {
                        sb.append(" ");
                    }
                } else {
                    for (int i = 0; i < trailingSpaces; i++) {
                        sb.append(" ");
                    }
                }
            }
            return sb.toString();
        }
    }
}
