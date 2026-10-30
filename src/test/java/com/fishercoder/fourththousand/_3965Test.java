package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3965;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3965Test {
    private _3965.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3965.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(18, solution1.finishTime(4, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,2],[2,3]"), new int[]{5, 8, 2, 1}));
    }

}
