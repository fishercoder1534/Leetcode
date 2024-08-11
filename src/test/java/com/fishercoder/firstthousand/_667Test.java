package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._667;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _667Test {
    private _667.Solutoin1 solution1;
    private _667.Solutoin2 solution2;
    private static int[] expected;

    @BeforeEach
    public void setup() {
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