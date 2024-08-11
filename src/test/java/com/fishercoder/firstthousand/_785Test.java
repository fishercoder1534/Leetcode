package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._785;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _785Test {
    private _785.Solution1 solution1;
    private _785.Solution2 solution2;
    private static int[][] graph;

    @BeforeEach
    public void setup() {
        solution1 = new _785.Solution1();
        solution2 = new _785.Solution2();
        graph = new int[][]{};
    }

    @Test
    public void test1() {
        graph = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2,3],[0,2],[0,1,3],[0,2]");
        CommonUtils.print2DIntArray(graph);
        assertFalse(solution1.isBipartite(graph));
        assertFalse(solution2.isBipartite(graph));
    }

    @Test
    public void test2() {
        graph = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,3],[0,2],[1,3],[0,2]");
        CommonUtils.print2DIntArray(graph);
        assertTrue(solution1.isBipartite(graph));
        assertTrue(solution2.isBipartite(graph));
    }
}
