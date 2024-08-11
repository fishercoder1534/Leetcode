package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1399;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1399Test {
    private _1399.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1399.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.countLargestGroup(13));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.countLargestGroup(2));
    }

    @Test
    public void test3() {
        assertEquals(6, solution1.countLargestGroup(15));
    }

    @Test
    public void test4() {
        assertEquals(5, solution1.countLargestGroup(24));
    }

}
