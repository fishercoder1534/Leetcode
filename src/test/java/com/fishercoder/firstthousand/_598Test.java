package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._598;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _598Test {
    private _598.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _598.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(
                4,
                solution1.maxCount(
                        3,
                        3,
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[2,2],[3,3]")));
    }
}
