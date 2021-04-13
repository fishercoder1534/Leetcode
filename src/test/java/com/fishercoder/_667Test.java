package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._667;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _667Test {
    private static _667.Solutoin1 solution1;
    private static _667.Solutoin2 solution2;
    private static int[] expected;

    @BeforeClass
    public static void setup() {
        solution1 = new _667.Solutoin1();
        solution2 = new _667.Solutoin2();
    }

    @Test
    public void test1() {
        expected = new int[]{1, 2, 3};
        assertArrayEquals(expected, solution1.constructArray(3, 1));
        assertArrayEquals(expected, solution2.constructArray(3, 1));
    }

    @Test
    public void test2() {
        CommonUtils.printArray(solution1.constructArray(3, 2));
        CommonUtils.printArray(solution2.constructArray(3, 2));
    }

    @Test
    public void test3() {
        CommonUtils.printArray(solution1.constructArray(10, 4));
        CommonUtils.printArray(solution2.constructArray(10, 4));
    }

    @Test
    public void test4() {
        CommonUtils.printArray(solution1.constructArray(5, 3));
        CommonUtils.printArray(solution2.constructArray(5, 3));
    }

    @Test
    public void test5() {
        CommonUtils.printArray(solution1.constructArray(5, 2));
        CommonUtils.printArray(solution2.constructArray(5, 2));
    }

}