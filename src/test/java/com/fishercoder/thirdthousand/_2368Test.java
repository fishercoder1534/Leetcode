package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2368;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2368Test {
    private _2368.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2368.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.reachableNodes(7, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[1,2],[3,1],[4,0],[0,5],[5,6]"), new int[]{4, 5}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.reachableNodes(7, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,2],[0,5],[0,4],[3,2],[6,5]"), new int[]{4, 2, 1}));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.reachableNodes(10, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[8,2],[2,5],[5,0],[2,7],[1,7],[3,8],[0,4],[3,9],[1,6]"), new int[]{9, 8, 4, 5, 3, 1}));
    }

    @Test
    public void test4() {
        assertEquals(4, solution1.reachableNodes(5, CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,3],[2,0],[4,3],[1,2]"), new int[]{1}));
    }
}
