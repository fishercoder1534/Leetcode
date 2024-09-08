package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._905;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _905Test {
    private _905.Solution1 solution1;
    private static int[] A;
    private static int[] actual;

    @BeforeEach
    public void setup() {
        solution1 = new _905.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] {3, 1, 2, 4};
        actual = solution1.sortArrayByParity(A);
        CommonUtils.printArray(actual);
    }

    @Test
    public void test2() {
        A = new int[] {1, 3};
        actual = solution1.sortArrayByParity(A);
        CommonUtils.printArray(actual);
    }
}
