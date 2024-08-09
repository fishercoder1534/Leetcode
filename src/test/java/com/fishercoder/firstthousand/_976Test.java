package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._976;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _976Test {

    private _976.Solution1 test;

    @BeforeEach
    public void setup() {
        test = new _976.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, test.largestPerimeter(new int[]{2, 1, 2}));
    }

    @Test
    public void test2() {
        assertEquals(0, test.largestPerimeter(new int[]{1, 2, 1}));
    }

    @Test
    public void test3() {
        assertEquals(10, test.largestPerimeter(new int[]{3, 2, 3, 4}));
    }

    @Test
    public void test4() {
        assertEquals(8, test.largestPerimeter(new int[]{3, 6, 2, 3}));
    }
}
