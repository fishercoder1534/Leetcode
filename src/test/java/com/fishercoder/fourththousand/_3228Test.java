package com.fishercoder.fourththousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.fourththousand._3228;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _3228Test {
    private _3228.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3228.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maxOperations("1001101"));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.maxOperations("00111"));
    }

    @Test
    public void test3() {
        assertEquals(2, solution1.maxOperations("110"));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.maxOperations("0010000111"));
    }

    @Test
    public void test5() {
        assertEquals(5, solution1.maxOperations("11000100001"));
    }

    @Test
    public void test6() {
        assertEquals(10, solution1.maxOperations("111101100"));
    }

    @Test
    public void test7() {
        assertEquals(4, solution1.maxOperations("0101100000"));
    }
}
