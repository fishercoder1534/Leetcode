package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.fishercoder.solutions.secondthousand._1409;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1409Test {
    private _1409.Solution1 solution1;
    private static int[] queries;

    @BeforeEach
    public void setup() {
        solution1 = new _1409.Solution1();
    }

    @Test
    public void test1() {
        queries = new int[] {3, 1, 2, 1};
        assertArrayEquals(new int[] {2, 1, 2, 1}, solution1.processQueries(queries, 5));
    }
}
