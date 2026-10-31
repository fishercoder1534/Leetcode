package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2658;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2658Test {
    private _2658.Solution1 solution1;
    private _2658.Solution2 solution2;
    private _2658.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _2658.Solution1();
        solution2 = new _2658.Solution2();
        solution3 = new _2658.Solution3();
    }

    @Test
    public void test1() {
        assertEquals(7, solution1.findMaxFish(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,2,1,0],[4,0,0,3],[1,0,0,4],[0,3,2,0]")));
    }

    @Test
    public void test2() {
        assertEquals(7, solution2.findMaxFish(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,2,1,0],[4,0,0,3],[1,0,0,4],[0,3,2,0]")));
    }

    @Test
    public void test3() {
        assertEquals(17, solution2.findMaxFish(new int[][]{{6, 1, 10}}));
    }

    @Test
    public void test4() {
        assertEquals(22, solution2.findMaxFish(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[8,6],[2,6]")));
    }

    @Test
    public void test5() {
        assertEquals(22, solution3.findMaxFish(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[8,6],[2,6]")));
    }

}
