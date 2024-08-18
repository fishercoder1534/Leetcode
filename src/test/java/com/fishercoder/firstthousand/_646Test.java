package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._646;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _646Test {

    private _646.Solution1 solution1;
    private _646.Solution2 solution2;
    private static int[][] pairs;

    @BeforeEach
    public void setup() {
        solution1 = new _646.Solution1();
        solution2 = new _646.Solution2();
    }

    @Test
    public void test1() {
        pairs =
                new int[][] {
                    {1, 2},
                    {2, 3},
                    {5, 6},
                    {3, 4}
                };
        assertEquals(3, solution1.findLongestChain(pairs));
        assertEquals(3, solution2.findLongestChain(pairs));
    }

    @Test
    public void test2() {
        pairs =
                new int[][] {
                    {9, 10},
                    {-9, 9},
                    {-6, 1},
                    {-4, 1},
                    {8, 10},
                    {7, 10},
                    {9, 10},
                    {2, 10}
                };
        assertEquals(2, solution1.findLongestChain(pairs));
        assertEquals(2, solution2.findLongestChain(pairs));
    }

    @Test
    public void test3() {
        pairs =
                CommonUtils.convertLeetCodeIrregularLengths2DArrayInputIntoJavaArray(
                        "[-6,9],[1,6],[8,10],[-1,4],[-6,-2],[-9,8],[-5,3],[0,3]");
        assertEquals(3, solution1.findLongestChain(pairs));
        assertEquals(3, solution2.findLongestChain(pairs));
    }
}
