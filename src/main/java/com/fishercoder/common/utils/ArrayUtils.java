package com.fishercoder.common.utils;

import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public static List<List<Integer>> buildList(int[][] nums) {
        List<List<Integer>> result = new ArrayList<>(nums.length);
        int row = nums.length;
        int col = nums[0].length;
        for (int i = 0; i < row; i++) {
            List<Integer> thisRow = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                thisRow.add(nums[i][j]);
            }
            result.add(thisRow);
        }
        return result;
    }
}
