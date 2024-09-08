package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2050;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2050Test {
    private _2050.Solution1 solution1;
    private static int[][] relation;
    private static int[] time;
    private static int n;
    private static int expected;

    @BeforeEach
    public void setup() {
        solution1 = new _2050.Solution1();
    }

    @Test
    public void test1() {
        n = 3;
        relation =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,3],[2,3]");
        time = new int[] {3, 2, 5};
        expected = 8;
        assertEquals(expected, solution1.minimumTime(n, relation, time));
    }

    @Test
    public void test2() {
        n = 5;
        relation =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[1,5],[2,5],[3,5],[3,4],[4,5]");
        time = new int[] {1, 2, 3, 4, 5};
        expected = 12;
        assertEquals(expected, solution1.minimumTime(n, relation, time));
    }
}
