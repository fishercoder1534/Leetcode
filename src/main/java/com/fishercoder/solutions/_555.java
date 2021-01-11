package com.fishercoder.solutions;

public class _555 {

    public static class Solution1 {
        /**
         * credit: https://discuss.leetcode.com/topic/86477/neat-java-solution
         * and article: https://leetcode.com/articles/split-assembled-strings/#approach-3-optimized-solution-accepted
         */
        public String splitLoopedString(String[] strs) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < strs.length; i++) {
                sb.setLength(0);
                String reverse = sb.append(strs[i]).reverse().toString();
                if (strs[i].compareTo(reverse) < 0) {
                    strs[i] = reverse;
                }
            }
            String result = "";
            for (int i = 0; i < strs.length; i++) {
                sb.setLength(0);
                String reverse = sb.append(strs[i]).reverse().toString();
                for (String str : new String[]{strs[i], reverse}) {
                    for (int k = 0; k < str.length(); k++) {
                        sb.setLength(0);
                        sb.append(str.substring(k));
                        for (int j = i + 1; j < strs.length; j++) {
                            sb.append(strs[j]);
                        }
                        for (int j = 0; j < i; j++) {
                            sb.append(strs[j]);
                        }
                        sb.append(str.substring(0, k));
                        if (sb.toString().compareTo(result) > 0) {
                            result = sb.toString();
                        }
                    }
                }
            }
            return result;
        }
    }
}
