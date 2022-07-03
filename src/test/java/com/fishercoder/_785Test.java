package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._785;
import org.junit.BeforeClass;
import org.junit.Test;

public class _785Test {
    private static _785.Solution1 solution1;
    private static int[][] graph;

    @BeforeClass
    public static void setup() {
        solution1 = new _785.Solution1();
        graph = new int[][]{};
    }

    @Test
    public void test1() {
        graph = CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray("[1,2,3],[0,2],[0,1,3],[0,2]");
        CommonUtils.print2DIntArray(graph);
        solution1.isBipartite(graph);
    }
}
