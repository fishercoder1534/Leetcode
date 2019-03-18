package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._417;
import org.junit.BeforeClass;
import org.junit.Test;

public class _417Test {
    private static _417.Solution1 solution1;
    private static int[][] matrix;

    @BeforeClass
    public static void setup() {
        solution1 = new _417.Solution1();
    }

    @Test
    public void test1() {
        matrix = new int[][]{
                {2, 3, 5},
                {3, 4, 4},
                {5, 3, 1},
        };
        for (int[] arr : solution1.pacificAtlantic(matrix)) {
            CommonUtils.printArray(arr);
        }
    }

    @Test
    public void test2() {
        matrix = new int[][]{
                {3, 5},
                {4, 4},
        };
        for (int[] arr : solution1.pacificAtlantic(matrix)) {
            CommonUtils.printArray(arr);
        }
    }

    @Test
    public void test3() {
        matrix = new int[][]{
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4},
        };
        for (int[] arr : solution1.pacificAtlantic(matrix)) {
            CommonUtils.printArray(arr);
        }
    }

    @Test
    public void test4() {
        matrix = new int[][]{
                {2, 3, 5},
                {3, 4, 4},
        };
        for (int[] arr : solution1.pacificAtlantic(matrix)) {
            CommonUtils.printArray(arr);
        }
    }

}
