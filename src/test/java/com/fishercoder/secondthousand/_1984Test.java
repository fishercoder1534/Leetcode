package com.fishercoder.secondthousand;

import com.fishercoder.solutions.secondthousand._1984;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _1984Test {
    private _1984.Solution1 solution1;

    @BeforeEach
    public void setup() {
        solution1 = new _1984.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(0, solution1.minimumDifference(new int[]{90}, 1));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.minimumDifference(new int[]{9,4,1,7}, 2));
    }

}
