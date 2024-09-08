package com.fishercoder.firstthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.firstthousand._656;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/** Created by fishercoder on 5/25/17. */
public class _656Test {
    private _656.Solution1 solution1;
    private static int[] A;
    private static List<Integer> expected;

    @BeforeEach
    public void setup() {
        solution1 = new _656.Solution1();
    }

    @Test
    public void test1() {
        A = new int[] {1, 2, 4, -1, 2};
        expected = new ArrayList<>(Arrays.asList(1, 3, 5));
        assertEquals(expected, solution1.cheapestJump(A, 2));
    }
}
