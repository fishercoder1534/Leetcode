package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._1362;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _1362Test {
    private static _1362.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1362.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.printArray(solution1.closestDivisors(8));
    }

    @Test
    public void test2() {
        CommonUtils.printArray(solution1.closestDivisors(123));
    }

    @Test
    public void test3() {
        CommonUtils.printArray(solution1.closestDivisors(999));
    }

}