package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1476;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1476Test {
    private _1476.Solution1.SubrectangleQueries solution1;
    private static int[][] rectangle;

    @Test
    public void test1() {
        rectangle = new int[][]{
                {1, 2, 1},
                {4, 3, 4},
                {3, 2, 1},
                {1, 1, 1}
        };
        solution1 = new _1476.Solution1.SubrectangleQueries(rectangle);
        assertEquals(1, solution1.getValue(0, 2));
        solution1.updateSubrectangle(0, 0, 3, 2, 5);
        assertEquals(5, solution1.getValue(0, 2));
    }

}