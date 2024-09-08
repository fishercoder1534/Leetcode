package com.fishercoder.secondthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.secondthousand._1056;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _1056Test {
    private _1056.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1056.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(true, solution1.confusingNumber(6));
    }

    @Test
    public void test2() {
        assertEquals(true, solution1.confusingNumber(89));
    }

    @Test
    public void test3() {
        assertEquals(false, solution1.confusingNumber(11));
    }

    @Test
    public void test4() {
        assertEquals(false, solution1.confusingNumber(25));
    }
}
