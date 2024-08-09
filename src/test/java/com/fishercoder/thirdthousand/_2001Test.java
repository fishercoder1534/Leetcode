package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2001;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2001Test {
    private _2001.Solution1 solution1;
    private _2001.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _2001.Solution1();
        solution2 = new _2001.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.interchangeableRectangles(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[4,8],[3,6],[10,20],[15,30]")));
        assertEquals(6, solution2.interchangeableRectangles(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[4,8],[3,6],[10,20],[15,30]")));
    }
}
