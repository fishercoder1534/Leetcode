package com.fishercoder.secondthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.secondthousand._1615;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1615Test {
    private _1615.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1615.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maximalNetworkRank(4, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,3],[1,2],[1,3]")));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.maximalNetworkRank(8, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[1,2],[2,3],[2,4],[5,6],[5,7]")));
    }

}