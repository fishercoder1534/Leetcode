package com.fishercoder.thirdthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.thirdthousand._2946;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class _2946Test {
    private static _2946.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2946.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.areSimilar(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2,1,2],[5,5,5,5],[6,3,6,3]"), 2));
    }

    @Test
    public void test2() {
        assertTrue(solution1.areSimilar(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[3,10,3,10,3,10,3,10],[5,8,5,8,5,8,5,8],[3,9,3,9,3,9,3,9],[3,8,3,8,3,8,3,8],[2,3,2,3,2,3,2,3]"), 2));
    }

    @Test
    public void test3() {
        assertTrue(solution1.areSimilar(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[9,5,3,10],[4,7,10,7],[1,7,9,4],[8,8,1,6],[6,7,6,1],[3,1,1,8],[9,2,8,3],[1,9,7,6]"), 4));
    }

    @Test
    public void test4() {
        assertTrue(solution1.areSimilar(CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[9,1,8,9,2,9,1,8,9,2],[10,2,7,8,9,10,2,7,8,9],[7,6,6,9,5,7,6,6,9,5]"), 5));
    }

}
