package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._349;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _349Test {
    private _349.Solution1 solution1;
    private _349.Solution2 solution2;
    private _349.Solution3 solution3;

    @BeforeEach
    public void setup() {
        solution1 = new _349.Solution1();
        solution2 = new _349.Solution2();
        solution3 = new _349.Solution3();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{2}, solution1.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{2}, solution2.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{2}, solution3.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }
}
