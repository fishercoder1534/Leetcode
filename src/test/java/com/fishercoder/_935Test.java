package com.fishercoder;

import com.fishercoder.solutions._935;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _935Test {
    private static _935.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _935.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(solution1.knightDialer(1), 10);
    }

    @Test
    public void test2() {
        assertEquals(solution1.knightDialer(2), 20);
    }

    @Test
    public void test3() {
        assertEquals(solution1.knightDialer(3), 46);
    }
}
