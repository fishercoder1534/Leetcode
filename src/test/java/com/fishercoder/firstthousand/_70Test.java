package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._70;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _70Test {
    private static _70.Solution1 solution1;
    private static _70.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _70.Solution1();
        solution2 = new _70.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.climbStairs(3));
    }

    @Test
    public void test2() {
        assertEquals(3, solution2.climbStairs(3));
    }

    @Test
    public void test3() {
        assertEquals(13, solution1.climbStairs(6));
    }

    @Test
    public void test4() {
        assertEquals(13, solution2.climbStairs(6));
    }
}
