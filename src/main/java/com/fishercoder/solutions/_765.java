package com.fishercoder.solutions;

public class _765 {
    public static class Solution1 {
        public int minSwapsCouples(int[] row) {
            int swaps = 0;
            for (int i = 0; i < row.length - 1; i += 2) {
                int coupleValue = row[i] % 2 == 0 ? row[i] + 1 : row[i] - 1;
                if (row[i + 1] != coupleValue) {
                    swaps++;
                    int coupleIndex = findIndex(row, coupleValue);
                    swap(row, coupleIndex, i + 1);
                }
            }
            return swaps;
        }

        private void swap(int[] row, int i, int j) {
            int tmp = row[i];
            row[i] = row[j];
            row[j] = tmp;
        }

        private int findIndex(int[] row, int value) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] == value) {
                    return i;
                }
            }
            return -1;
        }
    }
}
