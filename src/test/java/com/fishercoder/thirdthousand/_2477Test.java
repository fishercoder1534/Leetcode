package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2477;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2477Test {
    private _2477.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2477.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minimumFuelCost(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,2],[0,3]"), 5));
    }

    @Test
    public void test2() {
        assertEquals(7, solution1.minimumFuelCost(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[3,1],[3,2],[1,0],[0,4],[0,5],[4,6]"), 2));
    }

}
