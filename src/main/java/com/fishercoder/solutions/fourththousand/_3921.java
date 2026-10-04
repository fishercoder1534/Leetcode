package com.fishercoder.solutions.fourththousand;

public class _3921 {
    public static class Solution1 {
        public int[] scoreValidator(String[] events) {
            int[] result = new int[2];
            for (String event : events) {
                if (event.equals("W")) {
                    result[1]++;
                    if (result[1] == 10) {
                        return result;
                    }
                } else {
                    if (event.equals("WD") || event.equals("NB")) {
                        result[0]++;
                    } else {
                        result[0] += Integer.parseInt(event);
                    }
                }
            }
            return result;
        }
    }
}
