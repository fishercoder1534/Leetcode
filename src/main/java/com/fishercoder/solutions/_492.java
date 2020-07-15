package com.fishercoder.solutions;

public class _492 {

    public static class Solution1 {
        public int[] constructRectangle(int area) {
            int i = 0;
            int j = area;
            int[] result = new int[2];
            while (i <= j) {
                long product = i * j;
                if (product == area) {
                    result[0] = j--;
                    result[1] = i++;
                } else if (product > area) {
                    j--;
                } else {
                    i++;
                }
            }
            return result;
        }
    }

}
