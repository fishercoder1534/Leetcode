package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3769;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _3769Test {
    private _3769.Solution1 solution1;
    private _3769.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _3769.Solution1();
        solution2 = new _3769.Solution2();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{8, 3, 6, 5}, solution1.sortByReflection(new int[]{3, 6, 5, 8}));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{423819}, solution1.sortByReflection(new int[]{423819}));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{869053}, solution1.sortByReflection(new int[]{869053}));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{8, 3, 6, 5}, solution2.sortByReflection(new int[]{3, 6, 5, 8}));
    }
}
