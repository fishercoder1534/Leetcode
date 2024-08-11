package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2682;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _2682Test {
    private _2682.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2682.Solution1();
    }

    @Test
    public void test1() {
        assertArrayEquals(new int[]{4, 5}, solution1.circularGameLosers(5, 2));
    }

    @Test
    public void test2() {
        assertArrayEquals(new int[]{}, solution1.circularGameLosers(2, 1));
    }

    @Test
    public void test3() {
        assertArrayEquals(new int[]{3}, solution1.circularGameLosers(3, 1));
    }

    @Test
    public void test4() {
        assertArrayEquals(new int[]{2}, solution1.circularGameLosers(3, 2));
    }

    @Test
    public void test5() {
        assertArrayEquals(new int[]{2, 3}, solution1.circularGameLosers(5, 3));
    }
}
