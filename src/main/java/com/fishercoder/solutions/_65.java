package com.fishercoder.solutions;

public class _65 {
    /**
     * credit: https://discuss.leetcode.com/topic/9490/clear-java-solution-with-ifs
     */
    public static class Solution1 {
        public boolean isNumber(String s) {
            s = s.trim();

            boolean pointSeen = false;
            boolean eSeen = false;
            boolean numberSeen = false;
            boolean numberAfterE = true;
            for (int i = 0; i < s.length(); i++) {
                if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                    numberSeen = true;
                    numberAfterE = true;
                } else if (s.charAt(i) == '.') {
                    if (eSeen || pointSeen) {
                        return false;
                    }
                    pointSeen = true;
                } else if (s.charAt(i) == 'e') {
                    if (eSeen || !numberSeen) {
                        return false;
                    }
                    numberAfterE = false;
                    eSeen = true;
                } else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                    if (i != 0 && s.charAt(i - 1) != 'e') {
                        return false;
                    }
                } else {
                    return false;
                }
            }

            return numberSeen && numberAfterE;
        }
    }

    public static class Solution2 {
        /**
         * credit: https://discuss.leetcode.com/topic/2973/java-solution-with-one-line
         */
        public boolean isNumber(String s) {
            return s.matches("(\\s*)[+-]?((\\.[0-9]+)|([0-9]+(\\.[0-9]*)?))(e[+-]?[0-9]+)?(\\s*)");
        }
    }
}
