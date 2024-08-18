package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.firstthousand._566;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 4/29/17. */
public class _566Test {
    private _566.Solution1 solution1;
    private _566.Solution2 solution2;
    private static int[][] expected;
    private static int[][] actual;
    private static int[][] nums;
    private static int r;
    private static int c;

    @BeforeEach
    public void setup() {
        solution1 = new _566.Solution1();
        solution2 = new _566.Solution2();
    }

    @Test
    public void test1() {
        nums =
                new int[][] {
                    {1, 2},
                    {3, 4},
                };
        r = 1;
        c = 4;
        expected = new int[][] {{1, 2, 3, 4}};
        actual = solution1.matrixReshape(nums, r, c);
        assertArrayEquals(expected, actual);
        actual = solution2.matrixReshape(nums, r, c);
        assertArrayEquals(expected, actual);
    }
}
