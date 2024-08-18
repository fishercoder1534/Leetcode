package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3243;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3243Test {
    private _3243.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3243.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {3, 2, 1},
                solution1.shortestDistanceAfterQueries(
                        5,
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[2,4],[0,2],[0,4]")));
    }
}
