package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1391;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _1391Test {
    private _1391.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1391.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.hasValidPath(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[2,4,3],[6,5,2]")));
    }

    @Test
    public void test2() {
        assertFalse(solution1.hasValidPath(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2,1],[1,2,1]")));
    }

    @Test
    public void test3() {
        assertFalse(solution1.hasValidPath(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,1,2]")));
    }

    @Test
    public void test4() {
        assertTrue(solution1.hasValidPath(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[5]")));
    }

    @Test
    public void test5() {
        assertTrue(solution1.hasValidPath(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[4,1,3,1],[2,2,4,3],[2,4,5,2],[2,2,2,2],[6,5,2,2]")));
    }
}
