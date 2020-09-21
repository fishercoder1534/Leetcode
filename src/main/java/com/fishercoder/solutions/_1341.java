package com.fishercoder.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1341 {
    public static class Solution1 {
        public int[] kWeakestRows(int[][] mat, int k) {
            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < mat.length; i++) {
                int soldiers = 0;
                for (int j = 0; j < mat[0].length; j++) {
                    if (mat[i][j] == 1) {
                        soldiers++;
                    } else {
                        break;
                    }
                }
                list.add(new int[]{i, soldiers});
            }
            Collections.sort(list, (a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
            int[] result = new int[k];
            int i = 0;
            while (i < k) {
                result[i] = list.get(i++)[0];
            }
            return result;
        }
    }
}
