package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1462;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1462Test {
    private _1462.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1462.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(Arrays.asList(false, true), solution1.checkIfPrerequisite(3,
                CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                        "[1,0],[2,0]"),
                CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray("[0,1],[2,0]")));
    }

    @Test
    public void test2() {
        assertEquals(Arrays.asList(true, true),
                solution1.checkIfPrerequisite(3,
                        CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                                "[1,2],[1,0],[2,0]"),
                        CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray("[1,0],[1,2]")));
    }

    @Test
    public void test3() {
        assertEquals(Arrays.asList(true, false, true, true, true, true, true, true, false, false, true, true, false, false, true, true, true, true, false, false, true, false, true, false, true, false, true, true, false, true, true, false, false, true, false, false, true, true, true, false),
                solution1.checkIfPrerequisite(7,
                        CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray(
                                "[2,3],[2,1],[2,0],[3,4],[3,6],[5,1],[5,0],[1,4],[1,0],[4,0],[0,6]"),
                        CommonUtils.convertLeetCodeRegularRectangleArrayInputIntoJavaArray("[3,0],[6,4],[5,6],[2,6],[2,3],[5,6],[4,0],[2,6],[3,5],[5,3],[1,6],[1,0],[3,5],[6,5],[2,3],[3,0],[3,4],[3,4],[2,5],[0,3],[4,0],[6,4],[5,0],[6,5],[5,6],[6,5],[1,0],[3,4],[1,5],[1,4],[3,6],[0,1],[1,2],[5,1],[5,3],[5,3],[3,4],[5,4],[5,4],[5,3]")));
    }

}
