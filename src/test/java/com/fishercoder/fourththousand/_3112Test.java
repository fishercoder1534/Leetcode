package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3112;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3112Test {
    private _3112.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3112.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(
                new int[] {0, -1, 4},
                solution1.minimumTime(
                        3,
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,1,2],[1,2,1],[0,2,4]"),
                        new int[] {1, 1, 5}));
    }
}
