package com.fishercoder.thirdthousand;

import com.fishercoder.solutions.thirdthousand._2914;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _2914Test {
    private _2914.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2914.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.minChanges("1001"));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.minChanges("10"));
    }

    @Test
    public void test3() {
        assertEquals(0, solution1.minChanges("0000"));
    }

    @Test
    public void test4() {
        assertEquals(5, solution1.minChanges("0110010110"));
    }

    @Test
    public void test5() {
        assertEquals(1, solution1.minChanges("11000111"));
    }

}
