package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3189;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3189Test {
    private _3189.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3189.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.minMoves(new int[][] {{0, 0}, {1, 0}, {1, 1}}));
    }

    @Test
    public void test2() {
        assertEquals(
                6,
                solution1.minMoves(
                        CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                                "[0,0],[0,1],[0,2],[0,3]")));
    }
}
