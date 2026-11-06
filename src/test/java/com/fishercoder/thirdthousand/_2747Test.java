package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2747;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _2747Test {
    private _2747.Solution1 solution1;
    private _2747.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _2747.Solution1();
        solution2 = new _2747.Solution2();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[]{1, 2}, solution1.countServers(3,
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,3],[2,6],[1,5]"),
                        5, new int[]{10, 11}));
    }

    @Test
    public void test2() {
        assertArrayEquals(
                new int[]{2, 3, 3, 3}, solution1.countServers(4,
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,30],[2,5],[3,9],[4,21]"),
                        9, new int[]{11, 28, 16, 18}));
    }

    @Test
    public void test3() {
        assertArrayEquals(
                new int[]{2, 3, 3, 3}, solution2.countServers(4,
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,30],[2,5],[3,9],[4,21]"),
                        9, new int[]{11, 28, 16, 18}));
    }
}
