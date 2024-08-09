package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._870;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _870Test {
    private _870.Solution1 solution1;

    @BeforeEach
    public void setup() {
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