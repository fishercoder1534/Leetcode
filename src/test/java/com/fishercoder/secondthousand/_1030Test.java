package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1030;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1030Test {
    private _1030.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1030.Solution1();
    }

    @Test
    public void test1() {
        CommonUtils.print2DIntArray(solution1.allCellsDistOrder(1, 2, 0, 0));
    }

    @Test
    public void test2() {
        CommonUtils.print2DIntArray(solution1.allCellsDistOrder(2, 2, 0, 1));
    }

    @Test
    public void test3() {
        CommonUtils.print2DIntArray(solution1.allCellsDistOrder(2, 3, 1, 2));
    }

}