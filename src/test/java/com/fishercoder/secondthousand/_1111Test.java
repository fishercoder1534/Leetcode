package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1111;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _1111Test {
    private _1111.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1111.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{1, 0, 0, 0, 0, 1}, solution1.maxDepthAfterSplit("(()())"));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{1, 1, 1, 0, 0, 1, 1, 1}, solution1.maxDepthAfterSplit("()(())()"));
    }

}
