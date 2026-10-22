package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1245;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class _1245Test {
    private _1245.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1245.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.treeDiameter(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,2]")));
    }

    @Test
    public void test2() {
        assertEquals(4, solution1.treeDiameter(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[1,2],[2,3],[1,4],[4,5]")));
    }

}
