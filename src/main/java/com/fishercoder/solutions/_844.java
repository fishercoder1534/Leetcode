package com.fishercoder.solutions;

public class _844 {
    public static class Solution1 {
        public boolean backspaceCompare(String S, String T) {
            String processedS = process(S);
            String processedT = process(T);
            return processedS.equals(processedT);
        }

        private String process(String str) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '#') {
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                } else {
                    sb.append(str.charAt(i));
                }
            }
            return sb.reverse().toString();
        }
    }
}
