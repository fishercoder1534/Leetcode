package com.fishercoder.thirdthousand;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.fishercoder.solutions.thirdthousand._2591;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _2591Test {
    private _2591.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _2591.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.distMoney(13, 3));
    }

    @Test
    public void test2() {
        assertEquals(1, solution1.distMoney(17, 2));
    }

    @Test
    public void test3() {
        assertEquals(1, solution1.distMoney(20, 3));
    }

    @Test
    public void test4() {
        assertEquals(2, solution1.distMoney(16, 2));
    }
}
