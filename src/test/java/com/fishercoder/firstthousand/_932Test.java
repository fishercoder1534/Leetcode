package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._932;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _932Test {
    private _932.Solution1 solution1;

    @BeforeEach
    public void setUp() {
        solution1 = new _932.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 3, 2, 4}, solution1.beautifulArray(4));
    }
}
