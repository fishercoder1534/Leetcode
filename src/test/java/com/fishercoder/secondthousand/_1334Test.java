package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1334;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class _1334Test {
    private static _1334.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1334.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.findTheCity(4,
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1,3],[1,2,1],[1,3,4],[2,3,1]"),
                4));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.findTheCity(6,
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1,10],[0,2,1],[2,3,1],[1,3,1],[1,4,1],[4,5,10]"),
                20));
    }


}
