package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1834;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1834Test {
    private _1834.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1834.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {0, 2, 3, 1},
                solution1.getOrder(
                        CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                                "[1,2],[2,4],[3,2],[4,1]")));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new int[] {4, 3, 2, 0, 1},
                solution1.getOrder(
                        CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                                "[7,10],[7,12],[7,5],[7,4],[7,2]")));
    }
}
