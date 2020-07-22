package com.fishercoder.solutions;

public class _758 {
    public static class Solution1 {
        /**
         * Interestingly, this problem is exactly the same as 616, using 616's code could get it AC'ed.
         */
        public String boldWords(String[] words, String S) {
            boolean[] shouldBold = new boolean[S.length()];
            for (int i = 0, end = 0; i < S.length(); i++) {
                for (String word : words) {
                    if (S.startsWith(word, i)) {
                        end = Math.max(end, i + word.length());
                    }
                }
                shouldBold[i] = end > i;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                if (!shouldBold[i]) {
                    stringBuilder.append(S.charAt(i));
                    continue;
                }
                int j = i;
                while (j < S.length() && shouldBold[j]) {
                    j++;
                }
                stringBuilder.append("<b>" + S.substring(i, j) + "</b>");
                i = j - 1;
            }
            return stringBuilder.toString();
        }
    }
}
