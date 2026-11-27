package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1559;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _1559Test {
    private _1559.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1559.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.containsCycle(CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray("[\"a\",\"a\",\"a\",\"a\"],[\"a\",\"b\",\"b\",\"a\"],[\"a\",\"b\",\"b\",\"a\"],[\"a\",\"a\",\"a\",\"a\"]")));
    }

    @Test
    public void test2() {
        assertTrue(solution1.containsCycle(CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray("[\"c\",\"c\",\"c\",\"a\"],[\"c\",\"d\",\"c\",\"c\"],[\"c\",\"c\",\"e\",\"c\"],[\"f\",\"c\",\"c\",\"c\"]")));
    }

    @Test
    public void test3() {
        assertFalse(solution1.containsCycle(CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray("[\"a\",\"b\",\"b\"],[\"b\",\"z\",\"b\"],[\"b\",\"b\",\"a\"]")));
    }

    @Test
    public void test4() {
        assertTrue(solution1.containsCycle(CommonUtils.convertLeetCodeRegular2DCharArrayInputIntoJavaArray("[\"c\",\"a\",\"d\"],[\"a\",\"a\",\"a\"],[\"a\",\"a\",\"d\"],[\"a\",\"c\",\"d\"],[\"a\",\"b\",\"c\"]")));
    }
}
