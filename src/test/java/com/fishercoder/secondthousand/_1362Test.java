package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1362;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1362Test {
    private _1362.Solution1 solution1;

    @BeforeEach
    public void setup() {
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