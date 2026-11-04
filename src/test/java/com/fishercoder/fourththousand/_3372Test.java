package com.fishercoder.fourththousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.fourththousand._3372;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3372Test {
    private _3372.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3372.Solution1();
    }

    @Test
    public void test1() {
        int[][] edges1 = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,2],[2,3],[2,4]");
        int[][] edges2 = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[0,1],[0,2],[0,3],[2,7],[1,4],[4,5],[4,6]");
        Assertions.assertArrayEquals(new int[]{9, 7, 9, 8, 8}, solution1.maxTargetNodes(edges1, edges2, 2));
    }
}
