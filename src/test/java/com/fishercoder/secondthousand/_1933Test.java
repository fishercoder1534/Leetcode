package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1933;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1933Test {
    private _1933.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1933.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(false, solution1.isDecomposable("000111000"));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.isDecomposable("00011111222"));
    }

    @Test
    public void test3() {
        assertEquals(false, solution1.isDecomposable("011100022233"));
    }

}
