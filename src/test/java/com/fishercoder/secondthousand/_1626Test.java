package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1626;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1626Test {
    private _1626.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1626.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(6, solution1.bestTeamScore(new int[]{1, 2, 3, 5}, new int[]{8, 9, 10, 1}));
    }

    @Test
    public void test2() {
        assertEquals(34, solution1.bestTeamScore(new int[]{1, 3, 5, 10, 15}, new int[]{1, 2, 3, 4, 5}));
    }

}