package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1974;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1974Test {
    private _1974.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1974.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(5, solution1.minTimeToType("abc"));
    }

    @Test
    public void test2() {
        assertEquals(7, solution1.minTimeToType("bza"));
    }

    @Test
    public void test3() {
        assertEquals(34, solution1.minTimeToType("zjpc"));
    }
}
