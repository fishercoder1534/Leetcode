package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2070;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2070Test {
    private _2070.Solution1 solution1;
    private static int[][] items;
    private static int[] queries;
    private static int[] expected;

    @BeforeEach
    public void setup() {
        solution1 = new _2070.Solution1();
    }

    @Test
    public void test1() {
        items =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[3,2],[2,4],[5,6],[3,5]");
        queries = new int[] {1, 2, 3, 4, 5, 6};
        expected = new int[] {2, 4, 5, 5, 6, 6};
        assertArrayEquals(expected, solution1.maximumBeauty(items, queries));
    }

    @Test
    public void test2() {
        items =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,2],[1,2],[1,3],[1,4]");
        queries = new int[] {1};
        expected = new int[] {4};
        assertArrayEquals(expected, solution1.maximumBeauty(items, queries));
    }

    @Test
    public void test3() {
        items = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[10,1000]");
        queries = new int[] {5};
        expected = new int[] {0};
        assertArrayEquals(expected, solution1.maximumBeauty(items, queries));
    }
}
