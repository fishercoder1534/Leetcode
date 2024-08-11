package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1196;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1196Test {
    private _1196.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1196.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(4, solution1.maxNumberOfApples(new int[]{100, 200, 150, 1000}));
    }

    @Test
    public void test2() {
        assertEquals(5, solution1.maxNumberOfApples(new int[]{900, 950, 800, 1000, 700, 800}));
    }

}