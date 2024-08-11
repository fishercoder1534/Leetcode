package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1394;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1394Test {

    private _1394.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1394.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.findLucky(new int[]{2, 2, 3, 4}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.findLucky(new int[]{1, 2, 2, 3, 3, 3}));
    }

    @Test
    public void test3() {
        assertEquals(-1, solution1.findLucky(new int[]{2, 2, 2, 3, 3}));
    }

    @Test
    public void test4() {
        assertEquals(-1, solution1.findLucky(new int[]{5}));
    }


}