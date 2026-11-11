package com.fishercoder.fourththousand;

import com.fishercoder.solutions.fourththousand._3789;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _3789Test {
    private _3789.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _3789.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(151749951625248L, solution1.minimumCost(821890, 683746, 551184, 275316322, 167729563));
    }

}
