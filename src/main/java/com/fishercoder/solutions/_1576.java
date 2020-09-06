package com.fishercoder.solutions;

public class _1576 {
    public static class Solution1 {
        /**
         * Each char could have at most two neighbors, so we only need to toggle between three character candidates to avoid repetition.
         */
        public String modifyString(String s) {
            char[] arr = s.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '?') {
                    for (int j = 0; j < 3; j++) {
                        if (i > 0 && arr[i - 1] == 'a' + j) {
                            continue;
                        } else if (i < arr.length - 1 && arr[i + 1] == 'a' + j) {
                            continue;
                        } else {
                            arr[i] = (char) ('a' + j);
                            break;
                        }
                    }
                }
            }
            return String.valueOf(arr);
        }

    }
}
