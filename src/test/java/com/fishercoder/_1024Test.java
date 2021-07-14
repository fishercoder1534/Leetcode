package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1024;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1024Test {
    private static _1024.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1024.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.videoStitching(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,2],[4,6],[8,10],[1,9],[1,5],[5,9]"), 10));
    }

    @Test
    public void test2() {
        assertEquals(-1, solution1.videoStitching(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[1,2]"), 5));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution1.videoStitching(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,2],[4,8]"), 5));
    }

}
