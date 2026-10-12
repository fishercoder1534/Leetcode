package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3493;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3493Test {
    private _3493.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3493.Solution1();
    }

    @Test
    public void test1() {
        int[][] properties = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2],[1,1],[3,4],[4,5],[5,6],[7,7]");
        assertEquals(3, solution1.numberOfComponents(properties, 1));
    }

    @Test
    public void test2() {
        int[][] properties = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2,3],[2,3,4],[4,3,5]");
        assertEquals(1, solution1.numberOfComponents(properties, 2));
    }

    @Test
    public void test3() {
        int[][] properties = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,1],[1,1]");
        assertEquals(2, solution1.numberOfComponents(properties, 2));
    }

    @Test
    public void test4() {
        int[][] properties = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,1,2,3,4,2],[2,1,3,1,4,4],[3,4,5,3,2,2],[4,2,4,3,3,4],[3,1,4,4,5,3],[1,4,1,3,3,1],[2,5,5,4,3,2],[1,1,2,1,5,2],[5,5,3,3,1,2]");
        assertEquals(1, solution1.numberOfComponents(properties, 3));
    }

}
