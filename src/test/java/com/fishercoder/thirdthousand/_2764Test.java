package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2764;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class _2764Test {
    private _2764.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2764.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.isPreorder(Arrays.asList(Arrays.asList(0, -1), Arrays.asList(1, 0), Arrays.asList(2, 0), Arrays.asList(3, 2), Arrays.asList(4, 2))));
    }

    @Test
    public void test2() {
        assertTrue(solution1.isPreorder(Arrays.asList(Arrays.asList(1, -1), Arrays.asList(2, 1), Arrays.asList(3, 2))));
    }

    @Test
    public void test3() {
        assertFalse(solution1.isPreorder(Arrays.asList(Arrays.asList(2, 1), Arrays.asList(3, 2), Arrays.asList(1, -1))));
    }
}
