package com.fishercoder.solutions;

public class _1528 {
    public static class Solution1 {
        public String restoreString(String s, int[] indices) {
            char[] c = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                int index = findIndex(indices, i);
                c[i] = s.charAt(index);
            }
            return new String(c);
        }

        private static int findIndex(int[] indices, int i) {
            for (int j = 0; j < indices.length; j++) {
                if (indices[j] == i) {
                    return j;
                }
            }
            return 0;
        }
    }
}
