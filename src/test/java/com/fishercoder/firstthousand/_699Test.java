package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._699;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _699Test {
    private _699.Solution1 solution1;
    private static int[][] positions;

    @BeforeEach
    public void setup() {
        solution1 = new _699.Solution1();
    }

    @Test
    public void test1() {
        positions =
                new int[][] {
                    {1, 2},
                    {2, 3},
                    {6, 1}
                };
        assertEquals(Arrays.asList(2, 5, 5), solution1.fallingSquares(positions));
    }
}
