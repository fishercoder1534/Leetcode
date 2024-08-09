package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._849;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _849Test {

    private _849.Solution1 solution1;
    private _849.Solution2 solution2;

    @BeforeEach
    public void setup() {
        solution1 = new _849.Solution1();
        solution2 = new _849.Solution2();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
        assertEquals(2, solution2.maxDistToClosest(new int[]{1, 0, 0, 0, 1, 0, 1}));
    }

    @Test
    public void test2() {
        assertEquals(3, solution1.maxDistToClosest(new int[]{1, 0, 0, 0}));
        assertEquals(3, solution2.maxDistToClosest(new int[]{1, 0, 0, 0}));
    }
}
