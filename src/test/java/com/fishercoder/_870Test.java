package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1758;
import com.fishercoder.solutions._870;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _870Test {
    private static _870.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _870.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printArray(solution1.advantageCount(new int[]{2, 7, 11, 15}, new int[]{1, 10, 4, 11}));
    }

    @Test
    public void test2() {
        CommonUtils.printArray(solution1.advantageCount(new int[]{12, 24, 8, 32}, new int[]{13, 25, 32, 11}));
    }

    @Test
    public void test3() {
        CommonUtils.printArray(solution1.advantageCount(new int[]{15, 15, 4, 5, 0, 1, 7, 10, 3, 1, 10, 10, 8, 2, 3}, new int[]{4, 13, 14, 0, 14, 14, 12, 3, 15, 12, 2, 0, 6, 9, 0}));
    }

}