package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1545;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1545Test {
    private _1545.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1545.Solution1();
    }

    @Test
    public void test1() {
        assertEquals('0', solution1.findKthBit(3, 1));
    }

    @Test
    public void test2() {
        assertEquals('1', solution1.findKthBit(4, 11));
    }

    @Test
    public void test3() {
        assertEquals('0', solution1.findKthBit(1, 1));
    }

    @Test
    public void test4() {
        assertEquals('1', solution1.findKthBit(2, 3));
    }

}