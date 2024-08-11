package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._935;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _935Test {
    private _935.Solution1 solution1;

    @BeforeEach
    public void setup() {
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
