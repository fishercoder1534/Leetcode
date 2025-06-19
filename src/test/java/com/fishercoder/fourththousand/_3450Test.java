package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3450;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3450Test {
    private _3450.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3450.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                3,
                solution1.maxStudentsOnBench(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[1,2],[2,2],[3,3],[1,3],[2,3]")));
    }
}
