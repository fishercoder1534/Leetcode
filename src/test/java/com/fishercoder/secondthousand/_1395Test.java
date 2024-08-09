package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1395;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1395Test {
    private _1395.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1395.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(3, solution1.numTeams(new int[]{2, 5, 3, 4, 1}));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.numTeams(new int[]{2, 1, 3}));
    }

    @Test
    public void test3() {
        assertEquals(4, solution1.numTeams(new int[]{1, 2, 3, 4}));
    }

}
